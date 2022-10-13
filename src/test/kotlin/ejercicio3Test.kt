import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ejercicio3Test {

    @Test
    fun `suma numeros positivos`() {
        val calc = Calculadora
        val suma = calc.suma(1,5)
        val expected = 6
        assertEquals(expected, calc.resultado)
    }
    @Test
    fun `suma numeros negativos`() {
        val calc = Calculadora
        val suma = calc.suma(-1,-5)
        val expected = -6
        assertEquals(expected, calc.resultado)
    }
    @Test
    fun `resta numeros positivos`() {
        val calc = Calculadora
        val resta = calc.resta(5,1)
        val expected = 4
        assertEquals(expected, calc.resultado)
    }
    @Test
    fun `resta numeros negativos`() {
        val calc = Calculadora
        val resta = calc.resta(-5,-1)
        val expected = -4
        assertEquals(expected, calc.resultado)
    }
    @Test
    fun `comprobar calc`(){
        val calc = Calculadora
        val expected = Calculadora
        assertEquals(expected, calc)
    }

}