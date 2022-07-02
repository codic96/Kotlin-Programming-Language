/*** Constructor ***/
// Secondary Constructor

/*class People
{
    //Properties
    var nName:String
    var nAge:Int
    var gender: String = "Female"

    constructor(name:String , age : Int)
    {
        println("Constructor Called ")
        nName = name
        nAge = age



    }
    //Member Function
    fun disp()
    {
        println("The name: $nName")
        println("The age: $nAge")
        println("The gender: $gender")

    }

}

fun main()
{
    val nm = People("Vipin Kumar",21)
    nm.disp()

    val nm1 = People("Vikash Dubay", 32)
    nm1.disp()

}

 */

/** Primary and Secondary constructor **/

/*class Registration(val email:String,val password:String)
{
    //Properties
    var hName:String=""
    var hAge:Int? = null
    var hEmail:String
    var hPassword:String
    var gender:String = "Female"


    //Secondary constructor
    constructor(val name:String,val age:Int,val email: String,val password: String):this(email,password)
    {
        hName = name
        hAge = age

    }
    //Init Block
    init{
        hPassword = password

    }

    //Member Function
    fun disp()
    {
        println("The name are : $hName")
        println("Age $hAge")
        println("Email $hEmail")
        println("Password $hPassword")
        print("Gender $gender")

    }
}

fun main()
{
    val nm = Registration() // Enter the data
    nm.disp()

}

 */