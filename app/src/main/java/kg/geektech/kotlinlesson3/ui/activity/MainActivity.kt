package kg.geektech.kotlinlesson3.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.geektech.kotlinlesson3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }
}