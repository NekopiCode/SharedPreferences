package and05.lektion1.sharedpreferences_uebung

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()


        findViewById<Button>(R.id.buttonMainActivity).setOnClickListener {
            val eingabeTextSave = findViewById<EditText>(R.id.editTextMainActivity).text.toString()
            editor.apply {
                putString("eingabeTextSave", eingabeTextSave)
                apply()
            }
        }

        findViewById<Button>(R.id.ladenMainActivity).setOnClickListener {
            val textLaden = sharedPref.getString("eingabeTextSave", "Es wurde kein Text gespeichert")
            findViewById<EditText>(R.id.editTextMainActivity).setText(textLaden)
        }



    }
}