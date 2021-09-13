//tall: the tall of rider must be at least 52 inches
//age: the age must be at least over 10 years

function checkTellAndAge(tall, age){
    // here tall and age are required
    if(tall > 52 && age > 10){
        console.log("Get on that ride, kiddo!");
    }else{
        console.log("Sorry kiddo. Maybe next year.");
    }
}

var tall = 50;
var age = 9;
checkTellAndAge(tall, age); // output: Sorry kiddo. Maybe next year.

tall = 55;
checkTellAndAge(tall, age); // output: Sorry kiddo. Maybe next year.

tall = 50;
age = 12;
checkTellAndAge(tall, age); // output: Sorry kiddo. Maybe next year.

tall = 55;
age = 11;
checkTellAndAge(tall, age); // output: Get on that ride, kiddo!

