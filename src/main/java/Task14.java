import java.util.*;
import java.util.stream.Collectors;

/**
 * Перевірте, чи є елементи масиву a множиною (для цього серед елементів
 * масиву не повинно бути двох елементів з однаковим значенням).
 **/
public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<Integer> list = Arrays.stream(Arrays.stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray()).boxed().collect(Collectors.toList());
        //System.out.println("Initial array: " + list);
        if (repeatedNumber(list)) {
            System.out.println("Elements are not a set");
        } else System.out.println("Elements are set");
    }

    public static boolean repeatedNumber(List<Integer> list) {
        if (list.size() <= 1) {
            return false;
        }
        Collections.sort(list);
        for (int i = 0; i < list.size() - 1; i++) {
            if (Objects.equals(list.get(i), list.get(i + 1))) {
                return true;
            }
        }
        return false;
    }
}
