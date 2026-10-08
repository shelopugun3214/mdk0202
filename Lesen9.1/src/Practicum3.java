import java.util.Scanner;

abstract class Phone {
    private final String number;

    public Phone(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public final void makeCall(String targetNumber) {
        System.out.println("Звоним с номера " + number);
        System.out.println("Набираем номер " + targetNumber + " и звоним по сотовой связи");
        System.out.println("Привет!");
    }
}

class LandlinePhone extends Phone {

    public LandlinePhone(String number) {
        super(number);
    }
}

class MobilePhone extends Phone {

    public MobilePhone(String number) {
        super(number);
    }

    public void sendSms(String targetNumber, String messageText) {
        System.out.println("Отправляем сообщение " + messageText + " по номеру " + targetNumber);
    }
}

class Smartphone extends MobilePhone {

    public Smartphone(String number) {
        super(number);
    }

    public void makeCall(String targetNumber, String appName) {
        System.out.println("Звоним с номера " + getNumber());
        System.out.println("Позвоним через приложение " + appName + " по номеру " + targetNumber);
        System.out.println("Привет!");
    }

    public void sendEmail(String email, String messageText) {
        System.out.println("Напишем другу сообщение " + messageText + " по email " + email);
    }
}

public class Practicum3 {

    public static void main(String[] args) {
        System.out.println("Вас приветствует виртуальная АТС!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш номер телефона:");
        String number = scanner.next();
        System.out.println("Введите номер пользователя, которому хотите позвонить:");
        String friendNumber = scanner.next();
        System.out.println("Выберите модель телефона собеседника, 1 - стационарный телефон, 2 - мобильный телефон, 3 - смартфон:");
        int type = scanner.nextInt();

        if (type < 1 || type > 3) {
            System.out.println("Введена неверная модель телефона");
            return;
        }

        Phone phone = getPhone(type, number);

        if (phone instanceof Smartphone) {

            Smartphone smartphone = (Smartphone) phone;
            System.out.println("Выберите способ связи, 1 - сотовая связь, 2 - через приложение:");
            int way = scanner.nextInt();
            if (way == 2) {
                System.out.println("Введите название приложения:");
                String appName = scanner.next();
                smartphone.makeCall(friendNumber, appName);
            } else {
                phone.makeCall(friendNumber);
            }

            System.out.println("Что отправить собеседнику? 1 - SMS, 2 - email, 0 - ничего:");
            int action = scanner.nextInt();
            if (action == 1) {
                System.out.println("Введите текст сообщения:");
                String messageText = scanner.next();
                smartphone.sendSms(friendNumber, messageText);
            } else if (action == 2) {
                System.out.println("Введите email собеседника:");
                String email = scanner.next();
                System.out.println("Введите текст сообщения:");
                String messageText = scanner.next();
                smartphone.sendEmail(email, messageText);
            }
        } else if (phone instanceof MobilePhone) {
            phone.makeCall(friendNumber);

            // Мобильный телефон может отправить SMS
            System.out.println("Отправить SMS? 1 - да, 0 - нет:");
            int action = scanner.nextInt();
            if (action == 1) {
                System.out.println("Введите текст сообщения:");
                String messageText = scanner.next();
                ((MobilePhone) phone).sendSms(friendNumber, messageText);
            }
        } else {

            phone.makeCall(friendNumber);
        }
    }


    public static Phone getPhone(int type, String number) {
        if (type == 1) {

            return new LandlinePhone(number);
        } else if (type == 2) {

            return new MobilePhone(number);
        } else {

            return new Smartphone(number);
        }
    }
}
