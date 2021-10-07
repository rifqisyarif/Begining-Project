package com.example.myapplication

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar

class LoginActivity : AppCompatActivity() {

    private lateinit var dataEmail: Array<String>
    private lateinit var dataPassword: Array<String>
    private var progressBar: ProgressBar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val edtEmail : EditText = findViewById(R.id.edit_Email)
        val edtPassword : EditText = findViewById(R.id.edit_Password)
        val btnLogin : Button = findViewById(R.id.btn_Login)
        progressBar = findViewById(R.id.progress_Bar)
        val btnRegister : Button = findViewById(R.id.btn_Register)
        val btnForgetPass : TextView = findViewById(R.id.forgot_Password)
        val radioRemember : RadioButton = findViewById(R.id.remember_Me)

        val builder = AlertDialog.Builder(this, R.style.AlertDialog_AppCompat).create()
        builder.setTitle("Harap diisi dengan hati hati")
        builder.setMessage("Tentukan pilihan Anda")
        builder.setIcon(R.drawable.ic_person)
//        builder.setPositiveButton("OK",
//            DialogInterface.OnClickListener { dialog, which })
        builder.setCancelable(true)
        builder.show()

        dataEmail = arrayOf("umar","andika","fatihariz")
        dataPassword = arrayOf("1234", "4321", "1423")

        btnLogin.setOnClickListener{
            progressBar?.visibility = View.VISIBLE
            signIn(edtEmail.text.toString(), edtPassword.text.toString())
        }

        btnRegister.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }



    }


    fun signIn(email:String, Password:String){
        for (i in dataEmail.indices){
            val takeDataEmail = dataEmail.get(i)
            val takeDataPass = dataPassword.get(i)
            if (takeDataEmail == email || takeDataPass == Password){
                Toast.makeText(this, "LogedIn", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, HomeActivity::class.java))
                break
            }else{
                progressBar?.visibility = View.GONE
                Toast.makeText(this, "Akun salah", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
