
import java.util.HashMap;
import java.util.Map;

public class task4 {
    private Map<String, Integer> orders = new HashMap<>();

    public static void main(String[] args) {
        task4 pizzeria = new task4();
        pizzeria.openPizzeria();
        pizzeria.printStatistics();
    }

    private void openPizzeria() {
        newOrder("Леонардо");
        newOrder("Донателло");
        newOrder("Рафаэль");
        newOrder("Леонардо");
        newOrder("Микеланджело");
        newOrder("Шреддер");
        newOrder("Донателло");
    }

    private void newOrder(String clientName) {
        // Получаем текущее количество заказов (или 0, если клиента ещё нет)
        int currentCount = orders.getOrDefault(clientName, 0);
        // Увеличиваем счётчик и сохраняем обратно
        orders.put(clientName, currentCount + 1);
    }

    private void printStatistics() {
        int totalOrders = 0;

        // Проходим по всем записям в хеш-таблице
        for (Map.Entry<String, Integer> entry : orders.entrySet()) {
            String clientName = entry.getKey();
            int count = entry.getValue();
            System.out.println("Заказов от " + clientName + ": " + count);
            totalOrders += count;
        }

        System.out.println("Всего заказов: " + totalOrders);
    }
}