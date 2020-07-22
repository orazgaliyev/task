package com.orazgaliyev.task.controller;

import com.orazgaliyev.task.task1.service.ConverterService;
import com.orazgaliyev.task.task2.service.CalculationService;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@CommonsLog
@RestController
public class TaskController {
    private final ConverterService converterService;
    private final CalculationService calculationService;
    private static final String error = "Base must be less than 36 and bigger than 2";

    public TaskController(ConverterService converterService, CalculationService calculationService) {
        this.converterService = converterService;
        this.calculationService = calculationService;
    }

    @PostMapping("task/1")
    public String task1(String a, int b) {
        if (b <= 2 || b >= 36) {
            log.error(error);
            return error;
        }
        return converterService.baseConversion(a, b);
    }

    @PostMapping("task/2")
    public String task2(String a) {
        return calculationService.doActions(a);
    }

    @PostMapping("task/3")
    public String task3(String a) {
        return calculationService.doActions(a);
    }

}