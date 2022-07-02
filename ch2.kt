/**Class and Object **/
//Creating Class

class Mobile //Create a class name
{
    //Properties

    var name:String = "Vipin Kumar"
    var address:String = "Rajajipuram"
    var email:String = "programmervipin@gmail.com"

    //Member function
    fun disp()
    {
        println("The name are: $name")
        println("The Address are: $address")
        println("The Email are : $email")
    }
}

fun main() // Create main function
{
    var nm = Mobile() //Creating a Object
    nm.disp()
    nm.name = "Vikash Dubay"
    nm.address = "Lucknow"
    nm.email = "Vikash12@gmail.com"
    nm.disp()
    nm.name = "Shivam Kumar"
    nm.address = "kanpur"
    nm.email = "jjjsjsj@gmail.com"
    nm.disp()

}