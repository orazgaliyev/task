package com.orazgaliyev.task.task3.service.worker;

public class Sender extends PostWorker {
    Sender(int sendBoxes, int time, int operationsQuantity, int restTime, int restTimeExtra) {
        super(sendBoxes, time, operationsQuantity, restTime, restTimeExtra);
    }

    @Override
    public void doOperation() {

    }
}
