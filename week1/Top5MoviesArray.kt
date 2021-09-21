fun main(){
    val topMovies = arrayOf("","","","","")
    println("Enter top 5 movies:")
    for (i in 0..4){
        topMovies[i] = readLine()!!
    }

    for (i in 1..5){
        println("$i: " + topMovies[i-1])
    }
}