class Empleado(nombre:String, edad:Int, sueldo:Int): Persona(nombre, edad) {
    private var sueldo:Int = sueldo
        private get() = field
        private set(valor) {
            field = valor
        }

    fun debePagar() {
        if (sueldo > 3000)
            println("Debe pagar impuestos.")
        else
            println("No debe pagar impuestos")
    }
}