class hesabu {
    //data memeber
    var num1:Int=67
    var num2:Int=98
    //MEMBER FUNCTION
    fun arithmetic():Int{
        return num1*num2

    }
}

fun main(args: Array<String>) {
    //creating object
    val myobject=hesabu()
    println(myobject.arithmetic())
}