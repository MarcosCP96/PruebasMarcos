import org.junit.jupiter.api.Test
import org.mockito.kotlin.*
import kotlin.test.assertEquals
import kotlin.time.Duration.Companion.hours

internal class ejercicio4Test {
    @Test
    fun `suma`(){
        assertEquals(6,Suma().resultado(3,3))
    }

    @Test
    fun `resta`(){
        assertEquals(0,Resta().resultado(3,3))
    }

    @Test
    fun `mult`(){
        assertEquals(9,Multiplicacion().resultado(3,3))
    }

    @Test
    fun `dividir`(){
        assertEquals(1,Division().resultado(3,3))
    }
    @Test
    fun `test integración calculadora y operacion mockito`(){
        val a = 1
        val b = 1
        val operacionMock: Operacion = mock()
        val calculadoraCb = CalculadoraCb()
        calculadoraCb.operacion(a,b,operacionMock)
        verify(operacionMock).resultado(eq(a), any())
    }
}