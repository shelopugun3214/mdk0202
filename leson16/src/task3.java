
public class task3 {
    int numberOfRepeats(String text, String substring) {

        if (text == null || substring == null || substring.isEmpty()) {
            return 0;
        }

        int count = 0;
        int index = 0;

        while ((index = text.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length(); // двигаемся дальше, чтобы не считать перекрывающиеся вхождения дважды
        }

        return count;
    }
}