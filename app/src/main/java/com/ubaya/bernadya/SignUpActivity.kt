package com.ubaya.bernadya

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.ubaya.bernadya.databinding.ActivitySignUpBinding


class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener{

            if (binding.cbAgree.isChecked){
                if (!checkInputs()){
                    val fname = binding.firstNameTxt.text.toString()
                    val lname = binding.lastNameTxt.text.toString()
                    val username = binding.usernameTxt.text.toString()
                    val password = binding.usernameTxt.text.toString()

                    val map = mapOf(
                        "fname" to fname,
                        "lname" to lname,
                        "username" to username,
                        "password" to password
                    )
                    val gson = Gson()
                    val userJson = gson.toJson(map)
                    Log.d("JSONUSER", userJson)
                    val sharedPreferences: SharedPreferences = getSharedPreferences("BERNADYAESPORT", Context.MODE_PRIVATE)
                    val editor = sharedPreferences.edit() //nyimpen string
                    editor.putString("USER", userJson)
                    editor.apply()

                    val intent = Intent(this,MainActivity2::class.java)
                    startActivity(intent)
                }
            }
            else{
                Toast.makeText(this, "Don't forget to check the agreement", Toast.LENGTH_SHORT).show()
            }
        }
        binding.btnSignin.setOnClickListener{
            val intent = Intent(this,SignInActivity::class.java)
            startActivity(intent)
        }


    }

    fun checkInputs(): Boolean {
        var error = false

        if (binding.usernameTxt.text.toString() == "" ||
            binding.lastNameTxt.text.toString() == "" ||
            binding.firstNameTxt.text.toString() == ""||
            binding.passwordTxt.text.toString() == ""||
            binding.repeatPasswordTxt.text.toString() == ""){
            error = true
            Toast.makeText(this, "Please answer the question", Toast.LENGTH_SHORT).show()
        }
        if (checkPassword()) error = true

        return error
    }
    fun checkPassword(): Boolean {
        var error = false

        if (binding.passwordTxt.text.toString() != binding.repeatPasswordTxt.text.toString()) {
            error = true
            Toast.makeText(this, "Your password isn't same", Toast.LENGTH_SHORT).show()
        }
        return error
    }
}