package org.benjaminakponasa.datepicker

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private var selectedDate: TextView? = null
    private var displayAge: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val datePickerButton: Button  = findViewById(R.id.datePicker)
        selectedDate = findViewById(R.id.selectedDate)
        displayAge = findViewById(R.id.displayAge)

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
        val dpd = DatePickerDialog(this,
            { view, year, month, dayOfMonth ->

                Toast.makeText(this, "Year: $year, Month: ${month + 1}, Day: $dayOfMonth", Toast.LENGTH_SHORT).show()

                val date = "$day/${month + 1}/$year"

                selectedDate?.text = date

                val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)

                val dateObj = sdf.parse(date)

                val selectedDateInMinutes = dateObj.time / 60000

                val currentDate = sdf.parse(sdf.format(System.currentTimeMillis()))

                val currentDateInMinutes = currentDate.time / 60000

                val differenceInMinutes = currentDateInMinutes - selectedDateInMinutes

                displayAge?.text = differenceInMinutes.toString()
            },
            year,
            month,
            day
        )

        dpd.show()
    }
}