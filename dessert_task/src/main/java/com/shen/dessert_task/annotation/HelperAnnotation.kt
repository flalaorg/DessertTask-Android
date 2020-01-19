package com.shen.dessert_task.annotation

import android.support.annotation.IntDef
import android.support.annotation.StringDef

@StringDef(value = [Executors.IO, Executors.CPU])
@Retention(AnnotationRetention.SOURCE)
annotation class Executors {
    companion object {
       const val IO: String = "io"
       const val CPU: String = "cpu"
    }
}

@IntDef(value = [
    Priorities.THREAD_PRIORITY_FOREGROUND.toLong(),
    Priorities.THREAD_PRIORITY_BACKGROUND.toLong(),
    Priorities.THREAD_PRIORITY_LOWEST.toLong()
])
@Retention(AnnotationRetention.SOURCE)
annotation class Priorities {
    companion object {
        const val THREAD_PRIORITY_FOREGROUND = -2
        const val THREAD_PRIORITY_BACKGROUND = 10
        const val THREAD_PRIORITY_LOWEST = 19
    }
}