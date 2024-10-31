import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Tasksheet124 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, -2, 10, 15, -7, 8, 0, 21, -3, 5);

        Predicate<Integer> isPositive = number -> number >= 0;
        Predicate<Integer> isEven = number -> number % 2 == 0;
        Predicate<Integer> isGreaterThanTen = number -> number > 10;

        List<Integer> positiveNumbers = filterList(numbers, isPositive);
        List<Integer> evenNumbers = filterList(numbers, isEven);
        List<Integer> greaterThanTenNumbers = filterList(numbers, isGreaterThanTen);

        System.out.println("Original List: " + numbers);
        System.out.println("Positive Numbers: " + positiveNumbers);
        System.out.println("Even Numbers: " + evenNumbers);
        System.out.println("Numbers Greater Than 10: " + greaterThanTenNumbers);
    }

    public static List<Integer> filterList(List<Integer> list, Predicate<Integer> condition) {
        return list.stream()
                   .filter(condition)
                   .collect(Collectors.toList());
    }
}
