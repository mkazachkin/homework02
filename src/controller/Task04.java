package controller;

import java.util.Scanner;

public class Task04 {
    public class EmptyStringException extends Exception {
        public EmptyStringException () { super(); }
        public EmptyStringException(String message) { super(message); }
        public EmptyStringException(String message, Throwable cause) { super(message, cause); }
        public EmptyStringException(Throwable cause) { super(cause); }
    }
    public String getString(String message) throws EmptyStringException {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        String result = sc.nextLine();
        if (result.trim().length() == 0) {
            throw (new EmptyStringException());
        }
        return result;
    }
}
