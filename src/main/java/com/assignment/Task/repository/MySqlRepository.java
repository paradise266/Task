package com.assignment.Task.repository;

import com.assignment.Task.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MySqlRepository extends JpaRepository<Task, Integer> {
}
