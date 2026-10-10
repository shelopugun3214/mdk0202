package Task3;

import java.util.ArrayList;
import java.util.List;

public class ContactBook<T extends Contact> {
    private final List<T> contacts = new ArrayList<>();

    public void addContact(T contact) {
        contacts.add(contact);
    }

    public void printList() {
        for (T contact : contacts) {
            System.out.println("Имя: " + contact.getName());
            contact.print();
        }
    }

    public void congratulate(String name) {
        T contact = null;

        for (T c : contacts) {
            if (c.getName().equals(name)) {
                contact = c;
                break;
            }
        }

        if (contact == null) {
            System.out.println("Не найден контакт с указанным именем.");
            return;
        }

        System.out.println("Поздравим с Новым годом ваш контакт из записной книжки: " + name);
        contact.sendMessage();
    }
}