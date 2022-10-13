object Calculadora {
    fun suma(num1: Int, num2: Int){ resultado = num1 + num2 }
    fun resta(num1: Int, num2: Int){ resultado = num1 - num2 }
    var resultado = 0
}

fun main() {
    val calc = Calculadora
    val calc2 = Calculadora
    calc.suma(1,4)
    calc2.resta(5,6)
}