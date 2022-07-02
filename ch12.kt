/** Visibility Modifiers **/
/*
* private means visible inside this class only (including all its members)
* protected is the same as private but is also visible in subclasses.
* internal means that any client inside this module who see the declaring class sees its internal members
* public means that any client who sees the declaring class sees its public members

 */
/* open class Father6
{
    //Properties
    private  var a:Int = 10
    protected var b:Int = 20
    internal var c:Int = 30
    var d:Int = 40
    var e:Int = 50

    //Member function

    fun disp()
    {
        println("A : $a")
        println("B : $b")
        println("C : $c")
        println("D : $d")
        println("E : $e")



    }
    fun hello()
    {
        println("Hello Father Python Programming language")
    }



}
class Son6:Father6()
{
    //Properties
    var bike:String = "MT15"

    //Member function

    fun show()
    {
       /* println("A : $a") */
        println("B : $b")
        println("C : $c")
        println("D : $d")
        println("E : $e")
        hello()
    }
}

fun main()
{
    val f1 = Son6()
    f1.show()


    f1.show()

}


 */



