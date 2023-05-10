package com.digdes.java2023.lecture2.model;

import java.util.ArrayList;
import java.util.List;

public class Milestone extends BaseTask {
    private List<Task> tasks = new ArrayList<>();

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
