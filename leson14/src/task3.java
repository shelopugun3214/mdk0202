import java.util.Map;
import java.util.TreeMap;

public class task3 {
    public static void main(String[] args) {
        Map<Car, Integer> cars = new TreeMap<>();
        cars.put(new Car("Audi A6", 3_760_000), 2);
        cars.put(new Car("Honda CR-V ", 2_500_000), 3);
        cars.put(new Car("KIA Cerato", 1_300_000), 8);
        cars.put(new Car("Volkswagen Tiguan", 1_935_000), 5);
        for (Car car : cars.keySet()) {
            System.out.println(car);
        }
    }
}
class Car implements Comparable<Car> {
    String model;
    Integer priceInRubles;

    public Car(String model, Integer priceInRubles) {
        this.model = model;
        this.priceInRubles = priceInRubles;
    }
    @Override
    public int compareTo(Car o) {
        return this.priceInRubles - o.priceInRubles;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        return model.equals(car.model);
    }
    @Override
    public int hashCode() {
        return model.hashCode();
    }
    @Override
    public String toString() {
        return "Car{model='" + model + "', priceInRubles=" + priceInRubles + "}";
    }
}
