public class Main {
    public static void main(String[] args) {
        int initialAmount = 200;
        int addedAmount = 1000;
        int bonusPerHundredRubles = 1;
        int x = addedAmount / 100 * 1 + initialAmount + addedAmount;
        if (addedAmount >= 1000) {
            System.out.println(" Итоговый баланс " + x + " Количество бонусов " + addedAmount / 100 );
        } else {
            int y = initialAmount + addedAmount;
            System.out.println(" Итоговый баланс " + y + " Бонусов нет ");
        }

    }
}