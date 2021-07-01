package br.com.mz.banco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import br.com.mz.banco.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.iSaldo.setOnClickListener{
            val intent = Intent(this,Saldo::class.java)
            startActivity(intent)
        }

        binding.tSaldo.setOnClickListener{
            val intent = Intent(this,Saldo::class.java)
            startActivity(intent)
            finish()
        }


    }
}