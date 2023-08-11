package me.fajar.uts_1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import me.fajar.uts_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        init()
    }

    private fun init() {
        with(binding) {
            btnShow.setOnClickListener {
                tv1.text = "Putih"
                tv2.text = "Hitam"
                tv3.text = "Hitam"
                tv4.text = "Putih"
                tv5.text = "Putih"
                tv6.text = "Hitam"
            }

            btnClear.setOnClickListener {
                tv1.text = ""
                tv2.text = ""
                tv3.text = ""
                tv4.text = ""
                tv5.text = ""
                tv6.text = ""
            }
        }
    }
}