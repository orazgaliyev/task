package com.orazgaliyev.task.task2.service;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.SpelParseException;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.stereotype.Service;

import java.io.*;

@Service
@CommonsLog
public class CalculationService {
    /*
    Есть файл, в котором построчно располагаются простые примеры типа Число1ЗнакЧисло2. Числа типа long, знаки: +,-,*,/
    Например: 1) 30*20; 2) 188-53; 3) 160/2. Нужно вычислить эти значения и записать в другой файл: 1) 600; 2) 135; 3) 80.
    Предусмотреть, что в выражении могут быть умышленные ошибки и его вычислить нельзя (10/0, 10/а, 10//10 и пр). В этом случае вывести,
    что за ошибка в примере.
    */

    public String doActions(String fileName) {
        String fileForWriting = "src/main/resources/static/" + fileName + ".txt";
        try {
            FileReader fr = new FileReader("src/main/resources/static/file.txt");
            BufferedReader reader = new BufferedReader(fr);
            String line;
            line = reader.readLine();

            File file = new File(fileForWriting);
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            ExpressionParser parser = new SpelExpressionParser();
            while (line != null) {
                Long result = parser.parseExpression(line).getValue(Long.class);
                writer.write(result.toString());
                writer.newLine();
                line = reader.readLine();
            }
            writer.close();
        } catch (SpelParseException | IOException e) {
            log.error("Problem parsing right operand");
        }
        return fileForWriting;
    }

}