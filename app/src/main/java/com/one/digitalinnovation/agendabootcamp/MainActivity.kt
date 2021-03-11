package com.one.digitalinnovation.agendabootcamp

import android.app.admin.SystemUpdatePolicy
import android.content.Intent
import android.os.Bundle
import android.provider.CalendarContract
import android.widget.Button
import android.provider.CalendarContract.Events.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSentEvent = findViewById(R.id.set_event) as Button
        btnSentEvent.setOnClickListener {

            val intent = Intent(Intent.ACTION_INSERT)
                .setData(CONTENT_URI)
                .putExtra(TITLE, "Bootcamp Everis")
                .putExtra(EVENT_LOCATION, "on line")
                .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, System.currentTimeMillis())
                .putExtra(CalendarContract.EXTRA_EVENT_END_TIME, System.currentTimeMillis() + (60*60*1000))

            startActivity(intent)
        }

    }
}