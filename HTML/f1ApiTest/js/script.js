const verseChoose = document.querySelector("button")
const poemDisplay = document.querySelector("pre");

verseChoose.addEventListener("click", () => {
    updateDisplay();
  });

function updateDisplay() {
    fetch('https://api.openf1.org/v1/car_data?driver_number=55&session_key=9159&speed>=315') 
    .then((response) => {
        if (!response.ok) {
            throw new error(`HTTP error: ${response.status}`);
        }
        return response.json();
    })
    .then((text) => {
        console.log(text)
        full_name = text[0].full_name
        
        console.log(full_name)
        poemDisplay.textContent = full_name;
    })
    .catch((error) => {
        poemDisplay.textContent = `could not fetch verse: ${error}`
    })
}
