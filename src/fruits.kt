class fruits {
    var type=""
    var color=""
    var price=0
}

fun main(args: Array<String>) {
    val matunda=fruits()
    var matunda1=fruits()

    matunda.color="Water Melon"
    matunda.price=650
    matunda.type="Orange"

    matunda1.color="Yellow"
    matunda1.price=567
    matunda1.type="Banana"

    println(matunda.type)
    println(matunda.color)
    println(matunda.price)

    println(matunda1.type)
    println(matunda1.color)
    println(matunda1.price)
}
