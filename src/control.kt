fun main(args: Array<String>) {
    var marks=78
    if (marks<50){
        println("You have failed")
    }else{
        println("YOU HAVE PASSED")
    }


    //else...if..statement
    val num =21
    if (num>0 && num<20)
        println("You have failed")
    else if (num>20 && num<40)
        println("Approaching Expectations")
    else if (num>40 && num<60)
        println("At average")
    else if (num>60 && num<100)
        println("You have passed")
}