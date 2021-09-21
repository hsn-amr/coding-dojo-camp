fun main(){


    fun calculate(number1: Float, operator: String, number2: Float): Any {
        return try {
            when(operator){
                "+" -> number1 + number2
                "-" -> number1 - number2
                "*" -> number1 * number2
                "/" -> number1 / number2
                else -> false
            }
        }catch (e: Exception){
            "You can't divide by 0"
        }
    }

    fun checkOperator(operator: String): Boolean {
        return operator == "+" || operator == "-" || operator == "*" || operator == "/"
    }

    fun checkNumber(number: String?): Int {
        return try {
            number!!.toInt()
        }catch (e: Exception){
            0
        }
    }

    var wantContinue = "y"
    while(wantContinue == "y"){
        print("Enter Your First Number: ")
        val num1 = readLine()
        val number1 = checkNumber(num1).toFloat()

        print("Enter The Operator: ")
        val operator = readLine()!!
        val isOperator = checkOperator(operator)
        if(isOperator){
            println("$number1 $operator ")
            print("Enter Your Second Number: ")
            val num2 = readLine()
            val number2 = checkNumber(num2).toFloat()

            val result = calculate(number1, operator, number2)
            println("$number1 $operator $number2 = $result")
        }else{
            println("Please Enter mathematical operator")
        }


        print("Would you like to add more numbers? (y/n) >>")
        wantContinue = readLine()!!
    }
    println("Exiting...")
}