fun main(){
    val countryAndCapitals = mutableMapOf<String, String>()
    val limit = 3
    var i = 0
    println("Enter 3 pairs of country and its capital:")
    while(i < limit){
        print("Enter a country: ")
        var country = readLine()!!

        print("Enter its capital: ")
        var capital = readLine()!!
        if(!country.isEmpty() && !capital.isEmpty()){
            countryAndCapitals[country] = capital
            i++
        }else{
            println("Please, don't leave it empty")
            continue
        }
    }

    for ((key, value) in countryAndCapitals) {
        println("$key, its capital is $value")
    }
}
