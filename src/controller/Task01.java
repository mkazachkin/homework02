package controller;

public class Task01 {
    public static float getFloat() {
        Task04 input = new Task04();
        while (true) {
            try {
                String str = input.getString("Enter number: ").replace(",", ".");
                return (Float.parseFloat(str));
            } catch (Task04.EmptyStringException e) {
                System.out.println("Empty strings are not allowed.");
            } catch (Exception e){
                System.out.println("Something is wrong. Can't parse number to float. Repeat input, please.");
            }
        }
    }
}