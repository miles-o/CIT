function getSessionTime(session, currentEvent) {
    // let tempString = currentEvent.get(session).time;
    // tempString = tempString.split('+');
    let sessionTime = new Date(currentEvent.get(session).date);
    return sessionTime.toLocaleTimeString("en-AU") + " " + sessionTime.toLocaleDateString("en-AU");
}

function createRaceTile(row, compId, events) {
    let currentEvent = events.get(compId);

    const raceTile = document.createElement("div");
    raceTile.className = "race-tile";

    const raceTileInfo = document.createElement("div");
    raceTileInfo.className = "race-tile-info";

    const trackName = document.createElement("h4");
    trackName.className = "track-name";
    trackName.innerText = currentEvent.get("Race").circuit.name;

    const horizontalContent = document.createElement("div");
    horizontalContent.className = "horizontal-content";

    const verticalContent1 = document.createElement("div");
    verticalContent1.className = "vertical-content";

    const p1 = document.createElement("p");
    p1.className = "p1";
    p1.innerText = "P1: " + getSessionTime("1st Practice", currentEvent);

    const p2 = document.createElement("p");
    p2.className = "p2";
    p2.innerText = "P2: " + getSessionTime("2nd Practice", currentEvent);

    const p3 = document.createElement("p");
    p3.className = "p3";
    p3.innerText = "P3: " + getSessionTime("3rd Practice", currentEvent);

    const verticalContent2 = document.createElement("div");
    verticalContent2.className = "vertical-content";

    const quali = document.createElement("p");
    quali.className = "quali";
    quali.innerText = "Quali: " + getSessionTime("1st Qualifying", currentEvent);

    const race = document.createElement("p");
    race.className = "race";
    race.innerText = "Race: " + getSessionTime("Race", currentEvent);

    raceTile.appendChild(raceTileInfo);
    raceTileInfo.appendChild(trackName);
    raceTileInfo.appendChild(horizontalContent);
    horizontalContent.appendChild(verticalContent1);
    horizontalContent.appendChild(verticalContent2);
    verticalContent1.appendChild(p1);
    verticalContent1.appendChild(p2);
    verticalContent1.appendChild(p3);
    verticalContent2.appendChild(quali);
    verticalContent2.appendChild(race);
    const rowId = "row-"+row;
    const element = document.getElementById(rowId);
    element.appendChild(raceTile);
}

const url1 = 'https://api-formula-1.p.rapidapi.com/races?season=2024';

const options = {
    method: 'GET',
    headers: {
        'x-rapidapi-key': '',
        'x-rapidapi-host': 'api-formula-1.p.rapidapi.com'
    }
};

let compIds = new Map();

fetch(url1, options)
    .then((answer) => {
        return answer.json();
    })
    .then((answer) => {

        let events = new Map();
        for (let i = 0; i < answer.response.length; i++) {
            let compId = answer.response[i].competition.id;
            let type = answer.response[i].type;

            let tempEvent = new Map();
            if (events.get(compId) !== undefined) {
                tempEvent = events.get(compId);
            }
            tempEvent.set(String(type), answer.response[i]);
            events.set(compId, tempEvent);
        }

        let row = 1;
        let col = 0;
        let keys = events.keys();
        for (let i = 0; i < events.size; i++) {
            let compId = keys.next();
            if (col < 3) {
                createRaceTile(row, compId.value, events);
                col++;
            } else {
                col = 1;
                row++;
                const newRow = document.createElement("div");
                newRow.className = "horizontal-content";
                newRow.id = "row-" + row;
                const element = document.getElementById("tile-holder");
                element.appendChild(newRow);
                createRaceTile(row, compId.value, events);
            }

        }
    })