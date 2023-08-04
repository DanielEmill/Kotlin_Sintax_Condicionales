fun main() {
    println("Puertas de colores:")
    val Color:String = "Azul"
    if(Color == "Blanco")
    {
        println("Entraste a la puerta blanca.")
    }
    else if(Color == "Negro")
    {
        println("Entraste a la puerta negra.")
    }
    else
    {
        println("No entraste a ninguna de la dos puerta.")
    }
    when(Color){
        "Negro" -> println("Entraste a la puerta negra.")
        "Blanco" -> println("Entraste a la puerta blanca.")
        else -> println("Colores invalidos")

    }

}