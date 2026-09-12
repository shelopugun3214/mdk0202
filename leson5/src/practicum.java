public class practicum {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();


        bankAccount.setMoneyAmount(1000);

        System.out.println("Количество денег на счету - " + bankAccount.getMoneyAmount() + " р.");


        bankAccount.withdrawAll();

        System.out.println("Количество денег на счету - " + bankAccount.getMoneyAmount() + " р.");
    }
}
