package com.tyron.builder.api.internal.tasks;

import com.tyron.builder.api.Task;

public class CircularDependencyException extends RuntimeException {

    public CircularDependencyException(Task first, Task second) {
        super("Circular dependency detected: " + first + " <-> " + second);
    }
}
