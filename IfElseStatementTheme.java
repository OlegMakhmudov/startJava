public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java\n");
        boolean male = false;
        if (!male) {
            System.out.println("This is male!");
        } else {
            System.out.println("This is female!");
        }
        int age = 20;
        if (age > 18) {
            System.out.println("Age more than 18");
        } else {
            System.out.println("Age less than 18");
        }
        float height = 1.8f;
        if (height < 1.8) {
            System.out.println("Height is less than 180 cm");
        } else {
            System.out.println("Height is more than 180 cm");
        }
        char firstLetterName = "Malik".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Name starts from M" + "\n");
        } else if (firstLetterName == 'I') {
            System.out.println("Name starts from I" + "\n");
        } else {
            System.out.println("Name starts from another letter" + "\n");
        }

        System.out.println("2. Поиск большего числа\n");
        int min = 10;
        int max = 10;
        if (min < max) {
            System.out.println(min + "<" + max + "\n");
        } else if (min == max) {
            System.out.println("Числа равны" + "\n");
        } else {
            System.out.println(min + ">" + max + "\n");
        }

        System.out.println("3. Проверка числа\n");
        int number = 0;

        if (number == 0) {
            System.out.println("Число равно нулю");
            return;
        }

        String positiveOrNegativeNumber;
        if (number > 0) {
            positiveOrNegativeNumber = "положительным";
        } else {
            positiveOrNegativeNumber = "отрицательным";
        }

        String evenOrOddNumber;
        if (number % 2 == 0) {
            evenOrOddNumber = "четным";
        } else {
            evenOrOddNumber = "нечетным";
        }

        System.out.printf("%d является %s и %s\n", number, positiveOrNegativeNumber, evenOrOddNumber + "\n");

        System.out.println("4. Поиск одинаковых цифр в числах\n");
        int number1 = 345;
        int number2 = 365;

        int hundreds1 = number1 / 100;
        int tens1 = (number1 / 10) % 10;
        int ones1 = number1 % 10;

        int hundreds2 = number2 / 100;
        int tens2 = (number2 / 10) % 10;
        int ones2 = number2 % 10;

        if (hundreds1 == hundreds2 && tens1 == tens2 && ones1 == ones2) {
            System.out.println("Все цифры совпадают");
        } else if (hundreds1 == hundreds2 || tens1 == tens2 || ones1 == ones2) {
            System.out.println("Есть совпадающие цифры");
            if (hundreds1 == hundreds2) {
                System.out.println("Цифра " + hundreds1 + " находится в разряде сотен\n");
            }
            if (tens1 == tens2) {
                System.out.println("Цифра " + tens1 + " находится в разряде десятков\n");
            }
            if (ones1 == ones2) {
                System.out.println("Цифра " + ones1 + " находится в разряде единиц\n");
            }
        } else {
            System.out.println("Нет совпадений\n");
        }

        System.out.println("5. Определение символа по его коду\n");
        char code = '\u0031';

        if ((code >= 'a' && code <= 'z')) {
            System.out.println("'" + code + "' - маленькая буква\n");
        } else if ((code >= 'A' && code <= 'Z')) {
            System.out.println("'" + code + "' - большая буква\n");
        } else if ((code >= '0' && code <= '9')) {
            System.out.println("'" + code + "' - цифра\n");
        } else {
            System.out.println("'" + code + "' - ни буква, ни цифра\n");
        }

        System.out.println("6. Подсчет начисленных банком %\n");
        double deposit = 321123.59;
        System.out.println("Сумма вклада: " + deposit + " руб.");

        double interestRate;

        if (deposit < 100000) {
            interestRate = 0.05;
        } else if (deposit >= 100000 && deposit <= 300000) {
            interestRate = 0.07;
        } else {
            interestRate = 0.1;
        }

        double accuredPaymentAmount = deposit * interestRate;
        double finalDeposit = deposit + accuredPaymentAmount;

        System.out.println("Сумма начисленного %: " + accuredPaymentAmount + " руб.");
        System.out.println("Итоговая сумма с %: " + finalDeposit + " руб.\n");

        System.out.println("7. Определение оценки по предметам\n");
        int historyPercent = 59;
        int programmingPercent = 92;

        double averagePercent = (historyPercent + programmingPercent) / 2.0;

        int historyGrade = (historyPercent > 91) ? 5 : (historyPercent > 73) ? 4 : (historyPercent > 60) ? 3 : 2;
        int programmingGrade = (programmingPercent > 91) ? 5 : (programmingPercent > 73) ? 4 : (programmingPercent > 60) ? 3 : 2;

        double averageGrade = (historyGrade + programmingGrade) / 2.0;

        System.out.println("Оценки по предметам: ");
        System.out.println("История: " + historyGrade);
        System.out.println("Программирование: " + programmingGrade);
        System.out.println("Средний балл: " + averageGrade);
        System.out.println("Средний %: " + averagePercent + "\n");


        System.out.println("8. Расчет годовой прибыли\n");

        double salesPerMonth = 35000.233;
        double rentPerMonth = 5123.018;
        double productionCostPerMonth = 9001.729;

        double profitPerMonth = salesPerMonth - (rentPerMonth + productionCostPerMonth);

        double annualProfit = profitPerMonth * 12;

        // Форматированный вывод результата
        String profitSign = annualProfit >= 0 ? "+" : "";
        System.out.printf("Прибыль за год: %s%.2f руб.%n", profitSign, annualProfit);
    }

}
