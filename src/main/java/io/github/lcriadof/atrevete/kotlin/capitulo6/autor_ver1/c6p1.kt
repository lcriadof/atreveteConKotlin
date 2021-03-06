/*
Atrévete con Kotlin ISBN: 9798596367164
Autor: http://luis.criado.online/index.html
 */
package io.github.lcriadof.atrevete.kotlin.capitulo6.autor_ver1

// c6p1.kt
fun main() {
    val at: Autor = Autor("Luis","Criado","Fernandez")  // 1
    println(at.Nombre+" "+at.apellido1)              // 2
}

// c6p1.kt
class Autor (nom:String, ape1:String, ape2:String){ // 1
    var Nombre:String                          // 2
    var apellido1:String
    var apellido2:String                       // 3

    init{                                           // 4
        this.Nombre=nom
        this.apellido1=ape1
        this.apellido2=ape2
    }
    constructor (nom: String, ape1:String): this(nom, ape1,""){ }  // 5
    constructor (nom: String): this(nom, "",""){ }           // 6
}// fin de clase
