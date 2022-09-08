// Домашнее задание к уроку №5 «Циклы» (части второй)
public class Main {
    public static void main(String[] args) {
//  ДЗ 5.2.1
        {
            int salary = 29_000, cashSavings = 0, monthNumber = 1;
            while (cashSavings <= 2_459_000) {
                cashSavings += (cashSavings / 100) + salary;
                System.out.printf("Месяц %d, сумма накоплений равна %d рублей.\n",
                        monthNumber, cashSavings);
                monthNumber++;
            }
            System.out.println();
        }

//  ДЗ 5.2.2
        {
            int i = 1;
            while (i <= 10) System.out.printf("%d ", i++);
            System.out.println();
            for (i = 10; i >= 1; i--) System.out.printf("%d ", i);
        }

        System.out.println();
    }
}