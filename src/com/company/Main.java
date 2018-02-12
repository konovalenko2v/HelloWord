package com.company;
import jdk.nashorn.internal.runtime.regexp.joni.constants.AsmConstants;

import java.io.*;

/* public class Main {
    public static void main(String[] args) throws IOException { //на слайде 24(Ввод с клавиатуры) нужно указать, что нужно дописать "throws IOException " - иначе не взлетит...
        // write your code here


        System.out.println("Hello World");
        System.out.println("Hello World");
        String s = "dsadasda";
        System.out.println(s);

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine(); //read string
        String sAge = bufferedReader.readLine(); //read string
        int nAge = Integer.parseInt(sAge); //переобразование строку в число
    }
*/



public class Main {
    public static void main(String[] args) throws IOException {
        /* System.out.print("Hello Word!");
        System.out.println("Hello Word!");

        int n1 = 12312;
        short n0 = 11111;
        long n3 = 1111111111111111111L;
        byte b1 = -127;
        float f1 = 11.0f;
        char c1 = 'd';
        boolean bl1 = true;
        double db = 11;
        String s1 = "мама";
        String s2 = "мыла";
        String s3 = "раму";

        System.out.println("int = " + n1);
        System.out.println(n0);
        System.out.println(n3);
        System.out.println(b1);
        System.out.println(f1);
        System.out.println(c1);


        System.out.println(bl1);
        System.out.println(db);
        System.out.println(s1 + " " + s2 + " " + s3);


        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        //bufferedReader.readLine();
        System.out.print("Введтите имя: ");
        String name = bufferedReader.readLine(); //read string
        System.out.print("Введтите возраст: ");
        String sAge = bufferedReader.readLine(); //read string
        int nAge = Integer.parseInt(sAge); //переобразование строку в число


        System.out.print(name + " " + nAge );
*/



/*        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.print("введите начальное число фибаначи: ");
        String s3 = bufferedReader.readLine();

        System.out.print("введите количесто циклов: ");
        String cs = bufferedReader.readLine();

        long x3 = Integer.parseInt(s3);
        int cn = Integer.parseInt(cs);
        long x1=0;
        long x2=1;
        int n=0;
        do {
            x3 = x1+x2;
            x1 = x2;
            x2 = x3;

            System.out.println(x3 + ", ");
            n += 1;
        } while (n <cn);*/

        for (short n = 1; n<=5; n++){
            System.out.println("Hello World!");
        }


    }
}

