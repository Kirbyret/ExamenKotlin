package com.example.examenkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {


    private lateinit var btnIngresar : Button

    private lateinit var btnSalir : Button

    private lateinit var txtNumeroCuenta: EditText

    private lateinit var txtNombre: EditText

    private lateinit var txtBanco: EditText

    private lateinit var txtSaldo: EditText

    private var nombre=""
    private var banco=""
    private var saldo=""
    private var numCuenta=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iniciarComponentes();
        btnIngresar.setOnClickListener(View.OnClickListener { btnIngresar() })
        btnSalir.setOnClickListener(View.OnClickListener { btnSalir() })


    }

    private fun iniciarComponentes()
    {
        btnIngresar=findViewById(R.id.btnEnviar)
        btnSalir=findViewById(R.id.btnSalir)
        txtNombre=findViewById(R.id.txtNombre)
        txtBanco=findViewById(R.id.txtBanco)
        txtSaldo=findViewById(R.id.txtSaldo)
        txtNumeroCuenta=findViewById(R.id.txtNumeroCuenta)

    }


    private fun btnSalir() {
        val confirmar = AlertDialog.Builder(this)

        confirmar.setTitle("BANCO")
        confirmar.setMessage("¿Desea Salir?")
        confirmar.setPositiveButton("Confirmar") { dialog, which ->
            finish()
        }
        confirmar.setNegativeButton("Cancelar") { dialog, which ->
            // No hacer nada
        }

        confirmar.show()
    }

}