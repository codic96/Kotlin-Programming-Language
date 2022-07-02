/*fun main()
{

   println(roll)
   println(phone_number)
   println(price)
   println(totalcost)
   println(gender)
   println(name)
   println(user_name)

}*/



//## Specific Data type //

/*fun main()
{


   println(roll)
   println(phone_number)
   println(price)
   println(totalcost)
   println(gender)
   println(name)
   println(user_name)
}
*/

      //# val- Read-only local variables are defined using the keyword val. They can be assigned a value only once.
//# Dynamic Type

/*fun main()
{
   val roll:Int = 10
   val phone_number:Long = 998976363L
   val price:Float= 12.7f
   val totalcost:Double = 23399.8383
   val gender:Char = 'F'
   val name:String = "Vipin Kumar"
   val user_name:Boolean = true
   println(roll)
   println(phone_number)
   println(price)
   println(totalcost)
   println(gender)
   println(name)
   println(user_name)
}*/

/*** Print Function ***/
//print()

/*fun main()
{
   println("Hello World  Kotlin Programming language")
   println(10)
   println("Hello")
   println(true)
   println(1282827L)
   println(12828.92929)



}*/

/*/*** Arithmetic Operatiors ***/

fun main(){
   val a= 12
   val b=190

   println(a+b)
   println(a-b)
   println(a*b)
   println(a/b)
   println(a%b)

}*/

/*/** Comparsion Operator **/

fun main()
{
   val a = 5
   val b = 10
   println(a>b)
   println(a<b)
   println(a==b)
   println(a!=b)
   println(a<=b)
   println(a>=b)

}*/

/** Equality and Inequality Operators **/

/*fun main()
{
   val a = 4
   val b = 7
   println(a==b)
   println(a!=b)



}*/

/*/** Logical Operators **/

fun main()
{
   val a = 20
   val b = 20
   println((a==b) &&(a<=b))
   println( (a==b) || (a>=b))
   println(!(a<b))
   println(!(a==b))




}*/

/* Increment and decrement operator */

/*fun main()
{
   var a = 12
   a--
   println(a)

}
*/

/** Argumented assignments **/

/*fun main()
{
 var a = 12
   a/=12
   println(a)


}*/

/** User Input **/

// # Using readLine
/*fun main()
{
   /*val name:String? = readLine()
   println(name)
   println(name!!::class.simpleName)


    */
 print("Enter your name")
  val name = readLine()
  println("Name : $name")
  println(name!!::class.simpleName)

  println("Enter your Phone Number")
  val phone_Number = readLine()
  println("Phone Number : $phone_Number")
  println(phone_Number!!::class.simpleName)

   println("Enter your Address ")
   val address = readLine()
   println("Address: $address")
   println(address!!::class.simpleName)

   println("Enter your E-mail Address")
   val e_address = readLine()
   println("E mail Address: $e_address")
   println(e_address!!::class.simpleName)


}

 */

/*
fun main() {
   println("Enter your name")
   val name = readLine()!!.toString()
   println("Name : $name")
   println(name!!::class.simpleName)

   println("Enter your Roll Number")
   val roll_no = readLine()!!.toLong()
   println("Roll Number: $roll_no")
   println(roll_no!!::class.simpleName)

   println("Enter the Percentage")
   val percentage = readLine()!!.toDouble()
   println("Perentage: $percentage")
   println(percentage!!::class.simpleName)

   println("Enter College Name")
   val college_name = readLine()!!.toString()
   println("College Name: $college_name")
   println(college_name!!::class.simpleName)

   println("Enter the Feee Amount")
   val fee = readLine()!!.toFloat()
   println("College Fee: $fee")
   println(fee!!::class.simpleName)

}

 */

// #Using Scanner class

/*
fun main()
{
    val scanner = Scanner(System , 'in')
    val name = scanner.next()
    println (name)
    println(name::class.simpleName)
}*/

/** String **/

/*
fun main()
{
    val str = "Hello Kotlin Programming language"
    println(str)
    println(str[0])
    println(str[1])
    println(str[2])
    println(str[3])
    println(str[4])
    println(str[5])
    println(str[6])
    println(str[7])
    println(str[8])
    println(str[9])

}*/

/* String Concatenation */

/*fun main()
{
    val str1 = "Hello"
    val str2 = " Kotlin Programming language"
    println(str1[1])
    println(str2[2])
    println(str1)
    println(str2)
    println(str1 + str2)

 }

 */

/*** String Literals ***/

/*
fun main()
{
    println("Hello \n World ")
    println("Hello  \t World")
    println("Hello \n World")
    println("Hello World Kotlin Programming \n language")

}

 */

/*** Raw String ***/
/*
fun main()
{
    val message = """Dear Sir/Madam, 
        I request to enter the data centre and provide the information are held the name laptop are held the name are held the name are involve the information

    """
    println(message)

}

 */

/** String template **/

/*fun main()
{
    val str1 = "Kotlin"
    val str2 = "Programming"


    println("This is a $str1")
    println("This is a $str2")
    println("This is a Kotlin Programming $str1 $str2")
    println("This is a Kotlin Programming language ${str1}")
    println("This is a kotlin : $str2")
    val a = 12
    val b = 13
    println("The Number are : $a")
    println("The Number are : $b")
    println("Addition Number are:${a+b}")
    println("Multiplication Number are:${a-b}")
    println("Division Number are : ${a/b}")

    val name = "Vikrant"
    println("The Name are $name ?")
    println("The Name are Uppercase ${name.uppercase()}")
    println("The Name are lowercase ${name.lowercase()}")



}

 */

/*** If Expression - if is an expression: it returns a value ***/

/*fun main()
{
    val a = 10
    val b = 20
    var max = 0
    if(a<b) max=a
    println(max)
    println("This is a Kotlin if expression")
    println("Max Number is $a")
    println("Max number is $b")

}

 */

/** if else expression **/

/*
fun main()
{
    val a = 10
    val b = 30
    var max = 0
     max = if(a<b) a else b
    println(max)


}


 */

/** When Expression **/

/*
fun main()
{
    val x = 10
    when(x)
    {
        1 -> println("One Number")
        2 -> println("Two Number")
        3 -> println("Three Number")
        4 -> println("Four Number")
        5 -> println("Five Number")
        else -> println("Not a valid Number")



    }
}

 */

/*
fun main()
{
    val a = 6
    when(a)
    {
        1,2 -> println("One or Two")
        3 -> println("Three")
        4 -> println("Four")
        5 -> println("Five")
        else -> println("Make a program")

    }
}

 */

/*fun main()
{
    val a = 4
    when(a)
    {
        1 , 2 -> {
            println("One")
            println("Two")
        }
        3 -> println("Three")
        4 -> println("Four")
        5 -> println("Five")

    }
}

 */
/*
fun main()
{
    when("Thursday")
    {
        "Sunday" -> println("Sunday")
        "Monday" -> println("Monday")
        "Tuesday" -> println("Tuesday")
        "Wednesday" -> println("Wednesday")
        "Thursday" -> println("Thursday")
        "Friday" -> println("Friday")
        "Satursday" -> println("Satursday")
        else -> println("Not a valid Number")
    }
}


 */

/*** For Loop ***/
// Syntax :- for(item in collection) print(item)

/*
fun main()
{
    for(item in 1..10)
    {
        println(item)
    }
}

*/

/*
fun main()
{
    for(item1 in 5 downTo 1){ println(item1)
    for(item2 in 1..10) println(item2) }
}


 */

/*** While Loop ***/

/*fun main()
{
    var x =0
    while(x < 10)
    {
        x++
        println(x)

    }
}

 */

/*** Do while ***/

/*fun main()
{
    var x =0
    do
    {
        x++
        println(x)
    }while(x<10)
}

 */

/** Break and continue **/

/*
fun main()
{
    var a=0
    while(a<10)
    {
        a++
        if(a==8) break
        println(a)

    }
}

 */

/*fun main()
{
    var x =0
    while(x<10)
    {
        x++
        if(x==7) continue
        println(x)
    }
}*/

/*** Function - Kotlin functions are declared using the fun keyword ***/

//# Function Without parameter
/*
fun display_name() // Create Function
{
    println("Display the name")
}
fun address() // Create Function
{
    println("Print the address")
}
fun phone_Number() // Create Function
{
    println("The Number are:")
}
fun main() // Main Function
{
    display_name() // Calling Function
    address()     // Calling Function
    phone_Number()  // Calling Function
    println("Kotlin Programming language") // Print the String
} // Program close

 */

/*
fun addition(a:Int,b:Int):Int{
    return a + b
}
fun multiplication(a:Int,b:Int):Int{
    return a*b
}
fun division(a:Int,b:Int):Int{
    return a/b
}
fun subs(a:Int,b:Int):Int{
    return a-b
}
fun main()
{
    val total = addition(12,13)
    if(total==1)
    {
        println(total)
    }
    else
    {
        println("The Function are exit the name")
    }
    val tot = multiplication(12,89)
    println(tot)
    val tot1 = division(12,89)
    println(tot1)
    val tot2 = subs(12,89)
    println(tot2)
}

 */

/*fun add(x:Int,y:Int)
{
    println("Values are there : $x and $y")
}
fun main()
{
    add(12,89)
}

 */

/*** Function with default argument ***/

/*fun addition(a:Int,b:Int=12):Int
{
    return a+b
}
fun main()
{
    val total = addition(12,89)
    println(total)
}

 */
/** Function with Named argument **/

/*fun add(x:Int,y:Int):Int
{
    println("X = $x")
    println("Y = $y")
    return (x*y)
}

fun main()
{
    val total = add(x = 15,y = 90)
    println(total)
}*/


/** Higher Order Function **/

/*fun main()
{
    hof(12,89,::sub)
}
fun sub(a:Int,b:Int):Int
{
    return a-b


}
fun hof(a:Int,b:Int,callback: (Int,Int)->Int)
{
    println(callback(a,b))
}*/

/** Lambda Expression **/

/*fun main()
{
    val add = {a:Int,b:Int->a+b}
    val total = add(12,89)
    println(total)

}

 */

/*fun main()
{
    hOF(12,89){a:Int,b:Int->a+b}
}
fun hOF(a:Int,b:Int,callback:(Int,Int)->Int)
{
    hOF(callback(12,89))
}

 */

/**Anonymous Function**/

/*fun main()
{
    val add=fun(a:Int,b:Int):Int{
        return a+b
    }
    val user_name=fun()
    {
        println("Hello World")
        println("Kotlin Programming language")

    }
    println(add(12,89))
    user_name()
}*/

/** Null Safety **/

/*fun main()
{
    var name:String = "Hello World Kotlin Programming language"
    println(name)
    var name1:String? = "Kotling Programming language"
    name1=null
    println (name1)
    val nameString = name.length
    println(nameString)

}


 */

/** Array **/

//# arrayOf method


/*fun main()
{
    val data = arrayOf("Name","user_name","function_data","information")
    println(data)
    println(data[0])
    println(data[1])
    println(data[2])
    println(data[3])

}

 */

/*fun main()
{
    val user_name = arrayOf("name","user_information","M","Hacker")
    for(dt in user_name)
    {
        println(dt)
    }
}

 */

/** String data type **/

/*fun main()
{
    val user_info = arrayOf<String>("name","user_info","Phone_Number")
    for(dt in user_info)
    {
        println(dt)
    }
}

 */

/* Add the String value */

 /*fun main()
{
    val name = arrayOf<String>("Java Programmer","Python Programmer","Kotlin Developer","C Developer")
    name[2]="App Developer"
    for(dt in name.indices) /* Print the index */
    {
        println(dt)

    }
 }

  */

/*fun main()
{
    val name = arrayOf<String>("Python Developer","Kotlin Developer","C Developer","C++ Developer")
    for(i in name.indices)
    {
        println("$i=${name[i]}")
    }
}

 */

/*
fun main()
{
    val user_name = arrayOf<String>("Python Programmer","Kotlin Programmer","C++ Developer")
    for (name in user_name.indices)
    {
        println("$name = ${user_name[name]}")
        println(user_name.size)

    }
}

 */

/** Array Constructor **/

/*fun main()
{
    val roll = Array(5, {i -> i*2})
    for(rl in roll)
    {
        println(rl)
    }
}

 */

/** Built in Method **/

/*fun main()
{
    val roll = intArrayOf(101,102,103)
    for(rl in roll)
    {
        println(rl)
    }
}

 */
/** Char Built in Method **/

/*fun main()
{
    val name = intArrayOf(1000,102,30)
    for (rl in name)
    {
        println(rl)
    }
}

 */
/** List **/
/*List is an ordered collection with access to elements by indices- integer numbers that reflects their position.

 */

/*fun main()
{
    val data = listOf("Sonam","Rahul","summit",1000,2000)
    println(data)
    println(data[0])
    println(data[1])
    println(data[2])
    println(data[3])
    for(dt in data) /* Using the for loop*/
    {
        println(dt)

    }

}

 */

/** List Specific data type **/

/*fun main()
{
    val names = listOf<String>("Java Programmer","Python Programmer","C Programmer")
    println(names)
    for(nm in names)
    {
    println(nm)
    }
}

 */

/** Mutable Listof **/

/*fun main()
{
    val data = mutableListOf("Vikram","Vikash","Rahul","User_name")
    println(data)
    println(data.size)
    data[0] = "jay"  /* Update the data */
    println(data)
    data[1] = "Vipin Kumar"  /*Update the data*/
    println(data.size)
   data.add(4,"Hello") //Add
    println(data)
    data.removeAt(1)
    println(data)



}

 */

/** Set
 *  is a collection of unique elements. Its reflects the mathmematical abstraction of set: a group of objects
  without repetitions . Generally, the order of set elements has no significance **/

/*fun main()
{
    val data = setOf("Sonam","Rahul","Sumit",100,'M',"Sonam","Rahul") //Create the set data type
    println(data)
    for (dt in data) //Access the for loop
    {
        println(dt) //Print the data
    }
    println(data.size)
}

 */

/** Set data type**/
/*fun main()
{
    var names = setOf<String>("Names","Address","Phone_Number")
    println(names)
    println(names.size)
    for(nm in names.indices)
    {
        println(nm)
    }
}

 */

/** Mutable setof **/
/*fun  main()
{
    var names = mutableSetOf<String>("Names","Address","Phone Number")
    names.add("Java Programmer") //using add function in mutablesetOf

    names.add("Python Programmer")
    names.add("C Programmer")   // Add the elements
    names.add("C++ Programmer")
    println(names)
    names.remove("Python Programmer") // Remove the elements
    println(names)
    names.add("Python Programmer")
    println(names)                 //Print the elements


}

 */

/** Map or Dictionary **/

// Map (or dictionary ) is a set of key-value pairs. keys are unique and each of them maps to exactly one value.

/*fun main()
{
    val data = mapOf(1 to "Name",2 to "Phone Number", 3 to "Address", 4 to "Email Address") // create the map
    println(data)
    /*for(dt in data) // using the for loop
    {
        println(dt)

    }*/
    println(data[1]) // access the data
    println(data[2])
    println(data.get(3)) // using the get
    println(data.keys)   // access the keys
    println(data.values) //access the values
    println(data.size) // access the size of data

    //Access the keys using the for loop
    for(key in data.keys)
    {
        println(key)
    }

}

 */









