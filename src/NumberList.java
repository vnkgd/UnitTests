//.
import java.util.List;

public class NumberList {
    private List<Double> numbers;

    public NumberList(List<Double> numbers) {
        this.numbers = numbers;
    }

    public double calculateAverage() {
        if (numbers.isEmpty()) {
            return 0.0;
        }

        double sum = 0;
        for (Double number : numbers) {
            sum += number;
        }

        return sum / numbers.size();
    }

    public List<Double> getNumbers() {
        return numbers;
    }
}