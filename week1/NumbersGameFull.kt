import kotlin.random.Random

fun main(){
    val secretNumber = Random.nextInt(11)
    val playTimes = 3
    print("Guess a number between 0 and 10: ")
    var count = 1
    while (true){
        val userInput = readLine()
        if(userInput == "quit"){
            print("Game over")
            break
        }
        try {
            val temp = userInput!!.toInt()
            when{
                temp < 0 -> {
                    print("Please enter between 0 and 10 only, try again: ")
                    continue
                }
                temp > 10 -> {
                    print("Please enter between 0 and 10 only, try again: ")
                    continue
                }
                temp == secretNumber -> {
                    println("you got it!")
                    break
                }

            }
            if (count >= playTimes){
                println("Wrong guess, the answer was $secretNumber")
                println("Game over")
                break
            }else{
                count++
                print("Wrong guess, try again: ")
            }

        } catch (e: Exception){
            print("Please enter numbers only, try again: ")
            continue
        }
    }

}