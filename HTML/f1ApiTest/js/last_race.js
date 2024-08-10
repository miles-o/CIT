const p1 = document.getElementById("p1");
const p2 = document.getElementById("p2");
const p3 = document.getElementById("p3");
const track_name = document.getElementById("track_name");
const url1 = 'https://api-formula-1.p.rapidapi.com/races?last=1';

const options = {
	method: 'GET',
	headers: {
		'x-rapidapi-key': '40102f54a2msh4051040ccadbaf6p144a91jsn689ee7b24a8b',
		'x-rapidapi-host': 'api-formula-1.p.rapidapi.com'
	}
};

fetch(url1, options)
.then((answer) => {
	return answer.json();
    
})
.then((answer)=>{
	track_name.textContent = answer.response[0].circuit.name;
	return url2 = 'https://api-formula-1.p.rapidapi.com/rankings/races?race=' + answer.response[0].id;
})
.then((url2) => {
	fetch(url2, options)
	.then((answer) => {
		return answer.json();
	})
	.then((json) => {
		p1.textContent = "P1: " + json.response[0].driver.name;
		p2.textContent = "P2: " + json.response[1].driver.name;
		p3.textContent = "P3: " + json.response[2].driver.name;
	})
})

