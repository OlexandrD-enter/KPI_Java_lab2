import java.util.Scanner;
/**
 * Визначте номер дня в році по заданому номеру дня в місяці і номеру місяця
 * (вводяться як аргументи при виклику програми). Ознака, чи є рік високосним,
 * задається як булевська змінна. Вказівка: кількість днів до початку
 * цього місяця (НЕ високосний рік): январь 0, лютий - 31, березень - 59, квітень - 90, травень -120,
 * червень - 151, липень - 181, серпень - 212, вересень - 243, жовтень - 273, листопад - 314,
 * грудень - 334 задати у вигляді масиву. У високосному році, починаючи з березня,
 * до кількості днів додається 1.*/
public class Task24 {
    static int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter date and leap year marker in format: dd mm true/false: ");
                String input = sc.nextLine();
                System.out.println("Number in the year: " + dayOfYear(input));
                break;
            } catch (NumberFormatException e) {
                System.out.println("You entered not correct data");
            }
        }
    }

    static int dayOfYear(String date) {
        int day = Integer.parseInt(date.substring(0, 2));
        int month = Integer.parseInt(date.substring(3, 5));
        boolean leap = Boolean.parseBoolean(date.substring(6));
        if (day == 29 && month == 2 && !leap) {
            throw new NumberFormatException("Not valid data for this not leap year");
        }
        if (leap && month > 2) {
            day++;
        }
        while (--month > 0) {
            day = day + days[month - 1];
        }
        return day;
    }
}
