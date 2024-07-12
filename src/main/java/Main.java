import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        integerList.stream().filter(integer -> integer % 2 == 0).forEach(System.out::println);

        System.out.println("Step 2 ------------------------------------------------");

        integerList.stream().map(integer -> integer * 2).forEach(System.out::println);

        System.out.println("Step 3 ------------------------------------------------");

        integerList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println("Step 4 ------------------------------------------------");

        int sum = integerList.stream().reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);
    }
}
