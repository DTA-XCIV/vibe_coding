package com.example.waterreminder

import android.content.Context
import androidx.work.ExistingPeriodicWorkPolicy
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import java.util.concurrent.TimeUnit

class ReminderScheduler(private val context: Context) {

    fun scheduleHourlyReminder() {
        val workManager = WorkManager.getInstance(context)
        val request = PeriodicWorkRequestBuilder<ReminderWorker>(1, TimeUnit.HOURS)
            .setInitialDelay(1, TimeUnit.HOURS)
            .build()

        workManager.enqueueUniquePeriodicWork(
            UNIQUE_WORK_NAME,
            ExistingPeriodicWorkPolicy.UPDATE,
            request
        )
    }

    fun ensureReminderScheduled() {
        scheduleHourlyReminder()
    }

    companion object {
        private const val UNIQUE_WORK_NAME = "hourly_water_reminder"
    }
}
