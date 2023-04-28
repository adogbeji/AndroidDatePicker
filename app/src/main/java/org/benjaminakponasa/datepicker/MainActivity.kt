package org.benjaminakponasa.datepicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val datePickerButton: Button  = findViewById(R.id.datePicker)

        datePickerButton.setOnClickListener {
            showDatePicker()
//            Toast.makeText(this,  "Working!", Toast.LENGTH_SHORT).show()
        }
    }

    fun showDatePicker() {
        Toast.makeText(this,  "Working!", Toast.LENGTH_SHORT).show()
    }
}