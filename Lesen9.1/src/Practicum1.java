public class Practicum1 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.catchMouse();
        cat.giveVoice();

        Dog dog = new Dog();
        dog.bringStick();
        dog.play();

        Hamster hamster = new Hamster();
        hamster.hideFood();
        hamster.sleep();

        Fish fish = new Fish();
        fish.sleep();

        Spider spider = new Spider();
        System.out.println("У паука " + spider.getPawsCount() + " лапок.");
    }
}

abstract class Pet {
    private int pawsCount;

    Pet(int pawsCount) {
        this.pawsCount = pawsCount;
    }

    int getPawsCount() {
        return pawsCount;
    }

    void sleep() {
        System.out.println("Сплю");
    }

    void play() {
        System.out.println("Играю");
    }

    abstract void giveVoice();
}

class Cat extends Pet {
    Cat() {
        super(4);
    }

    @Override
    void giveVoice() {
        System.out.println("Мяу");
    }

    void catchMouse() {
        System.out.println("Поймала мышку!");
    }
}

class Dog extends Pet {
    Dog() {
        super(4);
    }

    @Override
    void giveVoice() {
        System.out.println("Гав");
    }

    void bringStick() {
        System.out.println("Принёс палочку, как хороший мальчик!");
    }
}

class Hamster extends Pet {
    Hamster() {
        super(4);
    }

    @Override
    void giveVoice() {
        System.out.println("Пи-пи");
    }

    void hideFood() {
        System.out.println("Вся еда — в щёчках!");
    }
}

class Fish extends Pet {
    Fish() {
        super(0);
    }

    @Override
    void giveVoice() {
        System.out.println("Буль-буль");
    }
}

class Spider extends Pet {
    Spider() {
        super(8);
    }

    @Override
    void giveVoice() {
        System.out.println("Шур-шур");
    }
}
