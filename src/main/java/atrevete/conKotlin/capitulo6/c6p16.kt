/*
Atrévete con Kotlin ISBN: 9798596367164
Autor: http://luis.criado.online/index.html
 */
package atrevete.conKotlin.capitulo6


// inicialización tardia para "val" con lazy
class RetrasarInicializacionParametrosVal(var numero: Int)  { // 1
    val cte1: Int by lazy({ numero })  // 2
 }


fun main() {
    println("Valor para inicializar: ")
    val num = readLine()?.toInt() as Int  // 3

    var o=RetrasarInicializacionParametrosVal(num) // 4
    println("[numero] es "+o.numero) // 5
    o.numero=num*2 // 6
    println("[numero] es "+o.numero) // 7
    println("[cte1] es "+o.cte1+" (inicializada tardiamente con lazy)") // 8

}