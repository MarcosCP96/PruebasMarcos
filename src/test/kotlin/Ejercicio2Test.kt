import model.Vehiculos
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.lang.Exception

internal class Ejercicio2Test {

    @Test
    fun `crear coche con todos los elementos`(){
        val coche = Vehiculo.Builder().setTipo(Vehiculos.coche).setPuertas(2).setCv(100).setMotor("diesel").setRuedas(4).build()
        val expected = Coche(2,100,"diesel",4)
        assertEquals(expected,coche)
    }
    @Test
    fun `crear moto con todos los elementos`(){
        val moto = Vehiculo.Builder().setTipo(Vehiculos.moto).setMotor("diesel").setRuedas(4).setCv(100).build()
        val expectedMoto = Moto(100,"diesel",4)
        assertEquals(expectedMoto, moto)
    }
    @Test
    fun `crear bici con todos los elementos`(){
        val bicicleta = Vehiculo.Builder().setTipo(Vehiculos.bicicleta).setRuedas(4).build()
        val expectedBici = Bicicleta(4)
        assertEquals(expectedBici,bicicleta)
    }
    @Test
    fun `crear coche con algun elemento null`(){
        val coche = Vehiculo.Builder().setTipo(Vehiculos.coche).setMotor("diesel").setRuedas(null).setCv(100).setPuertas(4)
        val expected = assertThrows(Exception::class.java,{coche.build()})
        assertEquals("Ruedas en el vehiculo coche no puede ser null",expected.message)
    }
    @Test
    fun `crear moto con algun elemento null`(){
        val moto = Vehiculo.Builder().setTipo(Vehiculos.moto).setRuedas(4).setCv(100).setMotor(null)
        val expected = assertThrows(Exception::class.java,{moto.build()})
        assertEquals("Motor en el vehiculo moto no puede ser null",expected.message)
    }
    @Test
    fun `crear bici con algun elemento null`(){
        val bicicleta = Vehiculo.Builder().setRuedas(null).setTipo(Vehiculos.bicicleta)
        val expected = assertThrows(Exception::class.java,{bicicleta.build()})
        assertEquals("Ruedas en el vehiculo bicicleta no puede ser null",expected.message)
    }
}