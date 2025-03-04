public class Main {
    public static void main(String[] args) {
        int initialAmount = 200;
        int addedAmount = 1000;
        int finalBalanceAndBonus = addedAmount / 100 * 1 + initialAmount + addedAmount;
        if (addedAmount >= 1000) {
            System.out.println(" Итоговый баланс " + finalBalanceAndBonus + " Количество бонусов " + addedAmount / 100 );
        } else {
            int finalBalanceNoBonus = initialAmount + addedAmount;
            System.out.println(" Итоговый баланс " + finalBalanceNoBonus + " Бонусов нет ");
        }

    }
}