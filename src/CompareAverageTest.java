import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

public class CompareAverageTest {

    @Test
    public void testCompareAverages() {
        // Создаем два списка для теста
        List<Double> list1 = Arrays.asList(1.0, 2.0, 3.0);
        List<Double> list2 = Arrays.asList(4.0, 5.0, 6.0);

        // Создаем объекты NumberList для теста.
        NumberList numberList1 = new NumberList(list1);
        NumberList numberList2 = new NumberList(list2);

        // Вызываем метод сравнения
        String result = compareAverages(numberList1, numberList2);

        // Проверяем, что результат соответствует ожиданиям
        assertEquals("Второй список имеет большее среднее значение", result);
    }

    private String compareAverages(NumberList list1, NumberList list2) {
        // Сравнивает средние значения и возвращает соответствующее сообщение
        if (list1.calculateAverage() > list2.calculateAverage()) {
            return "Первый список имеет большее среднее значение";
        } else if (list1.calculateAverage() < list2.calculateAverage()) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }
}