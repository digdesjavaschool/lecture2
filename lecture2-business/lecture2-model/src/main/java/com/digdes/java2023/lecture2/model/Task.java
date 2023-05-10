package com.digdes.java2023.lecture2.model;


public class Task extends BaseTask {

    private Member executor;
    private Milestone milestone;

    public Member getExecutor() {
        return executor;
    }

    public void setExecutor(Member executor) {
        this.executor = executor;
    }
}
