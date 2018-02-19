package HomeTasks.src.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {
        whoisbigger(input(), input());
    }
/*        // write your code here
        System.out.println("первое число = ");
        int n1 = number();
        System.out.println("что будем делать с числом? (введи математический знак) =  ");
        String symb = symb();
        System.out.println("второе число = ");
        int n2 = number();
        int res1 = res(n1, symb, n2);
        System.out.println("Результат исчеслений = " + res1);
        *//*
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Привет, какой радиус у твоего круга? Введи значение (см): ");
    String rt = reader.readLine();
        double rd = Double.parseDouble(rt);
    double c = Math.PI * 2 * rd;
                // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Длина окружности круга = " + c + " см");
*//*
    }


    public static int number() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String at = reader.readLine();
        return Integer.parseInt(at);
    }

    public static String symb() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    public static int res(int n1, String symb, int n2) throws IOException {
        int a = 0;
        switch (symb) {
            case "-":
                return n1 - n2;
            case "+":
                return n1 + n2;
            case "*":
                return n1 * n2;
            case "/":
                return n1 / n2;
        }
        return a;
    }*/

    public static String input() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter value: ");
        return reader.readLine();
    }

    public static void whoisbigger(String a, String b) {
        if ((Integer.parseInt(a) > Integer.parseInt(b))) {
            System.out.println("a > then b");
        } else {
            System.out.println("a < then b");
        }
    }
}