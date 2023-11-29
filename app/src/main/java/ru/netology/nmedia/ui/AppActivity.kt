package ru.netology.nmedia.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import ru.netology.nmedia.R

class AppActivity(
) : AppCompatActivity(R.layout.activity_app) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val numbers = listOf(
            0.10F,
            0.10F,
            0.10F,
            0.10F,
            0.10F,
            0.10F,
            0.5F,
            0.5F,
        )

        val sumNumbers = numbers.sum()
        if (sumNumbers != 0F) findViewById<StatsView>(R.id.stats).data = numbers.map {
            it / sumNumbers * 100F
        } else {
            val error = "data not found"
            Toast.makeText(this, error, Toast.LENGTH_LONG)
                .show()
        }
    }
}
