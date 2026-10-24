
public class task1 {
    public String fixString(String str) {
        if (str == null || str.isBlank()) {
            return "Вы ничего не ввели!";
        }
        return str.trim();
    }
}
