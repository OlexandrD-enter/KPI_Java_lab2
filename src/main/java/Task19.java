import java.util.Arrays;
import java.util.Scanner;

/**
 * Виведіть на дисплей значення і індекси тільки тих елементів масиву a,
 * значення яких не дорівнюють значенням інших елементів,
 * тобто унікальних елементів масиву.
 **/
public class Task19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] arr = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println("Initial array: " + Arrays.toString(arr));
        countUnique(arr);
    }

    public static boolean countUnique(int[] arr) {
        boolean chk = true;
        for (int i = 0; i < arr.length; i++) {
            chk = false;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    chk = true;
                    break;
                }
            }
            if (!chk) {
                System.out.println("Unique Number: " + arr[i] + " Index: " + i);
            }
        }
        return chk;
    }
}
