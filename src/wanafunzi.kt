class wanafunzi(val Name:String,val Gender:String,var Phoneno:Int,val coursetake:String) {
}

fun main(args: Array<String>) {
    val obj=wanafunzi("Edwin","Male",703427043,"Full Stack Development")
    println("The student name is "+obj.Name+", his gender is "+obj.Gender+", phone number is "+obj.Phoneno+" while the course taken is "+obj.coursetake)

}
