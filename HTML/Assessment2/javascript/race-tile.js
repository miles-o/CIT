function createRaceTile(row, compId) {
    const raceTile = document.createElement("div");
    raceTile.className = "race-tile";

    const raceTileInfo = document.createElement("div");
    raceTileInfo.className = "race-tile-info";

    const trackName = document.createElement("h4");
    trackName.className = "track-name";
    trackName.innerText = "Track name";

    const horizontalContent = document.createElement("div");
    horizontalContent.className = "horizontal-content";

    const verticalContent1 = document.createElement("div");
    verticalContent1.className = "vertical-content";

    const p1 = document.createElement("p");
    p1.className = "p1";
    p1.innerText = "P1: ";

    const p2 = document.createElement("p");
    p2.className = "p2";
    p2.innerText = "P2: ";

    const p3 = document.createElement("p");
    p3.className = "p3";
    p3.innerText = "P3: ";

    const verticalContent2 = document.createElement("div");
    verticalContent2.className = "vertical-content";

    const quali = document.createElement("p");
    quali.className = "quali";
    quali.innerText = "Quali: ";

    const race = document.createElement("p");
    race.className = "race";
    race.innerText = "Race: ";

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
        console.log(answer);
        let events = new Map();
        for (let i = 0; i < answer.response.length; i++) {
            let compId = answer.response[i].competition.id;
            let type = answer.response[i].type;

            let tempEvent = new Map();
            if (events.get(compId) !== undefined) {
                tempEvent = events.get(compId);
            }
            tempEvent.set(type, answer.response[i]);

            events.set(compId, tempEvent);
        }
        console.log(events);
        let row = 1;
        let col = 0;
        for (let i = 0; i < compIds.length; i++) {
            if (col < 3) {
                createRaceTile(row, compIds[i]);
                col++;
            } else {
                col = 1;
                row++;
                console.log(row);
                const newRow = document.createElement("div");
                newRow.className = "horizontal-content";
                newRow.id = "row-" + row;
                const element = document.getElementById("tile-holder");
                element.appendChild(newRow);
                createRaceTile(row, compIds[i]);
            }

        }
    })