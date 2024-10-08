import java.util.Scanner;
 public class Tokobuku09 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        int jumlah;
        String jenisBuku;
        double discount = 0;

        System.out.print("Masukkan jenis buku: ");
        jenisBuku = input09.nextLine();

        System.out.print("Masukkan jumlah buku: ");
        jumlah = input09.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus") && jumlah > 2) {
            discount = 0.12;
        } else if (jenisBuku.equalsIgnoreCase("kamus") && (jumlah <= 2)) {
                    discount = 0.10;
                } else if (jenisBuku.equalsIgnoreCase("novel") && jumlah > 3) {
                    discount = 0.09;
                } else if (jenisBuku.equalsIgnoreCase("novel") && (jumlah <= 3)) {
                    discount = 0.08;
                } else if ((!jenisBuku.equalsIgnoreCase("kamus") && !jenisBuku.equalsIgnoreCase("novel")) && jumlah > 3) {
                    discount = 0.05;
                }
            
                System.out.println("Total diskon: " + (discount * 100) + "%");
            

        }
    }
    
