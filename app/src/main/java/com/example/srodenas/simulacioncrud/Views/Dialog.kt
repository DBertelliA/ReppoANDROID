package com.example.srodenas.simulacioncrud.Views

import com.example.srodenas.simulacioncrud.Data.ClientsRepo
import com.example.srodenas.simulacioncrud.Logic.Controlador
import com.example.srodenas.simulacioncrud.Logic.interfaces.Operaciones
import com.google.android.material.animation.AnimatableView.Listener
import kotlin.math.roundToInt

//simulo un diálogo.
class Dialog(
    controlador: com.example.srodenas.simulacioncrud.Logic.Controlador,
    private val agregarF : (Int, String, String, String) -> Unit,
    private val editF: (Int, String, String, String) -> Unit,
    private val eliminarF: (Int) -> Unit
) {
    private var listener: Operaciones? = null
    private var accion: Int = 0;

    //carga del listener para el botón
    fun setListener(_listener: Operaciones) {
        listener = _listener
    }

    //Lo que muestra el dialogo
    fun show(typeAction: Int) {
        listener?.let {
            val posibleId = (Math.random() + 99).roundToInt()//me da un aleatorio. -1 está vacío para editar/borrar.
            when (typeAction) {
                0 -> addClient() //simulamos que ahora pulsamos el botón aceptar de un nuevo

                1 ->
                    if (posibleId != -1)
                        onEdit(posibleId, "CAMBIADO")

                2 ->
                    if (posibleId != -1)
                        onDelete(posibleId)

            }

        }
    }

    private fun addClient(
        id: Int = (Math.random() + 99).roundToInt(),
        nombre: String = "Ni idea",
        apellido: String = "Obra maestra",
        telefono: String = "cccccccccc"
    ) {
        agregarF(id, nombre, apellido, telefono)
    }

    private fun onDelete(id: Int) {
        eliminarF(id)
    }

    private fun onEdit(
        id: Int,
        nombre: String,
        apellido: String = "Obra maestra",
        telefono: String = "cccccccccc"
    ) {
        editF(id, nombre, apellido, telefono)
    }

}