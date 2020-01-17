package com.example.desserttask_android

import android.app.Application
import android.util.Log
import com.example.desserttask_android.tasks.ITask
import com.example.desserttask_android.tasks.TaskImpl
import com.example.desserttask_android.tasks.TaskOne
import com.shen.dessert_task.DessertDispatcher
import com.shen.dessert_task.easyTask

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        DessertDispatcher.init(this)
            .build()
            .create(ITask::class.java, TaskImpl())
            .addTask(TaskOne())
            .addTask(easyTask { Log.d("EasyTask wow", "Start: ${Thread.currentThread().name}") })
            .start()
    }
}