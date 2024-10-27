public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера\n");

        byte ram = 16;
        System.out.println("Оперативная память: " + ram + " ГБ");

        short motherboardCount = 1;
        System.out.println("Материнская плата: " + motherboardCount + " шт.");

        int hardDrive = 512;
        System.out.println("Жесткий диск: " + hardDrive + " ГБ");

        long videoCard = 8;
        System.out.println("Видеокарта: " + videoCard + " ГБ");

        float cpu = 9950f;
        System.out.println("Процессор: " + cpu);

        double computerWeight = 4.5;
        System.out.println("Вес компьютера: " + computerWeight + " кг");

        boolean isComputerOn = false;
        System.out.println("Компьютер включен: " + isComputerOn + "\n");

        System.out.println("2. Расчет стоимости товара со скидкой\n");

        float penCost = 105.5f;
        float bookCost = 235.83f;

        float commonCost = penCost + bookCost;
        float discountSum = commonCost * 0.11f;
        float finalCost = commonCost - discountSum;
        System.out.println("Стоимость товаров без скидки = " + commonCost + " руб.");
        System.out.println("Сумма скидки = " + discountSum + " руб.");
        System.out.println("Сумма товаров со скидкой = " + finalCost + " руб." + "\n");

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

        System.out.println("Значения для byte");

        System.out.println("Первоначальное значение: " + maxByte);
        maxByte++;
        System.out.println("Значение после инкремента: " + maxByte);
        maxByte--;
        System.out.println("Значение после декремента: " + maxByte + "\n");

        System.out.println("Значения для short");
        System.out.println("Первоначальное значение: " + maxShort);
        maxShort++;
        System.out.println("Значение после инкремента: " + maxShort);
        maxShort--;
        System.out.println("Значение после декремента: " + maxShort + "\n");

        System.out.println("Значения для int");
        System.out.println("Первоначальное значение: " + maxInt);
        maxInt++;
        System.out.println("Значение после инкремента: " + maxInt);
        maxInt--;
        System.out.println("Значение после декремента: " + maxInt + "\n");

        System.out.println("Значения для long");
        System.out.println("Первоначальное значение: " + maxLong);
        maxLong++;
        System.out.println("Значение после инкремента: " + maxLong);
        maxLong--;
        System.out.println("Значение после декремента: " + maxLong + "\n");

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

        char dollar = '$';
        char star = '*';
        char atSign = '@';
        char pipe = '|';
        char tilda = '~';
        System.out.println("36 = " + dollar + "\n" +
                "42 = " + star + "\n" +
                "64 = " + atSign + "\n" +
                "124 = " + pipe + "\n" +
                "126 = " + tilda + "\n");

        System.out.println("7. Вывод в консоль ASCII-арт Дюка\n");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char openParen = '(';
        char closeParen = ')';
        System.out.println(" " + " " + " " + " " + " " + slash + backslash + "\n" +
                " " + " " + " " + " " + slash + " " + " " + backslash + "\n" +
                " " + " " + " " + slash + underscore + openParen + " " + closeParen + backslash + "\n" +
                " " + " " + slash + " " + " " + " " + " " + " " + " " + backslash + "\n" +
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
        int seconds = 86399;

        int hours = seconds / 3600;
        int remainingSeconds = seconds % 3600;
        int minutes = remainingSeconds / 60;
        int sec = remainingSeconds % 60;

        System.out.println(hours + ":" + minutes + ":" + sec + "\n");


    }

}