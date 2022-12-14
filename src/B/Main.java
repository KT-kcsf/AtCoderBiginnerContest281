package B;

import java.util.Scanner;

import static java.lang.Character.isUpperCase;

public class Main {
    public static void main(String[] args) {
        String hantei = "";
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char a = str.substring(0, 1).charAt(0);
        int b = 0;
        char c = str.substring(7, 8).charAt(0);
        try {
            b = Integer.parseInt(str.substring(1, 7));
        } catch (StringIndexOutOfBoundsException exception) {
            System.out.println("No");
            System.exit(0);
        }
        if(Integer.toString(b).length() == 6){
            hantei = "Yes";
        }else{
            hantei = "No";
        }

        if(isUpperCase(a) == true && isUpperCase(c) == true){
            hantei = "Yes";
        }else{
            hantei = "No";
        }

        System.out.println(hantei);
    }
}
