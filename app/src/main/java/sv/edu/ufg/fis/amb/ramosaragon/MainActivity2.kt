package sv.edu.ufg.fis.amb.ramosaragon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity2 : AppCompatActivity() {
    private lateinit var botonAtras: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        botonAtras = findViewById(R.id.btn_volver)

        botonAtras.setOnClickListener {
            finish()
        }
    }
}