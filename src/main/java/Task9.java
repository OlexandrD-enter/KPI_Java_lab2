import java.util.*;
import java.util.stream.Collectors;

/**
 * Сформувати масив b з вихідного одновимірного масиву a за наступним алгоритмом:
 * спочатку йдуть елементи масиву a з парними значеннями в порядку їх зростання,
 * потім елементи з непарними значеннями в порядку їх зменшення.
 * Для визначення кількості парних елементів використовуйте оператор взяття модуля "%".
 **/
public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<Integer> list = Arrays.stream(Arrays.stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray()).boxed().collect(Collectors.toList());
        System.out.println("Initial array: " + list);
        System.out.println("Sorted array: " + sortOddArray(list));
    }

    public static List<Integer> sortOddArray(List<Integer> list) {
        list.sort(Task9::compare);
        return list;
    }

    public static int compare(Integer l, Integer r) {
        if (l % 2 < r % 2) return -1;
        if (l % 2 > r % 2) return 1;
        if (l % 2 == 0 && r % 2 == 0) {
            if (l < r) return -1;
            return 1;
        }
        if (l % 2 == 1 && r % 2 == 1) {
            if (l < r) return 1;
            return -1;
        }
        return 0;
    }

}

