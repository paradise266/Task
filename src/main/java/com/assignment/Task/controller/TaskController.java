package com.assignment.Task.controller;

import com.assignment.Task.model.Task;
import com.assignment.Task.repository.MySqlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TaskController {

    @Autowired
    MySqlRepository mySqlRepository;

    @RequestMapping("/tasks")
    public List<Task> retrieveAllTasks() {
        return mySqlRepository.findAll();
    }

    @RequestMapping("/tasks/{id}")
    public Task retrieveTaskById(@PathVariable Integer id) {
        return mySqlRepository.findById(id).get();
    }

    @RequestMapping(value = "/tasks", method = RequestMethod.POST)
    public ResponseEntity<Object> createNewTask(@RequestBody Task task) {
        mySqlRepository.save(task);
        return ResponseEntity.created(null).build(); // 201 response
    }

    @RequestMapping(value = "/tasks/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateTaskById(@PathVariable Integer id, @RequestBody Task task) {
        Task current = mySqlRepository.findById(id).get();
        current.setTitle(task.getTitle());
        current.setDescription(task.getDescription());
        current.setCompleted(task.getCompleted());
        mySqlRepository.save(current);
        return ResponseEntity.noContent().build(); // 204 response
    }

    @RequestMapping(value = "/tasks/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteTaskById(@PathVariable Integer id) {
        if (!mySqlRepository.findById(id).equals(Optional.empty())) {
            mySqlRepository.deleteById(id);
        }
        return ResponseEntity.noContent().build(); // 204 response
    }
}
