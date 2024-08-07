package net.core.service;

import net.core.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {
    private final List<Task> tasks = new ArrayList<>();

    public void addTask(String description) {
        tasks.add(new Task(description));
    }

    public void completeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).complete();
        } else {
            throw new IndexOutOfBoundsException("Invalid task number.");
        }
    }

    public List<Task> listTasks() {
        return new ArrayList<>(tasks);
    }
}
