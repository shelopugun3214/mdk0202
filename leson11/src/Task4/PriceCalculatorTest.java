package Task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PriceCalculatorTest {

    private final PriceCalculator priceCalculator = new PriceCalculator();

    @Test
    public void shouldBeNegativeWhenBikeAndDistanceIs0Km() {
        int distance = 0;
        Integer price = priceCalculator.calculatePrice(TransportType.BIKE, distance);
        Assertions.assertEquals(-1, price);
    }

    @Test
    public void shouldReturn100ForBikeAndDistanceIs10Km() {
        int distance = 10;
        Integer price = priceCalculator.calculatePrice(TransportType.BIKE, distance);
        Assertions.assertEquals(100, price);
    }

    @Test
    public void shouldBeNegativeWhenBikeAndDistanceIs21Km() {
        int distance = 21;
        Integer price = priceCalculator.calculatePrice(TransportType.BIKE, distance);
        Assertions.assertEquals(-2, price);
    }

    @Test
    public void shouldBeNegativeWhenCarAndDistanceIs0Km() {
        int distance = 0;
        Integer price = priceCalculator.calculatePrice(TransportType.CAR, distance);
        Assertions.assertEquals(-1, price);
    }

    @Test
    public void shouldBeNegativeWhenCarAndDistanceIs1001Km() {
        int distance = 1001;
        Integer price = priceCalculator.calculatePrice(TransportType.CAR, distance);
        Assertions.assertEquals(-2, price);
    }

    @Test
    public void shouldReturn7000ForCarAndDistanceIs1000Km() {

        int distance = 1000;
        Integer price = priceCalculator.calculatePrice(TransportType.CAR, distance);
        Assertions.assertEquals(7000, price);
    }

    @Test
    public void shouldBeNegativeWhenTruckAndDistanceIs0Km() {
        int distance = 0;
        Integer price = priceCalculator.calculatePrice(TransportType.TRUCK, distance);
        Assertions.assertEquals(-1, price);
    }

    @Test
    public void shouldReturn5000ForTruckAndDistanceIs1000Km() {
        int distance = 1000;
        Integer price = priceCalculator.calculatePrice(TransportType.TRUCK, distance);
        Assertions.assertEquals(5000, price);
    }

    @Test
    public void shouldBeNullWhenDroneAndDistanceIs0Km() {
        int distance = 0;
        Integer price = priceCalculator.calculatePrice(TransportType.DRONE, distance);
        Assertions.assertNull(price);
    }
}