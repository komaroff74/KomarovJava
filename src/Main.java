import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите имя");
        String userInputName = scan.nextLine();
        name(userInputName);
        System.out.println("Введите число");
        int userInputNumber = scan.nextInt();
        number(userInputNumber);

    }

    private static void name(String name) {
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }

    private static void number(int number) {
        if (number > 7) {
            System.out.println("Привет");
        }

        System.out.println("Введите размер массива: ");
        Scanner scan = new Scanner(System.in);
        int cycle = scan.nextInt();
        int[] arr = new int[cycle];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < cycle; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Вывод элементов кратных 3: ");
        for (int i = 0; i < cycle; i++) {
            if (arr[i] % 3 == 0) {
                System.out.println(arr[i]);
            }
        }
    }

}
