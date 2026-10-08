enum Continent {
    ASIA,
    AFRICA,
    NORTH_AMERICA,
    SOUTH_AMERICA,
    ANTARCTICA,
    EUROPE,
    AUSTRALIA
}

class PopulationInformer {

    public static String getPopulationPercent(Continent continent) {
        String result;

        switch (continent) {
            case ASIA:
                result = "59.5%";
                break;
            case AFRICA:
                result = "16.9%";
                break;
            case NORTH_AMERICA:
                result = "7.7%";
                break;
            case SOUTH_AMERICA:
                result = "5.6%";
                break;
            case ANTARCTICA:
                result = "<0.1%";
                break;
            case EUROPE:
                result = "9.7%";
                break;
            case AUSTRALIA:
                result = "0.5%";
                break;
            default:
                result = "Такого материка не существует.";
                break;
        }

        return result;
    }
}

public class Practicum4 {
    public static void main(String[] args) {
        PopulationInformer populationInformer = new PopulationInformer();
        System.out.println(populationInformer.getPopulationPercent(Continent.ASIA));
        System.out.println(populationInformer.getPopulationPercent(Continent.AFRICA));
        System.out.println(populationInformer.getPopulationPercent(Continent.NORTH_AMERICA));
        System.out.println(populationInformer.getPopulationPercent(Continent.SOUTH_AMERICA));
        System.out.println(populationInformer.getPopulationPercent(Continent.ANTARCTICA));
        System.out.println(populationInformer.getPopulationPercent(Continent.AUSTRALIA));
    }
}
