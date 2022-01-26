package Lesson3HW;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        //С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] array = {1, 1, 1, 1, 1, 0, 0, 0, 0, 0};
        printArray1("Before\t", array);
        replacement(array);
        printArray1("After\t", array);

        int[] array100 = new int[100];
        hundredthArray(array100);
        printArray1("Массив заполненный циклом значениями от 0 до 100\t", array100);

        int[] array2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        doubling(array2);
        printArray1("По заданному массиву пройтись циклом и числа меньше 6 умножить на 2\t", array2);

        int side = 5;
        int[][] array3 = new int[side][side];
        diagonalArray(array3);
        printArray2("Заполнение единицами двух диагоналей:\t", array3); // Я не могу понять, почему массив не выводится на консоль в виде матрицы;

        printArray1("Вывод массива\t", returnsimilarArray(10, 666));

        int[] array4 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 6};
        findMinimum(array4);
        findMaximum(array4);
        printArray1("Найти min и max в массиве\t", array4);
        System.out.println("Minimum: " + findMinimum(array4));
        System.out.println("Maximum: " + findMaximum(array4));

    }

    public static void replacement(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
    }
    //2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

    public static void hundredthArray(int[] array100) {
        for (int i = 0; i < array100.length; i++) {
            array100[i] = i + 1;
        }
        System.out.println();
    }

    public static void printArray1(String msg, int[] inputArray) {
        System.out.print(msg + ": ");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }
    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

    public static void doubling(int[] array2) {
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] < 6)
                array2[i] = array2[i] * 2;
        }
        System.out.println();
    }
    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    //и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
    //Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

    public static void diagonalArray(int[][] array3) {
        int a = array3.length - 1;
        for (int i = 0; i < array3.length; i++) {
            array3[i][i] = 1;
            array3[i][a - i] = 1;
        }
        System.out.println();
    }

    public static void printArray2(String msg, int[][] inputArray) {
        System.out.println(msg);
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                System.out.print(inputArray[i][j] + " ");
            }
        }
        System.out.println();
    }
    //5. Написать метод, принимающий на вход два аргумента: len и initialValue,
    // и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;

    public static int[] returnsimilarArray(int len, int initialValue) {
        int[] similar = new int[len];
        for (int i = 0; i < similar.length; i++) {
            similar[i] = initialValue;
        }
        System.out.println();
        return similar;
    }
    //6. * Задать одномерный массив и найти в нем минимальный и максимальный значения элементов;
    public static int findMinimum(int[] array4) {
        int min = array4[0];
        for (int i = 0; i < array4.length; i++) {
            if (array4[i] < min) {
                min = array4[i];
            }
        }
        return min;
    }

    public static int findMaximum(int[] array4) {
        int max = array4[0];
        for (int i = 0; i < array4.length; i++) {
            if (array4[i] > max) {
                max = array4[i];
            }
        }
        return max;
    }
}





