
public class task5 {

    public String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public String fixText(String text) {
        if (text == null) {
            return null;
        }

        String result = text.trim();

        result = result.replace("„", "«").replace("“", "»");

        result = result.replace("цевилизаций", "цивилизаций");

        result = capitalize(result);

        return result;
    }

    public static void main(String[] args) {
        String text = "    история каждой из крупных галактических цевилизаций может быть разделена на три различные, " +
                "ярко выраженные фазы: Борьба за выживание, Любопытство и Утонченность, также именуемые фазами " +
                "„Как?“, „Зачем?“ и „Где?“. Пример: если для первой фазы характерен вопрос: „Как бы нам поесть?“," +
                " а для второй „Зачем мы едим?“, то третья отличается вопросом: „Где бы нам лучше поужинать?“.   ";

        var textFixer = new task5();
        var fixedText = textFixer.fixText(text);
        System.out.println(fixedText);
    }
}
