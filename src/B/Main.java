package B;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] array = new String[100];
        Pattern p07 = Pattern.compile("[A-Z]");
        Pattern p1 = Pattern.compile("[1-9]");
        Pattern p26 = Pattern.compile("[0-9]");

        String str = scan.next();
        for(int i = 0; i < str.length(); i++){
            array[i] = String.valueOf(str.charAt(i));
        }
        if(array[8] == null &&
                array[0] != null &&
                array[1] != null &&
                array[2] != null &&
                array[3] != null &&
                array[4] != null &&
                array[5] != null &&
                array[6] != null &&
                array[7] != null &&
                (p07.matcher(array[0])).matches() &&
                (p07.matcher(array[7])).matches() &&
                (p1.matcher(array[1])).matches() &&
                (p26.matcher(array[2])).matches() &&
                (p26.matcher(array[3])).matches() &&
                (p26.matcher(array[4])).matches() &&
                (p26.matcher(array[5])).matches() &&
                (p26.matcher(array[6])).matches()
        ){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
