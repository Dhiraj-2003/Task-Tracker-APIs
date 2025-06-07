package com.dhiraj.taskTrackerAPIs.service;

import com.dhiraj.taskTrackerAPIs.entity.Task;
import com.dhiraj.taskTrackerAPIs.entity.TaskStatus;
import com.dhiraj.taskTrackerAPIs.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService{

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElseThrow(()->new RuntimeException("Task not found!!!"));
    }

    @Override
    public Task updateTask(Long id, Task updatedtask) {
        Task task = getTaskById(id);
        task.setTitle(updatedtask.getTitle());
        task.setDescription(updatedtask.getDescription());
        task.setStatus(updatedtask.getStatus());
        task.setDueDate(updatedtask.getDueDate());
        return taskRepository.save(task);
    }

    @Override
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    @Override
    public List<Task> getTasksByStatus(TaskStatus status, Pageable pageable) {
        return taskRepository.findByStatus(status,pageable);
    }

    @Override
    public List<Task> getTasksByDueDate(LocalDate dueDate, Pageable pageable) {
        return taskRepository.findByDueDate(dueDate,pageable);
    }
}
