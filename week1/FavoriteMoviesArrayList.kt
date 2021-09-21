fun main(){
    val favoriteMovies = arrayListOf<String>()

    println("Enter your favorite movies (at least 3):")
    var wantContinue = "y"
    while (wantContinue == "y"){
        favoriteMovies.add(readLine()!!)
        if(favoriteMovies.size >= 3){
            print("Would you like to add more? (y/n) >>")
            wantContinue = readLine()!!
        }
    }

    for (movies in favoriteMovies){
        println(movies)
    }

}