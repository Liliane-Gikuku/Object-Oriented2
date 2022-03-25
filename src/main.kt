fun main(){
    var human = Human("Cedrick",13,26)
    human.eat(1)
    println (human.weight)
    human.speak("I am a code libra")
    human.birthDay()
    human.birthDay()
    human.birthDay()

    var address=User("Serge","Abijuru","abijuruserg@gmail.com","787966532",
        "Myaccount1!")
    println("${address.firstName} ${address.lastName}  ${address.email}  ${address.phoneNumber}  ${address.password}")



}
//Human class
class Human(var name:String,var age:Int,var weight:Int){

    fun eat(foodWeight:Int) {
        println("I am eating $foodWeight kgs of food")
        weight+= foodWeight
    }
    fun speak(speech:String){
        println(speech)
    }

    fun birthDay(){
        age++
        println(age)
    }

}

class User(var firstName:String,var lastName:String,var email:String,var phoneNumber:String,var password:String){

}


