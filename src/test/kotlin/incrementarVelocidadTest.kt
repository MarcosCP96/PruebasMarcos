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
        bicicleta.reducirVelocidad()
    }
//    @Test
//    fun `Incrementar velocidad coche test failed`() {
//        val coche = Coche(2,180,"diesel",4)
//        val expectedFail = 3
//        coche.incrementarVelocidad()
//        assertEquals(expectedFail, coche.velocidad)
//    }
//    @Test
//    fun `Incrementar velocidad moto test failed`() {
//        val moto = Moto (100,"diesel", 2)
//        val expectedFail = 2
//        moto.incrementarVelocidad()
//        assertEquals(expectedFail, moto.velocidad)
//    }
//    @Test
//    fun `Incrementar velocidad bicicleta test failed`() {
//        val bicicleta = Bicicleta(2)
//        val expectedFail = 7
//        bicicleta.incrementarVelocidad()
//        assertEquals(expectedFail, bicicleta.velocidad)
//    }
//    @Test
//    fun `Reducir velocidad vehiculo con velocidad 0`() {
//        val coche = Coche(2,180,"diesel",4)
//        val expected = -2
//        val expectedFail = -3
//        coche.reducirVelocidad()
//        assertEquals(expectedFail, coche.velocidad)
//    }
//    @Test
//    fun `Reducir velocidad coche test failed`() {
//        val coche = Coche(2,180,"diesel",4)
//        coche.velocidad = 2
//        val expectedFail = 0
//        coche.reducirVelocidad()
//        assertEquals(expectedFail, coche.velocidad)
//    }
//    @Test
//    fun `Reducir velocidad moto test failed`() {
//        val moto = Moto (100,"diesel", 2)
//        val expected = -4
//        val expectedFail = -1
//        moto.reducirVelocidad()
//        assertEquals(expectedFail, moto.velocidad)
//    }
//    @Test
//    fun `Reducir velocidad bicicleta test failed`() {
//        val bicicleta = Bicicleta(2)
//        val expected = -1
//        val expectedFail = -5
//        bicicleta.reducirVelocidad()
//        assertEquals(expectedFail, bicicleta.velocidad)
//    }
}