package com.dhiraj.taskTrackerAPIs.service;

import com.dhiraj.taskTrackerAPIs.entity.Task;
import com.dhiraj.taskTrackerAPIs.entity.TaskStatus;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;
import java.util.List;

public interface TaskService {
    Task createTask(Task task);
    List<Task> getAllTasks();
    Task getTaskById(Long id);
    Task updateTask(Long id, Task task);
    void deleteTask(Long id);
    List<Task> getTasksByStatus(TaskStatus status, Pageable pageable);
    List<Task> getTasksByDueDate(LocalDate dueDate, Pageable pageable);
}

