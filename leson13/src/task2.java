
import java.util.HashMap;
import java.util.Map;

public class task2 {
    public static void main(String[] args) {
        Map<String, Boolean> todos = new HashMap<>();

        todos.put("Выучить Java", true);
        todos.put("Найти классную работу", false);

        // Очищаем хеш-таблицу
        todos.clear();

        System.out.println("Todo-список пуст? Ответ: " + todos.isEmpty());
    }
}