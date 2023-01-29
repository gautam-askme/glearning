const api = {
    key:'7e3f21edee540e6110af347b55eb1ab2',
    base:'https://api.openweathermap.org/data/2.5/weather'
}

const searchBox = document.querySelector('.search-box');
searchBox.addEventListener('keypress',setQuery);

function setQuery(evt){
    if( evt.keyCode == 13 ){
        getResults(searchBox.value);
    }
}

function getResults( query ){
    const URL = api.base+'?q='+query+'&appid='+api.key+'&units=metric';
    let weather = fetch(URL)
    .then((response) => {
        response.json().then((weather) => {
            displayResults( weather ) ;
        })
        
    })
}

function displayResults( obj ){
    document.getElementById('city').innerHTML       =   obj.name+', '+obj.sys.country;
    document.getElementById('date').innerHTML       =   dateFormat(obj.dt);
    document.getElementById('temp').innerHTML       =   parseInt(obj.main.temp);
    document.getElementById('desc').innerHTML       =   obj.weather[0].main;
    document.getElementById('mintemp').innerHTML    =   parseInt(obj.main.temp_min);
    document.getElementById('maxtemp').innerHTML    =   parseInt(obj.main.temp_max);
    const weatherResult = document.getElementById('weather-result');
    weatherResult.style.display = 'block';

}

function dateFormat( dt ){
    var dateFormat  = new Date();
    const weekday   = ["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"];
    const months    = ["January","February","March","April","May","June","July","August","September","October","November","December"];

    let day         = weekday[dateFormat.getDay()];
    let month       = months[dateFormat.getMonth()]; 
    return day+' '+dateFormat.getDate()+' '+month+' '+dateFormat.getFullYear() ; 
}