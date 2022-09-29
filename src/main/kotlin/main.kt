fun main(args:Array<String>) {
    var persona = Persona("Guille", 19)
    persona.saludar()

    var empleado = Empleado("Javier", 25, 2000)
    empleado.saludar()
    empleado.debePagar()
}