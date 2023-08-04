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

    val x: Any = 4

    when (x) {
        2, 3, 5, 7 -> println("X es un numero primo entre el 1 al 10")
        in 1..10 -> println("X es un numero entre el 1 y el 10 pero no es primo.")
        is Int -> println("x es entero.")
        else -> println("x no es un entero.")
    }

}
