import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ejercicio4Test {
    @Test
    fun `suma`(){
        assertEquals(6,CalculadoraCb().operacion(3,3, Suma()))
    }

    @Test
    fun `resta`(){
        assertEquals(0,CalculadoraCb().operacion(3,3, Resta()))
    }

    @Test
    fun `mult`(){
        assertEquals(9,CalculadoraCb().operacion(3,3, Multiplicacion()))
    }

    @Test
    fun `dividir`(){
        assertEquals(1,CalculadoraCb().operacion(3,3, Division()))
    }
}