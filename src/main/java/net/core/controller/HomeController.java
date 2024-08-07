package net.core.controller;

import net.core.service.CaesarCipherService;
import net.core.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @Autowired
    private CaesarCipherService caesarCipherService;

    @Autowired
    private TaskService taskService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/caesar")
    public String caesar() {
        return "caesar";
    }

    @PostMapping("/caesar/encrypt")
    public String encrypt(@RequestParam String text,
                          @RequestParam int shift,
                          Model model) {
        String result = caesarCipherService.encrypt(text, shift);
        model.addAttribute("result", result);
        return "caesar";
    }

    @PostMapping("/caesar/decrypt")
    public String decrypt(@RequestParam String text,
                          @RequestParam int shift,
                          Model model) {
        String result = caesarCipherService.decrypt(text, shift);
        model.addAttribute("result", result);
        return "caesar";
    }

    @GetMapping("/task")
    public String task(Model model) {
        model.addAttribute("tasks", taskService.listTasks());
        return "task";
    }

    @PostMapping("/task/add")
    public String addTask(@RequestParam String description,
                          Model model) {
        taskService.addTask(description);
        model.addAttribute("tasks", taskService.listTasks());
        return "task";
    }

    @PostMapping("/task/complete")
    public String completeTask(@RequestParam int taskId,
                               Model model) {
        taskService.completeTask(taskId);
        model.addAttribute("tasks", taskService.listTasks());
        return "task";
    }
}
