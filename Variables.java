public class Variables {

    public static void main(String[] args) {
        //объявление переменных
        short x;
        byte a = 1;
        int b = a + 2;
        String c = "123";
        x = 10;

        //разные типы данных
        boolean enabled = false;
        enabled = true;

        char plus = '+';
        float number = 1.3F;

        String _textText = "Vasya";

        //константы
        final byte num = 1;

        //математические операции
        ++x;
        x++;

        int res = x * num - 5 / 2 - 4;
        double res1 = x * num - 5 / 2.0 - 4;

        System.out.println("123");
        System.out.println(res);
        System.out.println(res1);

        byte y = -1 % 10;
        y = 19 % 4;

        System.out.println(y);

        double res2 = x++ * num - 5 / 2.0 - 4;
        System.out.println(res2);
        double res3 = ++x * num - 5 / 2.0 - 4;
        System.out.println(res3);

        //преобразование
        System.out.println((double) res);

        //консоль
        System.out.println("Hello world!");
        System.out.print("Hello world! \n");
        System.out.printf("Hello, %s! \n", _textText);
    }
}


