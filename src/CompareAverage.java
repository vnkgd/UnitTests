import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompareAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод первого списка чисел
        List<Double> list1 = readNumberList("Введите числа первого списка (через пробел): ", scanner);
        NumberList numberList1 = new NumberList(list1);

        // Ввод второго списка чисел
        List<Double> list2 = readNumberList("Введите числа второго списка (через пробел): ", scanner);
        NumberList numberList2 = new NumberList(list2);

        // Рассчитывает среднее значение каждого списка.
        double average1 = numberList1.calculateAverage();
        double average2 = numberList2.calculateAverage();

        // Вывод средних значений
        System.out.println("Среднее значение первого списка: " + average1);
        System.out.println("Среднее значение второго списка: " + average2);

        // Сравнивает средние значения и выводит соответствующее сообщение
        compareAverages(numberList1, numberList2);
    }

    private static List<Double> readNumberList(String prompt, Scanner scanner) {
        System.out.print(prompt);
        List<Double> list = new ArrayList<>();
        String[] numbers = scanner.nextLine().split(" ");
        for (String number : numbers) {
            list.add(Double.parseDouble(number));
        }
        return list;
    }

    public static void compareAverages(NumberList list1, NumberList list2) {
        // Сравнивает средние значения и выводит соответствующее сообщение
        if (list1.calculateAverage() > list2.calculateAverage()) {
            System.out.println("Первый список имеет большее среднее значение");
        } else if (list1.calculateAverage() < list2.calculateAverage()) {
            System.out.println("Второй список имеет большее среднее значение");
        } else {
            System.out.println("Средние значения равны");
        }
    }
}