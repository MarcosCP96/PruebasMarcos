import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.opentest4j.AssertionFailedError
import java.lang.Exception

internal class incrementarVelocidadTest {
    @Test
    fun `Incrementar velocidad coche test passed`() {
        val coche = Coche(2,180,"diesel",4)
        val expected = 2
        coche.incrementarVelocidad()
        assertEquals(expected, coche.velocidad)
    }
    @Test
    fun `Incrementar velocidad moto test passed`() {
        val moto = Moto (100,"diesel", 2)
        val expected = 4
        moto.incrementarVelocidad()
        assertEquals(expected, moto.velocidad)
    }
    @Test
    fun `Incrementar velocidad bicicleta test passed`() {
        val bicicleta = Bicicleta(2)
        val expected = 1
        bicicleta.incrementarVelocidad()
        assertEquals(expected, bicicleta.velocidad)
    }
    @Test
    fun `Reducir velocidad coche test passed`() {
        val coche = Coche(2,180,"diesel",4)
        coche.velocidad = 2
        val expected = 0
        coche.reducirVelocidad()
        assertEquals(expected, coche.velocidad)
    }
    @Test
    fun `Reducir velocidad moto test passed`() {
        val moto = Moto (100,"diesel", 2)
        moto.velocidad = 4
        val expected = 0
        moto.reducirVelocidad()
        assertEquals(expected, moto.velocidad)
    }
    @Test
    fun `Reducir velocidad bicicleta test passed`() {
        val bicicleta = Bicicleta(2)
        bicicleta.velocidad = 1
        val expected = 0
        bicicleta.reducirVelocidad()
        assertEquals(expected, bicicleta.velocidad)
    }
    @Test
    fun `Reducir velocidad vehiculo test if (velocidad = 0)`(){
        val bicicleta = Bicicleta(2)
        val prueba = assertThrows(Exception::class.java,{bicicleta.reducirVelocidad()})
        assertEquals("La velocidad no puede ser negativa2",prueba.message)
    }
}