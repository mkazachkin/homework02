package controller;

public class Task03 {
    public static void task03 (int [] abc, Integer aI, Integer bI) {
        try {
            int a = aI;
            int b = bI;
            System.out.println(a / b);
            printSum(a, b);
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (ArithmeticException ex) {
            System.out.println("Не могу выполнить арифметическую операцию!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
