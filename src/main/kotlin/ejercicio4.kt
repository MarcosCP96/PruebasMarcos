interface Operacion {
    fun resultado(a: Int, b: Int): Int
}
class Suma() : Operacion {
    override fun resultado(a: Int, b: Int): Int {
        return a + b
    }
}
class Resta: Operacion{
    override fun resultado(a: Int, b: Int): Int {
        return a - b
    }
}
class Multiplicacion: Operacion{
    override fun resultado(a: Int, b: Int): Int {
        return a * b
    }
}
class Division: Operacion{
    override fun resultado(a: Int, b: Int): Int {
        return a / b
    }
}
class CalculadoraCb {
    fun operacion(a: Int, b: Int, op: Operacion): Int {
        return op.resultado(a, b)
    }
}

fun main() {
    val suma = CalculadoraCb().operacion(3,3, Suma())
    val resta = CalculadoraCb().operacion(3,3, Resta())
    val multiplicacion = CalculadoraCb().operacion(3,3, Multiplicacion())
    val division = CalculadoraCb().operacion(3,3, Division())
    println(suma)
    println(resta)
    println(multiplicacion)
    println(division)
}