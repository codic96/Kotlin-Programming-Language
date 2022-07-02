/*** Constructor ***/
// Primary constructor

class Human constructor(val name:String,val age:Int) //Create primary constructor
{
    //Properties
    var nName:String
    var nAge:Int
    var gender:String = "Female"
//    Initilizer Block

    init{
        nName = name
        nAge = age
    }
  // Member Function

  fun disp()
  {
      println("The name are : $nName")
      println("The Age are : $nAge")
      println("The Gender are: $gender")
  }
}

fun main()
{
    val nm = Human("Vikash Kumar",21) // Create Object
    nm.disp() //display member function
}