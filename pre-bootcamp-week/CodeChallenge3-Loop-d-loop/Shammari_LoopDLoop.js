/*
    How do we know we need a loop here? because we noticed there is iteration which is pops out a piece of candy
    What's the starting point of the loop? when runner reaches first 2 miles
    When should the loop stop? if runner reaches 6 miles
    How will it know to stop? if miles >= 6 miles
    What's the incrementing for each iteration of the loop? by 1 mile
    What variables do we need? miles, limit and speed
*/

var limit = 6;
var miles;
var speed;

for(miles = 1; miles<limit; miles++){
    if(miles%2 == 0){
        console.log("pop out a piece of candy");
    }
}

//Stretch Feature 1----------------------------------
for(miles = 1; miles<limit; miles++){
    if(speed > 5.5 || miles%2 == 0){
        console.log("pop out a piece of candy");
    }
}
