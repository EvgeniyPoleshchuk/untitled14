import java.util.Scanner;

public class Main extends Method {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int earnings = 0;
        int spendings = 0;
        while (true) {
            System.out.println("1.Добавить новый доход");
            System.out.println("2.Добавить новый расход");
            System.out.println("3.Выбрать систему налогооблажения");
            String input = sc.nextLine();
            if ("end".equals(input)) {
                break;
            }

            int option = Integer.parseInt(input);
            switch (option) {
                case 1:
                    System.out.println("Введите сумму дохода :");
                    String moneyStr = sc.nextLine();
                    int money = Integer.parseInt(moneyStr);
                    earnings += money;
                    break;
                case 2:
                    System.out.println("Введите сумму расходов :");
                    String moneyExpenses = sc.nextLine();
                    int expenses = Integer.parseInt(moneyExpenses);
                    spendings += expenses;
                    break;
                case 3:
                    if (tax(earnings) < taxEarningMinusSpendings(earnings, spendings)) {
                        System.out.println("Мы советуем вам УСН доходы");
                        System.out.println("Ваш налог составит: " + tax(earnings) + " рублей");
                        System.out.println("Налог на другой системе: " + taxEarningMinusSpendings(earnings, spendings));
                        System.out.println("Экономия: " + (taxEarningMinusSpendings(earnings, spendings) - tax(earnings)));

                    } else {
                        System.out.println("Мы советуем вам УСН доходы минус расходы");
                        System.out.println("Ваш налог составит: " + taxEarningMinusSpendings(earnings, spendings) + " рублей");
                        System.out.println("Налог на другой системе: " + tax(earnings));
                        System.out.println("Экономия: " + (tax(earnings) - taxEarningMinusSpendings(earnings, spendings)));

                    }
                    break;

                default:
                    System.out.println("Такой операции нет");
            }
        }
    }



}




