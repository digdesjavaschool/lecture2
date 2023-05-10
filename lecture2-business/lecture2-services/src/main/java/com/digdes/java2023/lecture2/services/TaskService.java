package com.digdes.java2023.lecture2.services;

import com.digdes.java2023.lecture2.common.enums.TaskStatus;
import com.digdes.java2023.lecture2.dto.task.TaskDto;

import java.util.List;

public interface TaskService {
    TaskDto create(TaskDto taskDto);

    List<TaskDto> getAll();

    TaskDto updateStatus(Long id, TaskStatus status);


}
