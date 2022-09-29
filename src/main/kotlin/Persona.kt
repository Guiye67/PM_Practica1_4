open class Persona(nombre:String, edad:Int) {
    private var nombre:String = nombre
        private get() = field
        private set (valor) {
            field = valor
        }
    private var edad:Int = edad
        private get() = field
        private set (valor) {
            field = valor
        }

    fun saludar() {
        println("Un saludo\nMe llamo $nombre y tengo $edad años")
    }
}