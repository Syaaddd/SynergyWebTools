package net.core.service;

import net.core.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    private final List<Task> tasks = new ArrayList<>();

    public List<Task> listTasks() {
        return new ArrayList<>(tasks);
    }

    public void addTask(String description) {
        tasks.add(new Task(description, false));
    }

    public void completeTask(int taskId) {
        tasks.get(taskId).setCompleted(true);
    }
}
