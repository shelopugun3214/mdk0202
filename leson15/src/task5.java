import java.util.List;
import java.util.Set;
import java.util.HashSet;

class task5 {
    private static List<String> allPurchases = List.of(
            "яблоки",
            "молоко",
            "колбаса",
            "огурцы",
            "сок",
            "хлеб",
            "виноград",
            "молоко",
            "йогурт",
            "хлеб",
            "пельмени"
    );

    public static void main(String[] args) {
        Set<String> uniquePurchases = findUniquePurchases(allPurchases);

        System.out.println("За месяц было куплено " + uniquePurchases.size() + " уникальных товаров.");
    }

    public static Set<String> findUniquePurchases(List<String> allPurchases) {
        return new HashSet<>(allPurchases);
    }
}