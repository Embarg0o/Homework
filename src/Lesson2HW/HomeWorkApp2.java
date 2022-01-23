package Lesson2HW;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        if(checksum(15,35)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        meaning(-20);

        if(checkNumber(5)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        line("Привет, мир", 5);

        if(leap(2420)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
    //1. Написать метод, принимающий на вход два целых числа и проверяющий,
    //что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
    //в противном случае – false.
    public static boolean checksum(int valueA, int valueB) {
       return valueA + valueB >= 10 && valueA + valueB <= 20;
    }
    //2. Написать метод, которому в качестве параметра передается целое число,
    //метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    //Замечание: ноль считаем положительным числом.
    public static void meaning(int a) {
        if (a < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }
    //3. Написать метод, которому в качестве параметра передается целое число.
    //Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean checkNumber(int b){
        return b < 0;
    }
    //4. Написать метод, которому в качестве аргументов передается строка и число,
    //метод должен отпечатать в консоль указанную строку, указанное количество раз;
    public static void line(String run, int a){
        for (int i = 1; i <= a; i++) {
            System.out.println("[" + i + "]" + " " + run);
        }

    }
    //5.* Написать метод, который определяет, является ли год високосным,
    //и возвращает boolean (високосный - true, не високосный - false).
    //Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static boolean leap(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
        }

}
