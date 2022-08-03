public class Main {
    public static void main(String[] args) {
        int balanceReplenishment = 100;
        int balance = 100;
        int bonus = balanceReplenishment / 100;
        int totalWithBonus = balanceReplenishment + balance + bonus;
        int totalWithoutBonus = balanceReplenishment + balance;

        if (balanceReplenishment > 1000) {
            System.out.println("Бонус равен " + bonus + " рублям, итоговая сумма на счету клиента - " + totalWithBonus + " рублей");
        } else {
            System.out.println("Бонусов нет, итоговая сумма на счету клиента - " + totalWithoutBonus + " рублей");
        }
    }
}
