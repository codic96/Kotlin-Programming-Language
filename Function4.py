#1 A function with two Int parameter and Int return type

fun add(a:Int,b:Int):Int 
  {
    return a+b
  }
fun main()
{
  print("Sum are add(12,13)")
} 

#2 

fun add(a:Int,b:Int)=a+b
fun main("Sum are ${add(12,13)}")

#3

fun add(a:Int,b:Int):Unit
  {
    print("Sum are $a and $b ${a+b}")
  }
  fun main()
  {
    prinlnt(add(12,13))
  } 
