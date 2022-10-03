fun main(args:Array<String>) {
    /* 1 */ println("---1---")
    var persona = Persona("Guille", 19)
    persona.saludar()

    var empleado = Empleado("Javier", 25, 2000)
    empleado.saludar()
    empleado.debePagar()

    /* 2 */ println("\n---2---")
    var cajaAhorro = CajaAhorro("Guillermo Ahorro", 10000)
    cajaAhorro.mostrarInformacion()

    var plazoFijo = PlazoFijo("Guillermo Fijo", 15000, 200, 5)
    plazoFijo.mostrarInformacion()
}