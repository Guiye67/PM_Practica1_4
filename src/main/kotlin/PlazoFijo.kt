class PlazoFijo(nombre:String, monto:Int, dias:Int, interes:Int):Cuenta(nombre, monto) {
    var dias:Int = dias
        get() = field
        set(valor) {
            field = valor
        }
    var interes:Int = interes
        get() = field
        set(valor) {
            field = valor
        }

    override fun mostrarInformacion() {
        println("Plazo fijo: \n" +
                "Titular: $nombreTitular\n" +
                "Monto: $monto\n" +
                "Plazo de días: $dias\n" +
                "Interés: $interes")
    }
}