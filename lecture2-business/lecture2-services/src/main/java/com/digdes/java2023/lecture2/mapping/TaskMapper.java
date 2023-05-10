package com.digdes.java2023.lecture2.mapping;

import com.digdes.java2023.lecture2.dto.task.CreateTaskDto;
import com.digdes.java2023.lecture2.dto.task.TaskDto;
import com.digdes.java2023.lecture2.model.BaseTask;


public interface TaskMapper {
    public BaseTask create(CreateTaskDto dto);

    public TaskDto map(BaseTask entity);
}
