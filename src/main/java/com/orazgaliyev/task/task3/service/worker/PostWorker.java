package com.orazgaliyev.task.task3.service.worker;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class PostWorker {

    final int sendBoxes;
    final int time;
    final int operationsQuantity;
    final int restTime;
    final int restTimeExtra;

    public abstract void doOperation();
}
