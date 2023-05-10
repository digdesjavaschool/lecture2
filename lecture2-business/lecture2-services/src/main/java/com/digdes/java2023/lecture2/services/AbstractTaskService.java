package com.digdes.java2023.lecture2.services;

import com.digdes.java2023.lecture2.common.enums.TaskStatus;
import com.digdes.java2023.lecture2.dto.task.CreateTaskDto;
import com.digdes.java2023.lecture2.dto.task.TaskDto;
import com.digdes.java2023.lecture2.dto.task.UpdateStatusTaskDto;
import com.digdes.java2023.lecture2.mapping.TaskMapper;
import com.digdes.java2023.lecture2.model.BaseTask;
import com.digdes.java2023.lecture2.repositories.BaseTaskRepository;

import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractTaskService {
    protected final TaskMapper taskMapper;
    protected final BaseTaskRepository baseTaskRepository;

    public AbstractTaskService(TaskMapper taskMapper, BaseTaskRepository baseTaskRepository) {
        this.taskMapper = taskMapper;
        this.baseTaskRepository = baseTaskRepository;
    }


    public TaskDto create(CreateTaskDto newTask) {
        BaseTask task = taskMapper.create(newTask);
        task = baseTaskRepository.createTask(task);
        return taskMapper.map(task);
    }


    public List<TaskDto> getAll() {
        List<BaseTask> tasks = baseTaskRepository.getAll();
        return tasks.stream().map(taskMapper::map).collect(Collectors.toList());
    }


    public TaskDto updateStatus(UpdateStatusTaskDto updateStatusTaskDto) {
        return taskMapper.map(
                baseTaskRepository.updateStatus(updateStatusTaskDto.getId(), updateStatusTaskDto.getStatus()));
    }
    public TaskDto getById(Long id) {
        return taskMapper.map(baseTaskRepository.getById(id));
    }

}
