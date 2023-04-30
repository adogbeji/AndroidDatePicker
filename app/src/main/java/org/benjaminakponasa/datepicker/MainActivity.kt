package org.benjaminakponasa.datepicker

import android.app.DatePickerDialog
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

//        DatePickerDialog()

        Toast.makeText(this,  "Working!", Toast.LENGTH_SHORT).show()
    }
}