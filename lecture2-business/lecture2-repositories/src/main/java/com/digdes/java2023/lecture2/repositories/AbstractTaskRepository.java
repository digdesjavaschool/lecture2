package com.digdes.java2023.lecture2.repositories;

import com.digdes.java2023.lecture2.common.enums.TaskStatus;
import com.digdes.java2023.lecture2.common.exceptions.NotFoundException;
import com.digdes.java2023.lecture2.model.BaseTask;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public abstract class AbstractTaskRepository<T extends BaseTask> implements BaseTaskRepository<T> {
    protected final List<T> tasks = new ArrayList<>();
    protected final AtomicLong idGenerator = new AtomicLong(0L);

    @Override
    public T updateTask(T updatedTask) {
        T task = getById(updatedTask.getId());

        if (task != null) {
            tasks.remove(task);
            tasks.add(updatedTask);
        }
        return task;
    }

    @Override
    public T getById(Long id)  {
        T task = tasks.stream().filter(t -> t.getId().equals(id)).findFirst().orElseGet(null);

        if (task == null) {
            throw new NotFoundException();
        }
        return task;
    }

    @Override
    public T createTask(T task) {
        task.setId(idGenerator.incrementAndGet());
        task.setDateCreated(new Date());
        task.setDateUpdated(new Date());
        task.setStatus(TaskStatus.NEW);
        tasks.add(task);
        return task;
    }

    @Override
    public T updateStatus(Long id, TaskStatus status) {
        T task = getById(id);
        if (task != null) {
            task.setStatus(status);
        }
        return task;
    }

    @Override
    public List<T> getAll() {
        return tasks;
    }
}
