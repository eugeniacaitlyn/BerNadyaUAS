package com.ubaya.bernadya

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.gson.Gson
import com.ubaya.bernadya.databinding.ActivitySignInBinding
import com.ubaya.bernadya.databinding.ActivitySignUpBinding

class SignInActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener{
            if (!checkInputs()){
                val username = binding.usernameTxt.text.toString()
                val password = binding.usernameTxt.text.toString()

                val gson = Gson()

                val sharedPreferences: SharedPreferences = getSharedPreferences("BERNADYAESPORT", Context.MODE_PRIVATE)
                val userJson = sharedPreferences.getString("USER", "")
                val map: Map<*, *>? = gson.fromJson(userJson, Map::class.java)

                if (map?.get("username") == username && map.get("password") == password) {
                    val intent = Intent(this,MainActivity2::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Incorrect credentials", Toast.LENGTH_SHORT).show()
                }


            }
        }
        binding.btnSignin.setOnClickListener{
            val intent = Intent(this,SignUpActivity::class.java)
            startActivity(intent)
        }
    }

    fun checkInputs(): Boolean {
        var error = false

        if (binding.usernameTxt.text.toString() == "" ||
            binding.passwordTxt.text.toString() == ""){
            error = true
            Toast.makeText(this, "Please answer the question", Toast.LENGTH_SHORT).show()
        }

        return error
    }
}