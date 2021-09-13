function greet(person, time){
    if(person == "Count Dooku"){
        console.log("I'm coming for you, Dooku!");
    }else{
        if(time != undefined){
            console.log("Good day, ", person, ",Time:", time);
        }else{
            console.log("Good day, ", person);
        }
    }
}

greet("Hassan");

greet("Hassan", "10:15");

greet("Count Dooku");