package C;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int cnt = 0;
        String a = scan.nextLine();
        int num = Integer.parseInt(a.substring(0, a.indexOf(" ")));
        int fin = Integer.parseInt(a.substring(a.indexOf(" ") + 1, a.length()));
        a = scan.next();
        int record[] = new int[num];
        /**/
        for(int i = 0; i < num; i++){
            record[i] = Integer.parseInt(a.substring(0, a.indexOf(" ")));
            a = a.substring(a.indexOf(" "));
        }

        int j = 0;
        do{
            if(j == record.length){
                j = 0;
                cnt++;
            }
            fin -= record[j];
            j++;
        }while (fin > 0);

        System.out.println(cnt + " " + Math.abs(fin));
    }
}
