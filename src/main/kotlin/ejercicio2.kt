//Patron builder de fabricación de vehiculos
sealed class Vehiculo(val tipo: String){
    var velocidad: Int = 0
    class Builder(){
        private var tipo: String? = null
        private var puertas: Int? = null
        private var cv: Int? = null
        private var motor: String? = null
        private var ruedas: Int? = null
        fun setPuertas(puertas: Int?)= apply { this.puertas = puertas }
        fun setTipo(tipo: String?)= apply { this.tipo = tipo }
        fun setCv(cv: Int?) = apply { this.cv = cv }
        fun setMotor(motor: String?) = apply { this.motor = motor }
        fun setRuedas(ruedas: Int?) = apply { this.ruedas = ruedas }
        private fun buildCoche(): Vehiculo {
            isMotorNull(motor)
            isPuertasNull(puertas)
            isCvNull(cv)
            isRuedasNull(ruedas)
            return Coche(puertas!!, cv!!, motor!!, ruedas!!)
        }

        private fun buildMoto(): Vehiculo {
            isMotorNull(motor)
            isCvNull(cv)
            isRuedasNull(ruedas)
            return Moto(cv!!, motor!!, ruedas!!)
        }
        private fun buildBicicleta(): Vehiculo {
            isRuedasNull(ruedas)
            return Bicicleta(ruedas!!)
        }
        fun build(): Vehiculo? {
            isTipoNull(tipo)
            return when(tipo){
                "coche" -> buildCoche()
                "moto" -> buildMoto()
                "bicicleta" -> buildBicicleta()
                else -> null
            }
        }

        private fun isTipoNull(tipo: String?) {if (tipo == null || tipo == "") throw Exception("Tienes que especificar el tipo de vehiculo")}

        private fun isRuedasNull(ruedas: Int?) {if (ruedas == null) throw Exception("Ruedas en el vehiculo $tipo no puede ser null")}

        private fun isCvNull(cv: Int?) {if (cv == null) throw Exception("Cv en el vehiculo $tipo no puede ser null")}

        private fun isPuertasNull(puertas: Int?) {if (puertas == null) throw Exception("Puertas en el vehiculo $tipo no puede ser null")}

        private fun isMotorNull(motor: String?) {if (motor == null) throw Exception("Motor en el vehiculo $tipo no puede ser null")}
    }
}

data class Coche(var puertas: Int, var cv: Int, var motor: String, var ruedas: Int): Vehiculo("coche"){
    override fun toString(): String {
        return "$tipo $velocidad $puertas $cv $motor $ruedas"
    }
}
data class Moto(val cv: Int?, val motor: String?, val ruedas: Int?): Vehiculo("moto"){
    override fun toString(): String {
        return "$tipo $velocidad $cv $motor $ruedas"
    }
}
data class Bicicleta(val ruedas: Int?): Vehiculo("bicicleta"){
    override fun toString(): String {
        return "$tipo $velocidad $ruedas"
    }
}

fun main() {
    val newCoche = Vehiculo.Builder().setTipo("coche").setPuertas(2).setCv(100).setRuedas(4).setMotor("gasolina").build()
    val newMoto = Vehiculo.Builder().setTipo("moto").setCv(100).setRuedas(2).setMotor("diesel").build()
    val newBici = Vehiculo.Builder().setTipo("bicicleta").setRuedas(2).build()
    println(newCoche)
    println(newMoto)
    println(newBici)
}