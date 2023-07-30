import controller.Task01;
import controller.Task02;
import controller.Task03;

public class Main {
        public static void main(String[] args)
        {
            float sample = Task01.getFloat();
            System.out.println("You've entered " + sample);
            Task02.someMethod(new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 0);
            Task02.someMethod(new double[]{1, 2, 3, 4, 5}, 1);
            Task02.someMethod(new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 1);
            Task03.task03(new int [] { 1, 2 }, 90, 3);
            Task03.task03(new int [] { 1, 2, 3 }, 90, 0);
            Task03.task03(new int [] { 1, 2, 3 }, 90, null);
    }
}