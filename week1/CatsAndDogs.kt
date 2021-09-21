abstract class Animal(inputName: String, inputAge: Int){
    var name = ""
    var age = 0
    init{
        this.name = inputName
        this.age = inputAge
    }
    abstract fun talk()
}

class Dog(inputName: String, inputAge: Int) : Animal(inputName, inputAge){
    override fun talk() {
        println("${this.name}: Woof")
    }
}

class Cat(inputName: String, inputAge: Int) : Animal(inputName, inputAge){
    override fun talk() {
        println("${this.name}: Meow")
    }
}

val cat1 = Cat("Snowball", 5);
val cat2 = Cat("Furball", 3);
val cat3 = Cat("Patchy", 5);
val cat4 = Cat("Meep", 1);
val cat5 = Cat("Lili", 2);
val cats = arrayListOf(cat1, cat2, cat3, cat4, cat5)

val dog1 =  Dog("Spot", 3);
val dog2 =  Dog("Fred", 3);
val dog3 =  Dog("Rufus", 7);
val dog4 =  Dog("MAX", 6);
val dog5 =  Dog("BO", 8);
val dogs = arrayListOf(dog1, dog2, dog3, dog4, dog5)

fun main(){
    for (i in 0..cats.size-1) {
        cats[i].talk()
        for (j in 0..dogs.size-1) {
            if (dogs[j].age > cats[i].age) dogs[j].talk()
        }
    }
}