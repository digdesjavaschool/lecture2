package com.digdes.java2023.lecture2.dto.task;

import com.digdes.java2023.lecture2.common.enums.TaskStatus;

public class UpdateStatusTaskDto {
    private Long id;
    private TaskStatus status;

    public UpdateStatusTaskDto(Long id, TaskStatus status) {
        this.id = id;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }
}
