package me.fajar.aplikasi_persegi_panjang

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import me.fajar.aplikasi_persegi_panjang.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        init()
    }

    private fun init() {
        with(binding) {
            btnHitung.setOnClickListener {
                try {
                    val panjang = etPanjang.text.toString().toDouble()
                    val lebar = etLebar.text.toString().toDouble()
                    val luas = panjang * lebar
                    tvHasil.text = luas.toString()
                } catch (e: Exception) {
                    Toast.makeText(
                        this@MainActivity,
                        "Mohon masukkan panjang dan lebar",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }

            btnClear.setOnClickListener {
                etPanjang.text?.clear()
                etLebar.text?.clear()
                tvHasil.text = ""
            }
        }
    }
}