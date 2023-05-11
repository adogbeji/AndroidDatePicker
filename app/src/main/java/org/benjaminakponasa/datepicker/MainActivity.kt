package org.benjaminakponasa.datepicker

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import java.util.*

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
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener{ view, year, month, dayOfMonth ->

                Toast.makeText(this, "Working!", Toast.LENGTH_SHORT).show()
            },
            year,
            month,
            day
        ).show()

//        Toast.makeText(this,  "Working!", Toast.LENGTH_SHORT).show()
    }
}