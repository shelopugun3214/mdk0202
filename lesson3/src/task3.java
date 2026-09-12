import java.util.ArrayList;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Показать список всех животных");
            System.out.println("2. Добавить животное");
            System.out.println("3. Удалить животное");
            System.out.println("4. Очистить список");
            System.out.println("5. Проверить, есть ли животное в зоопарке");
            System.out.println("0. Выход");
            System.out.print("Выберите команду: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // очистка буфера

            switch (choice) {
                case 1:
                    if (animals.isEmpty()) {
                        System.out.println("Список животных пуст.");
                    } else {
                        System.out.println("Животные в зоопарке:");
                        for (String animal : animals) {
                            System.out.println(animal);
                        }
                    }
                    break;

                case 2:
                    System.out.print("Введите название животного для добавления: ");
                    String addAnimal = scanner.nextLine();
                    animals.add(addAnimal);
                    System.out.println("Животное добавлено.");
                    break;

                case 3:
                    if (!animals.isEmpty()) {
                        System.out.print("Введите название животного для удаления: ");
                        String removeAnimal = scanner.nextLine();
                        if (animals.remove(removeAnimal)) {
                            System.out.println("Животное удалено.");
                        } else {
                            System.out.println("Такое животное не найдено в списке.");
                        }
                    } else {
                        System.out.println("Список пуст, удалять нечего.");
                    }
                    break;

                case 4:
                    if (!animals.isEmpty()) {
                        animals.clear();
                        System.out.println("Список очищен.");
                    } else {
                        System.out.println("Список уже пуст.");
                    }
                    break;

                case 5:
                    System.out.print("Введите название животного для проверки: ");
                    String checkAnimal = scanner.nextLine();
                    if (animals.contains(checkAnimal)) {
                        System.out.println("Да, " + checkAnimal + " живёт в зоопарке.");
                    } else {
                        System.out.println("Нет, " + checkAnimal + " нет в зоопарке.");
                    }
                    break;

                case 0:
                    System.out.println("Выход из программы.");
                    return;

                default:
                    System.out.println("Неверная команда, попробуйте снова.");
            }
        }
    }
}
