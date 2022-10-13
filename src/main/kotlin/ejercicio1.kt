fun Vehiculo.incrementarVelocidad(){
     when (this){
        is Coche -> velocidad += 2
        is Moto -> velocidad += 4
        is Bicicleta -> velocidad += 1
         else -> {}
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
            else -> {}
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