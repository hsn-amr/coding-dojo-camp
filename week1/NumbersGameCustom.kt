import kotlin.random.Random

fun main(){
    val secretNumber = Random.nextInt(11)
    var finish = false

    while (!finish){
        print("Enter Your First Number: ")
        val userFirstInput = readLine()
        print("Enter Your Second Number: ")
        val userSecondInput = readLine()
        try {
            var num1 = userFirstInput!!.toInt()
            var num2 = userSecondInput!!.toInt()

            var result = num1*secretNumber+num2
            println("$num1 * X + $num2 = $result")
            print("What is X? ")

            val userInput = readLine()
            if(userInput!!.toInt() == secretNumber){
                println("you got it!")
            }else{
                println("Wrong guess, the answer was $secretNumber")
            }

            println("Game over")
            finish = true
        } catch (e: Exception){
            println("Please enter numbers only")
            continue
        }
    }

}