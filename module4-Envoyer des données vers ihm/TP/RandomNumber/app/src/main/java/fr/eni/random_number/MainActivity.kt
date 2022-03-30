package fr.eni.random_number

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import fr.eni.random_number.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var db = ActivityMainBinding.inflate(layoutInflater)
        setContentView(db.root)

        db.btnGenerate.setOnClickListener {
            val min = db.etMinimum.text.toString().toInt()
            val max = db.etMaximum.text.toString().toInt()

            val random = (min..max).random()

            db.jeromeResultat = random.toString()
        }


    }
}