package com.example.srodenas.simulacioncrud.Logic

class Client{
    var id : Int = 0
    var nombre : String = "Por defecto"
    var apellido : String = "Por defecto"
    var telefono : String = "xxxxxxxxx"

    constructor(id: Int, nombre: String, apellido: String, telefono: String) {
        this.id = id
        this.nombre = nombre
        this.apellido = apellido
        this.telefono = telefono
    }

    override fun toString(): String {
        return "Client(id=$id, nombre='$nombre', apellido='$apellido', telefono='$telefono')\n"
    }

}
