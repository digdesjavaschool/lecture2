package com.digdes.java2023.lecture2.services.impl;

import com.digdes.java2023.lecture2.dto.task.TaskDto;
import com.digdes.java2023.lecture2.dto.task.UpdateStatusTaskDto;
import com.digdes.java2023.lecture2.mapping.TaskMapper;
import com.digdes.java2023.lecture2.model.Milestone;
import com.digdes.java2023.lecture2.model.Task;
import com.digdes.java2023.lecture2.repositories.BaseTaskRepository;
import com.digdes.java2023.lecture2.repositories.impl.TaskRepositoryImpl;
import com.digdes.java2023.lecture2.services.AbstractTaskService;

public class MilestoneServiceImpl extends AbstractTaskService {
    private final BaseTaskRepository taskRepository;

    public MilestoneServiceImpl(TaskMapper taskMapper,
                                BaseTaskRepository baseTaskRepository) {
        super(taskMapper, baseTaskRepository);
        this.taskRepository = new TaskRepositoryImpl();
    }

    @Override
    public TaskDto updateStatus(UpdateStatusTaskDto updateStatusTaskDto) {
        TaskDto taskDto = super.updateStatus(updateStatusTaskDto);
        Milestone milestone = (Milestone) super.baseTaskRepository.getById(updateStatusTaskDto.getId());
        for (Task task : milestone.getTasks()) {
            super.updateStatus(new UpdateStatusTaskDto(task.getId(), updateStatusTaskDto.getStatus()));
        }
        return taskDto;
    }
}
