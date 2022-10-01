// Домашнее задание к уроку №5 «Циклы» (части второй)
public class Main {
    public static void main(String[] args) {
//  ДЗ 5.2.1
        {
            System.out.println();
            int salary = 29_000,
                    cashSavings = 0,
                    targetCashSavings = 2_459_000,
                    monthNumber = 1;
            while (cashSavings <= targetCashSavings) {
                cashSavings += (cashSavings / 100) + salary;
                System.out.printf("Месяц %d, сумма накоплений равна %d рублей.\n",
                        monthNumber, cashSavings);
                monthNumber++;
            }
        }

//  ДЗ 5.2.2
        {
            System.out.println();
            int i = 1;
            while (i <= 10) {
                System.out.printf("%d ", i++);
            }
            System.out.println();
            for (i = 10; i >= 1; i--) {
                System.out.printf("%d ", i);
            }
            System.out.println();
        }

//  ДЗ 5.2.3
        {
            System.out.println();
            int currentYear = 2022;
            int population = 12_000_000,
                    birthRate = population / 1000 * 17,
                    mortality = population / 1000 * 8,
                    reportPeriod = 10,
                    reportingYear = currentYear;
            while (reportingYear <= currentYear + reportPeriod) {
                System.out.printf("Год %d, численность населения составляет %d.\n",
                        reportingYear++, population);
                population += birthRate - mortality;
                birthRate = population / 1000 * 17;
                mortality = population / 1000 * 8;
            }
        }

//  ДЗ 5.2.4,5
        {
            System.out.println();
            int deposit = 15_000, cashSavings = deposit;
            byte interestRate = 7;
            int targetCashAmount = 12_000_000;
            int monthNumber = 1;
            while (cashSavings <= targetCashAmount) {
                cashSavings += (cashSavings / 100 * interestRate);
                if (monthNumber % 6 == 0) System.out.printf("Месяц %d-й, сумма накоплений - %d рублей.\n",
                        monthNumber, cashSavings);
                monthNumber++;
            }
            System.out.printf("Месяц %d-й, сумма накоплений - %d рублей.\n",
                    --monthNumber, cashSavings);
        }

//  ДЗ 5.2.6
        {
            System.out.println();
            int requestYear = 9;
            int deposit = 15_000, cashSavings = deposit, month;
            byte interestRate = 7;
            for (month = 1; month <= 12 * requestYear; month++) {
                cashSavings += (cashSavings / 100 * interestRate);
                if (month % 6 == 0) {
                    System.out.printf("Месяц %d, накопления: %d рублей.\n",
                            month, cashSavings);
                }
            }
        }

//  ДЗ 5.2.7
        {
            System.out.println();
            int reportDay = 5; // Условно принимаю, что Пятница - 5-е число месяца.
            for (int i = reportDay; i <= 31; i += 7) {
                System.out.printf("Сегодня Пятница, %d-е число. Необходимо подготовить отчёт.\n",
                        i);
            }
        }

//  ДЗ 5.2.8
        {
            System.out.println();
            byte periodOfAppearance = 79;
            int currentYear = 2022;
            int startRequestPeiod = currentYear - 200, endRequestPeriod = currentYear + 100;
            for (int i = 0; i <= endRequestPeriod; i += periodOfAppearance) {
                if (i >= startRequestPeiod) {
                    System.out.println(i);
                }
            }
        }

//  ДЗ 5.2.9
        {
            System.out.println();
            for (int i = 1; i <= 10; i++) {
                System.out.printf("2 * %d = %d\n", i, 2 * i);
            }
            System.out.println();
        }
    }
}