import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите операцию: \n1.Добавить покупку\n2.Показать покупки\n3.Удалить покупку\n4.Найти покупку");

            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    System.out.println("Какую покупку хотите добавить?");
                    String input = scanner1.nextLine();
                    list.add(input);
                    System.out.println("Итоговое количество покупок: " + list.size());
                    break;
                case 2:
                    System.out.println("Список покупок:");
                    boolean empty = false; //флаг пустоты корзины покупок
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i) != null) {
                            System.out.println((i + 1) + ". " + list.get(i));
                            empty = true;
                        }
                    }
                    if (!empty) {
                        System.out.println("Покупок нет");
                    }
                    break;

                case 3:
                    System.out.println("Список покупок:");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println((i + 1) + ". " + list.get(i));
                    }
                    int shopNumber; //заводим номер покупки, выбранной для удаления
                    System.out.println("Какую покупку хотите удалить? Введите номер или название");
                    String shop = scanner1.nextLine();
                    try {
                        shopNumber = Integer.parseInt(shop);
                        String shopRemove = list.get(shopNumber - 1); //сохраняем название покупки перед её удалением из списка
                        list.remove(shopNumber - 1);

                        System.out.println("Покупка " + '"' + shopRemove + '"' + " Удалена. Список покупок:");
                        for (int i = 0; i < list.size(); i++) {
                            System.out.println((i + 1) + ". " + list.get(i));
                        }
                    } catch (NumberFormatException e) {
                        list.remove(shop);
                        System.out.println("Покупка " + '"' + shop + '"' + " Удалена. Список покупок:");
                        for (int i = 0; i < list.size(); i++) {
                            System.out.println((i + 1) + ". " + list.get(i));
                        }
                    }
                    break;
                case 4:
                    System.out.println("Введите текст для поиска:");
                    input = scanner1.nextLine();
                    String queryLower = input.toLowerCase();
                    boolean empty1 = false; //флаг пустого результата поиска
                    System.out.println("Найдено:");
                    for (int i = 0; i < list.size(); i++) {
                        String itemLower = list.get(i).toLowerCase();
                        if (itemLower.contains(queryLower)) {
                            empty1 = true;
                            System.out.println((i + 1) + ". " + list.get(i));
                        }
                    }
                    if (!empty1) {
                        System.out.println("По вашему запросу покупок нет");
                    }
                    break;
            }
        }
    }
}

