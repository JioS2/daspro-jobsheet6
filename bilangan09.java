import java.util.Scanner;
public class bilangan09 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        int bil1 = 28, bil2 = 54, bil3 = 15;

        int terbesar = bil1;
        if (bil2 > terbesar) {
            terbesar = bil2;
        }
        if (bil3 > terbesar) {
            terbesar = bil3;
        }

        System.out.println("bilangan terbesar adalah = " + terbesar);
    }
}
