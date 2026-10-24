
public class task2{
    private boolean isCapsLock = false;

    public void capsLock() {
        isCapsLock = !isCapsLock; // переключаем флаг на противоположное значение
    }

    public void print(String str) {
        if (isCapsLock) {
            System.out.println(str.toUpperCase());
        } else {
            System.out.println(str);
        }
    }
}