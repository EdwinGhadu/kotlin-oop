open class amtheparent {
    var num=57
    var jina="Ghadu"

}
class child:amtheparent(){
    fun display(){
        println("The number for my parent class is $num")
    }
    fun display1(){
        println("The name from my parent class is $jina")
    }
}

fun main(args: Array<String>) {
    val myobj=child()
    println(myobj.display())
    println(myobj.display1())
}