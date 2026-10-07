package com.rithik.taskapi.model;

public record Task(
    long id,
    String title,
    boolean completed
) {}
