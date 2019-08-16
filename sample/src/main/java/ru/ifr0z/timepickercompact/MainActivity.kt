package ru.ifr0z.timepickercompact

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.main_activity.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        userInterface()
    }

    private fun userInterface() {
        save_time_b.setOnClickListener {
            val customTime = "${time_p.hour}:${time_p.minute}"
            output_time_tv.text = customTime
        }
    }
}