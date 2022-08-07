import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите операцию: \n1.Добавить покупку\n2.Показать покупки\n3.Удалить покупку");

            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    System.out.println("Какую покупку хотите добавить?");
                    String input = scanner1.nextLine();
                    list.add(input);
                    System.out.println("Итоговое количество покупок: " + list.size());
                case 2:
                    System.out.println("Список покупок:");
                    boolean empty = false;
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i) != null) {
                            System.out.println((i + 1) + ". " + list.get(i));
                            empty = true;
                        }
                    }
                    if (empty) {
                        System.out.println("Покупок нет");
                    }

                }
                case 3:

            }
        }
    }
}
