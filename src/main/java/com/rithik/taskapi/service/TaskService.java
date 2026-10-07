package com.rithik.taskapi.service;

import com.rithik.taskapi.model.Task;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class TaskService {

    private final AtomicLong nextId = new AtomicLong(1);
    private final List<Task> tasks = new CopyOnWriteArrayList<>();

    public Task createTask(String title) {
        Task task = new Task(nextId.getAndIncrement(), title, false);
        tasks.add(task);
        return task;
    }

    public List<Task> getAllTasks() {
        return List.copyOf(tasks);
    }
}
