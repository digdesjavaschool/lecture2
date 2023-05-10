package com.digdes.java2023.lecture2.repositories;

import com.digdes.java2023.lecture2.common.enums.TaskStatus;
import com.digdes.java2023.lecture2.common.exceptions.NotFoundException;
import com.digdes.java2023.lecture2.model.BaseTask;

import java.util.List;

public interface BaseTaskRepository<T extends BaseTask> {
    T createTask(T task);

    T updateTask(T task);

    T getById(Long id) throws NotFoundException;
    T updateStatus(Long id, TaskStatus status);

    List<T> getAll();
}
