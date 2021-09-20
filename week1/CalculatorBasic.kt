fun main(){

    fun checkNumber(number: String?): Int {
        return try {
            number!!.toInt()
        }catch (e: Exception){
            0
        }
    }

    fun sum(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    var wantContinue = "y"
    while(wantContinue == "y"){
        print("Enter Your First Number: ")
        val num1 = readLine()
        print("Enter Your Second Number: ")
        val num2 = readLine()

        val number1 = checkNumber(num1)
        val number2 = checkNumber(num2)

        val result = sum(number1, number2)
        println("$number1 + $number2 = $result")
        print("Would you like to add more numbers? (y/n) >>")
        wantContinue = readLine()!!
    }
    println("Exiting...")
}