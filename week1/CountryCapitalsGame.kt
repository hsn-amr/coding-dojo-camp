import kotlin.random.Random

class Country(inputName:String, inputCapital: String){
    var name = ""
    var capital = ""

    init {
        this.name = inputName
        this.capital = inputCapital
    }

    fun printInfo(){
        println("${this.capital} is the capital of ${this.name}")
    }
}

fun main(){
    var score = 0
    var count = 0
    var limit = 3
    val countries = listOf(Country("KSA", "Riyadh"), Country("Kuwait", "Kuwait"),
        Country("Jordan", "Amman"), Country("Qatar", "Doha"),
        Country("UAE", "Abu Dhabi"), Country("bahrain", "Manama"),
        Country("Oman", "Muscat"), Country("Egypt", "Cairo"),
        Country("Morocco", "Rabat"), Country("Iraq", "Baghdad"))
    val countriesUsed = arrayListOf<String>()

    var wantContinue = "y"
    while(wantContinue == "y"){

        var country = countries[Random.nextInt(0, countries.size)]
        if(!countriesUsed.contains(country.name)){
            countriesUsed.add(country.name)
            print("What is the capital of ${country.name}? ")
            var capital = readLine()!!
            if(capital == country.capital){
                println("Correct")
                score++
            }else{
                println("Wrong")
                country.printInfo()
            }
        }else{
            continue
        }

        count++
        if(count >= limit){
            println("The final score out of 3 is $score")
            score = 0
            count = 0
            countriesUsed.clear()
            print("Would you like to play again? (y/n) >> ")
            wantContinue = readLine()!!
        }

    }
    println("Exiting...")
}