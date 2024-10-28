public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера\n");

        byte ramMemory = 16;
        System.out.println("Объем оперативной памяти: " + ramMemory + " ГБ");

        short motherboardCount = 1;
        System.out.println("Материнская плата: " + motherboardCount + " шт.");

        int hardDriveMemory = 512;
        System.out.println("Объем жесткого диска: " + hardDriveMemory + " ГБ");

        long videoCardMemory = 8;
        System.out.println("Объем видеокарты: " + videoCardMemory + " ГБ");

        float cpu = 9950f;
        System.out.println("Вид процессора: " + cpu);

        double computerWeight = 4.5;
        System.out.println("Вес компьютера: " + computerWeight + " кг");

        boolean isComputerOn = false;
        System.out.println("Компьютер включен: " + isComputerOn);

        char energyClass = 'A';
        System.out.println("Энергетический класс компьютера: " + energyClass + "\n");


        System.out.println("2. Расчет стоимости товара со скидкой\n");

        float penCost = 105.5f;
        float bookCost = 235.83f;

        float baseCost = penCost + bookCost;
        float discountSum = baseCost * 0.11f;
        float discountCost = baseCost - discountSum;
        System.out.println("Стоимость товаров без скидки = " + baseCost + " руб.");
        System.out.println("Сумма скидки = " + discountSum + " руб.");
        System.out.println("Сумма товаров со скидкой = " + discountCost + " руб." + "\n");

        System.out.println("3. Вывод слова JAVA\n");

        System.out.println("    J    a  v     v  a\n" +
                "    J   a a  v   v  a a\n" +
                " J  J  aaaaa  V V  aaaaa\n" +
                "  JJ  a     a  V  a     a\n");

        System.out.println("4. Вывод min и max значений целых числовых типов\n");

        byte maxByte = 127;
        short maxShort = 32767;
        int maxInt = 2147483647;
        long maxLong = 9223372036854775807L;
        char maxChar = 255;

        System.out.println("Значения для byte:");
        System.out.println("Первоначальное значение: " + maxByte);
        System.out.println("Значение после инкремента: " + ++maxByte);
        System.out.println("Значение после декремента: " + --maxByte + "\n");

        System.out.println("Значения для short:");
        System.out.println("Первоначальное значение: " + maxShort);
        System.out.println("Значение после инкремента: " + ++maxShort);
        System.out.println("Значение после декремента: " + --maxShort + "\n");

        System.out.println("Значения для int:");
        System.out.println("Первоначальное значение: " + maxInt);
        System.out.println("Значение после инкремента: " + ++maxInt);
        System.out.println("Значение после декремента: " + --maxInt + "\n");

        System.out.println("Значения для long:");
        System.out.println("Первоначальное значение: " + maxLong);
        System.out.println("Значение после инкремента: " + ++maxLong);
        System.out.println("Значение после декремента: " + --maxLong + "\n");

        System.out.println("Значения для char:");
        System.out.println("Первоначальное значение: " + maxChar);
        System.out.println("Значение после инкремента: " + ++maxChar);
        System.out.println("Значение после декремента: " + --maxChar + "\n");

        System.out.println("5. Перестановка значений переменных\n");

        int a = 2;
        int b = 5;

        // С помощью третьей переменной
        System.out.println("С помощью третьей переменной");
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Новые значения: a = " + a + ", b = " + b + "\n");

        // С помощью арифметических операций
        System.out.println("С помощью арифметических операций");
        a += b;
        b = a - b;
        a -= b;
        System.out.println("Новые значения: a = " + a + ", b = " + b + "\n");

        // С помощью побитовой операции ^
        System.out.println("С помощью побитовой операции ^");
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("Новые значения: a = " + a + ", b = " + b + "\n");

        System.out.println("6. Вывод символов и их кодов\n");

        char dollar = 36;
        char star = 42;
        char atSign = 64;
        char pipe = 124;
        char tilda = 126;
        System.out.println("36 = " + dollar + "\n" +
                "42 = " + star + "\n" +
                "64 = " + atSign + "\n" +
                "124 = " + pipe + "\n" +
                "126 = " + tilda + "\n");

        System.out.println("7. Вывод в консоль ASCII-арт Дюка\n");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char openBracket = '(';
        char closeBracket = ')';
        System.out.println("     " + slash + backslash + "\n" +
                "    " + slash + "  " + backslash + "\n" +
                "   " + slash + underscore + openBracket + " " + closeBracket + backslash + "\n" +
                "  " + slash + "      " + backslash + "\n" +
                " " + slash + underscore + underscore + underscore + underscore + slash + backslash + underscore + underscore + backslash + "\n"
        );

        System.out.println("8. Манипуляции с сотнями, десятками и единицами числа\n");
        int number = 123;

        int hundreds = number / 100;
        int remaining = number % 100;
        int tens = remaining / 10;
        int ones = remaining % 10;

        int sum = hundreds + tens + ones;
        int multiplication = hundreds * tens * ones;
        System.out.println("Число " + number + " " + "содержит: " + "\n" +
                "сотен - " + hundreds + "\n" +
                "десятков - " + tens + "\n" +
                "единиц - " + ones + "\n" +
                "Сумма разрядов = " + sum + "\n" +
                "Произведение разрядов = " + multiplication + "\n");

        System.out.println("9. Перевод секунд в часы, минуты и секунды\n");
        int ssTotal = 86399;

        int hh = ssTotal / 3600;
        int remainingSeconds = ssTotal % 3600;
        int mm = remainingSeconds / 60;
        int ss = remainingSeconds % 60;

        System.out.println(hh + ":" + mm + ":" + ss + "\n");
    }

}