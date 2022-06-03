fun sayBye(personToGreet: String): String{
    println("Hello From $personToGreet")
    return "Bye Java"
}
fun sayGoodBye(): Unit{
    println("GoodBye Java for Android")
}

fun main(){
    sayGoodBye()
    println("Hello from Kotlin")

val name: String = "Trizah"
    println(name)

    var greeting: String = "Hello"
    println("$greeting $name")
    greeting = "Good Evening"
    println("$greeting $name")

//    Type Reference
    var sayHi = "Hi"
    println("$sayHi $name")

//    null
    var greetings: String? = null
//    greetings = "Nabwire"
    if(greetings!=null) {
        println(greetings)
    }
    else{
        println("Hi Here")
    }

//    when
    greetings = "Hello from Linkedin"
    when(greetings){
        null -> println("GOOD EVENING FROM JETBRAINS")
        else -> println(greetings)
    }

//    Ternary operator
    val number = 20
    val score = if(number <10 ) "Loose" else if (number==20) "Tie" else "Win"
    println(score)


//    when statement
    val num = 50
    when(num){
        in 0..-50 -> println("$num is a negative value")
        in 1..50 -> println("$num is a positive number between 1 and 50 inclusive")
    }



//OPERATOR OVERLOADING
    val a = 10
    val b = 20
    println("Plus function adds two numbers: " + a.plus(b)) //print(a+b)

//    invoking a function sayBye
    println(sayBye())

    sayBye("Developers")
}
