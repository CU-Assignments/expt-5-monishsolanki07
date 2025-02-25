import java.util.ArrayList;
import java.util.List;

public class SumCalculator {

    public static void main(String[] args) {
        List<String> numberStrings = List.of("10", "20", "30", "40", "50");
        List<Integer> numbers = new ArrayList<>();
        for (String numStr : numberStrings) {
            numbers.add(Integer.parseInt(numStr));
        }
        int sum = calculateSum(numbers);
        System.out.println("The sum of the numbers is: " + sum);
    }

    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        return sum;
    }
}
