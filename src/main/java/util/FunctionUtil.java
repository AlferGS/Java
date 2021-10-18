package util;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@Slf4j
public class FunctionUtil {
    public static Integer validateNumber(String notConvertedInteger) {

        int convertedInteger;
        if (notConvertedInteger.isEmpty()) {
            throw new IllegalArgumentException("Пустая строка (Error 400)");
        }
        try {
            convertedInteger = Integer.parseInt(notConvertedInteger);
        } catch (NumberFormatException e) {
            log.error(e.getMessage() + "\t" + e.toString());
            throw new NumberFormatException("Ошибка преобразования (Error 500 - Internal Server Error)");
        }

        if (convertedInteger == 0) {
            throw new IllegalArgumentException("Число равно нулю (Error 400 - Bad Request)");
        }
        if (convertedInteger < 0) {
            throw new IllegalArgumentException("Число меньше нуля (Error 400 - Bad Request)");
        }
        return convertedInteger;
    }
}