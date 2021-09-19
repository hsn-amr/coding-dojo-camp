
fun main(){
    val  minimumAge = 20
    print("Enter Your Age: ")
    val userAge = readLine()
    try {
        if(userAge!!.toInt() > minimumAge){
            println("Welcome!")
        }else{
            println("You are not old enough")
        }
    }catch(e: Exception){
        println("Something went wrong")
    }
}