package debug;

import java.util.Locale;
import java.util.Scanner;

public class JavaEpam {

    public static void main(String[] args) {

        new Locale("RU_ru");
        System.out.println("Enter name and press <Enter> & number and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("hello, " + name);
        float fl = scan.nextFloat();
        System.out.println("number= " + fl);
        scan.close();
    }
}
