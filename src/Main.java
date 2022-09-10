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
            System.out.println("\n");
        }

//  ДЗ 5.2.3
        {
            int population = 12_000_000,
                    birthRate = population / 1000 * 17,
                    mortality = population / 1000 * 8,
                    year = 2022;
            while (year <= 2032) {
                System.out.printf("Год %d, численность населения составляет %d.\n",
                        year++, population);
                population += birthRate - mortality;
                birthRate = population / 1000 * 17;
                mortality = population / 1000 * 8;
            }
            System.out.println();
        }

//  ДЗ 5.2.4,5
        {
            int deposit = 15_000, cashSavings = deposit, month = 1;
            byte interestRate = 7;
            while (cashSavings <= 12_000_000) {
                cashSavings += (cashSavings / 100 * interestRate);
                if (month % 6 == 0) System.out.printf("Месяц %d-й, сумма накоплений - %d рублей.\n",
                        month, cashSavings);
                month++;
            }
            System.out.printf("Месяц %d-й, сумма накоплений - %d рублей.\n",
                    --month, cashSavings);
        }

//  ДЗ 5.2.6
        {
            int requestYear = 9;
            int deposit = 15_000, cashSavings = deposit, month;
            byte interestRate = 7;
            for (month = 1; month <= 12 * requestYear; month++) {
                cashSavings += (cashSavings / 100 * interestRate);
                if (month % 6 == 0) System.out.printf("Месяц %d, накопления: %d рублей.\n",
                        month, cashSavings);
            }
            System.out.println();
        }

//  ДЗ 5.2.7
        {
            int reportDay = 5;
            for (int i = reportDay; i <= 31; i += 7) {
                System.out.printf("Сегодня Пятница, %d-е число. Необходимо подготовить отчёт.\n",
                        reportDay);
                reportDay += 7;
            }
            System.out.println();
        }

        System.out.println();
    }
}