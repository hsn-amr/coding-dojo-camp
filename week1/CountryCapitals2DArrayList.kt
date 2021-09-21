
fun main(){
    val countryAndCapital = arrayListOf(arrayListOf("Country", "Capital"))

    println("Enter a country and capital")
    for (i in 1..3){
        print("Country: ")
        var country = readLine()!!

        print("Capital: ")
        var capital = readLine()!!

        countryAndCapital.add(arrayListOf(country, capital))
    }

    for (i in 1..3){
        for (j in 0..0){
            println(countryAndCapital[i][j] + ", its capital is " + countryAndCapital[i][j+1])
        }
    }

}