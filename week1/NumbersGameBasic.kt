fun main(){
    val secretNumber = 6
    print("Guess a number between 0 and 10: ")
    val userInput = readLine()
    try {
        val temp = userInput!!.toInt()
        if(temp in 0..10){
            if(temp == secretNumber){
                println("you got it!")
            }else{
                println("Wrong guess, the answer was $secretNumber")
            }
        }else{
            println("Please enter between 0 and 10 only")
        }
        println("Game over")
    } catch (e: Exception){
        println("Please enter numbers only")
    }
}