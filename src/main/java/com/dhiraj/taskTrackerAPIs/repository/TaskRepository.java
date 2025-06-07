package com.dhiraj.taskTrackerAPIs.repository;

import com.dhiraj.taskTrackerAPIs.entity.Task;
import com.dhiraj.taskTrackerAPIs.entity.TaskStatus;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByStatus(TaskStatus status, Pageable pageable);
    List<Task> findByDueDate(LocalDate dueDate, Pageable pageable);
}

