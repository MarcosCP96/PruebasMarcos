import com.google.gson.Gson
import com.google.gson.GsonBuilder
import io.github.isharipov.gson.adapters.PolymorphDeserializer
import kotlinx.serialization.json.Json
import java.io.File
import java.lang.annotation.ElementType
import java.lang.annotation.RetentionPolicy
import kotlin.reflect.KClass

sealed class Vehiculo(val tipo: String){
    var velocidad: Int = 0
}

data class Coche(val puertas: Int, val cv: Int, val motor: String, val ruedas: Int): Vehiculo("coche"){
    override fun toString(): String {
        return "$tipo $velocidad"
    }
}
data class Moto(val cv: Int, val motor: String, val ruedas: Int): Vehiculo("moto"){
    override fun toString(): String {
        return "$tipo $velocidad"
    }
}
data class Bicicleta(val ruedas: Int): Vehiculo("bicicleta"){
    override fun toString(): String {
        return "$tipo $velocidad"
    }
}

fun Vehiculo.incrementarVelocidad(){
     when (this){
        is Coche -> velocidad += 2
        is Moto -> velocidad += 4
        is Bicicleta -> velocidad += 1
    }
}

fun Vehiculo.reducirVelocidad(){
    if (this.velocidad <= 0){
        throw Exception("La velocidad no puede ser negativa")
    } else {
        when (this){
            is Coche -> velocidad -= 2
            is Moto -> velocidad -= 4
            is Bicicleta -> velocidad -= 1
        }
    }
}

fun Vehiculo.returnVelocidad(): Int{
    return this.velocidad
}

fun main() {
    val newVehiculo = Coche(2,100,"diesel",4)
    val newVehiculoMoto = Moto(100,"diesel",4)
    val newVehiculoBicicleta = Bicicleta(2)
    newVehiculo.incrementarVelocidad()
    newVehiculo.reducirVelocidad()
    println(newVehiculo.toString())
}