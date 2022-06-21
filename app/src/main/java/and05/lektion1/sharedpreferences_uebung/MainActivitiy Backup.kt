package and05.lektion1.sharedpreferences_uebung

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
 /*
class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()


        findViewById<Button>(R.id.buttonSave).setOnClickListener{
            val name = findViewById<EditText>(R.id.editTextTextPersonName).text.toString()
            val age = findViewById<EditText>(R.id.editTextTextPersonName2).text.toString().toInt()
            val adult = findViewById<CheckBox>(R.id.checkBox).isChecked

            editor.apply{
                putString("name", name)
                putInt("age", age)
                putBoolean("isAdult", adult)
                apply()
            }
        }

        findViewById<Button>(R.id.buttonLoad).setOnClickListener{
            val name = sharedPref.getString("name", null)
            val age = sharedPref.getInt("age", 0)
            val adult = sharedPref.getBoolean("isAdult", false)

            findViewById<EditText>(R.id.editTextTextPersonName).setText(name)
            findViewById<EditText>(R.id.editTextTextPersonName2).setText(age.toString())
            findViewById<CheckBox>(R.id.checkBox).isChecked = adult

        }

    }
}

*/