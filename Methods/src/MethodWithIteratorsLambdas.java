import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class MethodWithIteratorsLambdas {

    //goes through the list and prints all the elements using a lambda expression
    public static void printElements(List<Integer> list) {
        list.forEach(n -> System.out.println(n));
    }

    //removes all even numbers from the list using a lambda expression
    public static void removeEvenNumbers(List<Integer> list) {
        list.removeIf(n -> n % 2 == 0);
    }

    //doubles all the values in the list using a lambda expression
    public static void doubleValues(List<Integer> list) {
        list.replaceAll(n -> n * 2);
    }

    //sorts the list using a lambda expression
    public static void sortList(List<Integer> list) {
        list.sort((a, b) -> a - b);
    }

    //prints the list using an iterator and a lambda expression
    public static void printWithIterator(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        it.forEachRemaining(n -> System.out.println(n));
    }

    //returns a new list containing only the values greater than the given value
    //using a lambda expression
    public static List<Integer> filterGreaterThan(List<Integer> list, int value) {
        return list.stream()
                .filter(n -> n > value)
                .collect(Collectors.toList());
    }

    //returns a new list containing the values multiplied by the given factor
    //using a lambda expression
    public static List<Integer> multiplyValues(List<Integer> list, int factor) {
        return list.stream()
                .map(n -> n * factor)
                .collect(Collectors.toList());
    }

    //returns the sum of all the values in the list using a lambda expression
    public static int sumList(List<Integer> list) {
        return list.stream()
                .reduce(0, (a, b) -> a + b);
    }

    //returns true if the list contains a negative number, false otherwise
    //using a lambda expression
    public static boolean containsNegative(List<Integer> list) {
        return list.stream()
                .anyMatch(n -> n < 0);
    }

    //returns true if all the values in the list are positive, false otherwise
    //using a lambda expression
    public static boolean allPositive(List<Integer> list) {
        return list.stream()
                .allMatch(n -> n > 0);
    }



}
