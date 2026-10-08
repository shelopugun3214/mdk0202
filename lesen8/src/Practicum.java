import java.util.ArrayList;
public class Practicum {
    public static void main(String[] args) {
        ArrayList<MountainHare> hares = new ArrayList<>();
        hares.add(new MountainHare(4, 4.4, 120));
        hares.add(new MountainHare(7, 3.6, 150));
        hares.add(new MountainHare(1, 2.3, 100));

        System.out.println("В лесу лето!");
        Forest summerForest = new Forest(hares);
        Forest.setSeason("лето");
        System.out.println("Список зайцев:");
        summerForest.printHares();
        System.out.println("В лесу зима!");
        Forest.setSeason("зима");
        System.out.println("Список зайцев:");
        summerForest.printHares();
    }
}
class MountainHare {
    int age;
    double weight;
    int jumpLength;
    private static String color = "серо-рыжий";

    public MountainHare(int age, double weight, int jumpLength) {
        this.age = age;
        this.weight = weight;
        this.jumpLength = jumpLength;
    }
    public static void setStaticColor(String newColor) {
        color = newColor;
    }
    @Override
    public String toString() {
        return "Заяц: " +
                "возраст =" + age +
                ", вес =" + weight +
                ", растояние прыжка =" + jumpLength +
                ", цвет =" + color +
                '.';
    }
}
class Forest {
    private ArrayList<MountainHare> hares;
    private static String season = "лето";
    public Forest(ArrayList<MountainHare> hares) {
        this.hares = hares;
    }
    public static void setSeason(String newSeason) {
        season = newSeason;

        String newColor;
        if ("зима".equalsIgnoreCase(newSeason)) {
            newColor = "белый";
        } else {
            newColor = "серо-рыжий";
        }

        MountainHare.setStaticColor(newColor);
    }
    public void printHares() {
        for (MountainHare hare : hares) {
            System.out.println(hare);
        }
    }
}
