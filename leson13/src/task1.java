
import java.util.HashMap;
import java.util.Map;

public class task1 {
    public static void main(String[] args) {
        Map<String, Integer> citiesPopulation = new HashMap<>();
        citiesPopulation.put("Москва", 12_655_050);
        citiesPopulation.put("Лондон", 8_961_989);
        citiesPopulation.put("Нью-Йорк", 8_804_190);

        String city = "Париж";

        if (citiesPopulation.containsKey(city)) {
            Integer cityPopulation = citiesPopulation.get(city);
            int nextYearPopulation = (int) (cityPopulation * 1.01);
            System.out.println("Через 1 год население города " + city + " будет: " + nextYearPopulation);
        } else {
            System.out.println("Информация о городе " + city + " отсутствует. Невозможно сделать прогноз.");
        }
    }
}