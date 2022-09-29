abstract class Cuenta(nombre:String, monto:Int) {
    var nombreTitular:String = nombre
        get() = field
        set(valor) {
            field = valor
        }
    var monto:Int = monto
        get() = field
        set(valor) {
            field = valor
        }


}