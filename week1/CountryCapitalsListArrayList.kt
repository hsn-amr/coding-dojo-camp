fun main(){
    val countries = listOf("KSA", "Jordan", "Kuwait")
    val capitals = arrayListOf<String>()

    println("Enter the the capital of each country:")
    for (country in countries){
        print("$country: ")
        capitals.add(readLine()!!)
    }

    for (i in 0..countries.size-1){
        println(capitals[i] + " is capital of " + countries[i])
    }
}