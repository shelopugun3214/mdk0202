import java.util.HashMap;
import java.util.Map;

public class task5 {
        private static Map<Long, User> users = new HashMap<>();
        public static void main(String[] args) {
            for (long i = 1; i <= 1_000_000L; i++) {
                users.put(i, new User(i, "Имя " + i));
            }

            final long startTime = System.nanoTime();
            User user = findUser(378_366L);
            final long endTime = System.nanoTime();

            long duration = endTime - startTime;
            System.out.println("Найден пользователь: " + user);
            System.out.println("Поиск занял " + duration + " наносекунд.");
            System.out.println("Ориентировочное ускорение: в десятки–сотни тысяч раз по сравнению с линейным поиском.");
        }
        private static User findUser(Long userId) {
            return users.get(userId);
        }
        static class User {
            Long id;
            String name;

            public User(Long id, String name) {
                this.id = id;
                this.name = name;
            }

            @Override
            public String toString() {
                return "User{id=" + id + ", name='" + name + "'}";
            }
        }
    }

