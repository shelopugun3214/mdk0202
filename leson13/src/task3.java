
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class task3 {
    private static List<String> passengerNames = List.of(
            "Василий Петров",
            "Анна Ягирская",
            "Виктория Сотова",
            "Игорь Серов",
            "Людмила Ульянова"
    );

    public static void main(String[] args) {
        Map<String, Integer> seats = assignSeats(passengerNames);
        System.out.println("Места пассажиров: " + seats);
    }

    public static Map<String, Integer> assignSeats(List<String> passengerNames) {
        Map<String, Integer> seats = new HashMap<>();
        int seat = 1; // Первое доступное место

        for (String passenger : passengerNames) {
            seats.put(passenger, seat);
            seat += 1; // Увеличиваем номер места для следующего пассажира
        }

        return seats;
    }
}