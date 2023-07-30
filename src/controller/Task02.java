package controller;

public class Task02 {
    public static void someMethod (double[] intArray,  int d)
    {
        try {
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e ) {
            System.out.println("Catching arithmetic exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching array index out of bounds exception: " + e);
        }
    }
}
