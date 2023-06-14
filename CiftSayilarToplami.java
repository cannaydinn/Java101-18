import java.util.Scanner;

public class CiftSayilarToplami{
    public static void main(String[] args){
        int number,total=0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a number: ");
            number = sc.nextInt();

            if (number % 4 == 0){
                total += number;
            }

        } while (number % 2 == 0);
        System.out.println("Sonuc: " + total);
    }
}