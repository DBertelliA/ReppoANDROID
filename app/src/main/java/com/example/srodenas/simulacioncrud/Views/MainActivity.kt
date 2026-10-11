package com.example.srodenas.simulacioncrud.Views

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.srodenas.simulacioncrud.Logic.Client
import com.example.srodenas.simulacioncrud.Logic.Controlador
import com.example.srodenas.simulacioncrud.Logic.interfaces.Operaciones
import com.example.srodenas.simulacioncrud.R

class MainActivity : AppCompatActivity() { //Esto es con lo de las lambdas
    public lateinit var myButtonAdd: ImageView
    public lateinit var myButtonUpdate: ImageView
    public lateinit var myButtonDel: ImageView
    public lateinit var  textV : TextView
    lateinit var  cont : Controlador
    companion object{ const val TAG ="---Salida---"}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        Log.d(TAG, "Esto es el mensaje de inicio log")
        cont = Controlador(this)
        cont.start()
    }

    fun showState(): String {
        Log.d(TAG, "Esta es la nueva data" + cont.showData())
        return cont.showData()
    }

    fun updateContent(text1: String){
        textV.text = text1;
    }
}