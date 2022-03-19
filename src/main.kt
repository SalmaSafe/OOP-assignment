fun main(){
   var female=Human ("Sham",21,50)
    female.eat(5)
    println(female.weight)
    female.speak("Ciao")
    female.birthday()
    var Girl= User("Salma","Safe","salmaasulee@gmail.com",+3176919593L,"Zamzam99")
    println(Girl.lastName)
    println(Girl.firstName)
}
class Human(var name2:String, var age:Int, var weight:Int ){
    fun eat(foodWeight:Int):Int{
        weight+=foodWeight
        println("I am eating $foodWeight kgs of food")
        return weight
    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
        age++
        println(age)
    }

}
//Create a data class User with these fields: firstName, lastName, email,
//phoneNumber, password. Create an instance of User  and print out any 2
//attributes
data class User(var firstName:String,var lastName:String,var email:String,var phoneNumber:Long,var password:String)