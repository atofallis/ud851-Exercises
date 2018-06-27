package com.example.android.todolist;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.example.android.todolist.database.AppDatabase;
import com.example.android.todolist.database.TaskEntry;

public class AddTaskViewModel extends ViewModel {

    private LiveData<TaskEntry> mTaskEntry;

    public AddTaskViewModel(AppDatabase db, int taskId) {
        mTaskEntry = db.taskDao().loadTaskById(taskId);
    }

    public LiveData<TaskEntry> getTaskEntry() {
        return mTaskEntry;
    }
}
