package com.digdes.java2023.lecture2.services.impl;

import com.digdes.java2023.lecture2.dto.task.CreateTaskDto;
import com.digdes.java2023.lecture2.dto.task.TaskDto;
import com.digdes.java2023.lecture2.dto.task.UpdateStatusTaskDto;
import com.digdes.java2023.lecture2.mapping.TaskMapper;
import com.digdes.java2023.lecture2.model.BaseTask;
import com.digdes.java2023.lecture2.repositories.BaseTaskRepository;
import com.digdes.java2023.lecture2.services.AbstractTaskService;

import java.util.List;
import java.util.stream.Collectors;

public class TaskServiceImpl extends AbstractTaskService {
    public TaskServiceImpl(TaskMapper taskMapper, BaseTaskRepository baseTaskRepository) {
        super(taskMapper, baseTaskRepository);
    }

}
