package com.example.two_notifications_one_non_clickable_and_another_clickable

import android.app.*
import android.content.*
import android.content.pm.PackageManager
import android.os.*
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat

class MainActivity : AppCompatActivity() {

    private val CHANNEL_ID = "my_channel"
    private val N1 = 1
    private val N2 = 2

    override fun onCreate(b: Bundle?) {
        super.onCreate(b)
        setContentView(R.layout.activity_main)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (checkSelfPermission(android.Manifest.permission.POST_NOTIFICATIONS)
                != PackageManager.PERMISSION_GRANTED) {

                requestPermissions(
                    arrayOf(android.Manifest.permission.POST_NOTIFICATIONS),
                    101
                )
            }
        }

        createChannel()

        findViewById<Button>(R.id.btnShowNonClickableNotification)
            .setOnClickListener { showNonClickable() }

        findViewById<Button>(R.id.btnShowClickableNotification)
            .setOnClickListener { showClickable() }
    }

    private fun createChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val ch = NotificationChannel(
                CHANNEL_ID,
                "My Channel",
                NotificationManager.IMPORTANCE_HIGH
            )
            val manager = getSystemService(Context.NOTIFICATION_SERVICE)
                    as NotificationManager
            manager.createNotificationChannel(ch)
        }
    }

    private fun showClickable() {
        val pi = PendingIntent.getActivity(
            this,
            0,
            Intent(this, MainActivity::class.java),
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )

        val n = NotificationCompat.Builder(this, CHANNEL_ID)
            .setSmallIcon(R.mipmap.ic_launcher)
            .setContentTitle("Clickable Notification")
            .setContentText("Click to reload the app")
            .setContentIntent(pi)
            .setAutoCancel(true)
            .build()

        val manager = getSystemService(Context.NOTIFICATION_SERVICE)
                as NotificationManager
        manager.notify(N2, n)
    }

    private fun showNonClickable() {
        val n = NotificationCompat.Builder(this, CHANNEL_ID)
            .setSmallIcon(R.mipmap.ic_launcher)
            .setContentTitle("Non-Clickable Notification")
            .setContentText("This notification cannot be clicked.")
            .setAutoCancel(true)
            .build()

        val manager = getSystemService(Context.NOTIFICATION_SERVICE)
                as NotificationManager
        manager.notify(N1, n)
    }
}






//app -> manifests -> AndroidManifests.xml : after <manifest> add this :
//<uses-permission android:name="android.permission.POST_NOTIFICATIONS" />
//output:
//
//Button 1 → Non-clickable notification
//Button 2 → Clickable notification → Reopens app