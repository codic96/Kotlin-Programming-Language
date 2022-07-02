/** Constructor **/
//Primary constructor

class Person constructor(val name:String,val age:Int) {
    //Properties

    val address: String = "Rajajipuram"


    //Member Function
    fun disp() {
        println("The name :$name")
        println("The age :$age")
        println("The address:$address")
    }
}

    fun main()
    {
        val nm =Person("Vipin Kumar",20)
        nm.disp()
    }





