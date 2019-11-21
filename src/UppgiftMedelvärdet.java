import javax.swing.*;
import java.util.Scanner;

/*
Ett program som räknar ut medelvärdet av 10 tal som användaren matar in
skapat 2019-11-21
Av Simon Vestman
*/
public class UppgiftMedelvärdet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];

            System.out.println("vilka nummer vill du ta medelvärdet av? max 10 stycken tal");
            a[0]= sc.nextInt();
            a[1]= sc.nextInt();
            a[2]= sc.nextInt();
            a[3]= sc.nextInt();
            a[4]= sc.nextInt();
            a[5]= sc.nextInt();
            a[6]= sc.nextInt();
            a[7]= sc.nextInt();
            a[8]= sc.nextInt();
            a[9]= sc.nextInt();
                double value = (a[0]+a[1]+a[2]+a[3]+a[4]+a[5]+a[6]+a[7]+a[8]+a[9])/10;
                System.out.println("medelvärdet blev" + "\n" + value);
    }
}
