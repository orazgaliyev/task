package com.orazgaliyev.task.task1.service;

import org.springframework.stereotype.Service;

@Service
public class ConverterService {
    /*
     * Написать программу, которая бы переводила целочисленное число из десятичной системы счисления в любую другую (от двоичной до 36-ой).
     * Для системы счисления больше 10 использовать цифры + буквы английского алфавита.
     * Решение: не факт, что переменная c - верна.
     */

    public String baseConversion(String number, int targetBase) {

        int sourceBase = 10;
        return Integer.toString(
                Integer.parseInt(number, sourceBase),
                targetBase);

    }
}
