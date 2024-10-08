import java.util.Scanner;
public class Tokosepatu09 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        String merk, kategori;
        int ukuran = 0;
        double harga = 0;

        System.out.println("------------------WELCOME IN SHOES SHOP------------------");
        System.out.println("Merk sepatu apa yang anda inginkan? = ");
        merk = input09.nextLine();
        System.out.println("Kategori sepatu apa yang anda inginkan? = ");
        kategori = input09.nextLine();
        System.out.println("Pilih ukuran / size anda");
        ukuran = input09.nextInt();

        if (merk.equalsIgnoreCase("converse")) {
            if (kategori.equalsIgnoreCase("slip on")) {
                if (ukuran == 36 ) 
                    harga = 800000;
                if (ukuran == 37)
                    harga = 800000;
                if (ukuran == 38)
                    harga = 800000;
                if (ukuran == 39)
                    harga = 800000;
                if (ukuran == 40)
                    harga = 800000;
                return;

            } else if (kategori.equalsIgnoreCase("high top")) {
                if (ukuran == 40) 
                    harga = 1200000;
                if (ukuran == 41) 
                    harga = 1200000;
                if (ukuran == 42) 
                    harga = 1200000;
                if (ukuran == 43) 
                    harga = 1200000;
                if (ukuran == 44) 
                    harga = 1200000;
                return;
            } else {
                System.out.println("Input Tidak Valid");
            }

        } if (merk.equalsIgnoreCase("Skecher")) {
            if (kategori.equalsIgnoreCase("woman")) {
                if (ukuran == 36)
                    harga = 1000000;
                if (ukuran == 37)
                    harga = 1000000;
                if (ukuran == 38)
                    harga = 1000000;
                if (ukuran == 39)
                    harga = 1000000;
                if (ukuran == 40)
                    harga = 1000000;
                if (ukuran == 41)
                    harga = 1000000;
                return;

            } else if (kategori.equalsIgnoreCase("man")) {
                if (ukuran == 41)
                    harga = 1800000;
                if (ukuran == 42)
                    harga = 1800000;
                if (ukuran == 43)
                    harga = 1800000;
                if (ukuran == 44)
                    harga = 1800000;
                return;

            } else {
                System.out.println("Input Tidak Valid");
            }

        } if (merk.equalsIgnoreCase("nike")) {
            if (kategori.equalsIgnoreCase("kids")) {
                if (ukuran == 36)
                    harga = 750000;
                if (ukuran == 37)
                    harga = 750000;
                if (ukuran == 38)
                    harga = 750000;
                if (ukuran == 39)
                    harga = 750000;
                if (ukuran == 40)
                    harga = 750000;
                return;

            } else if (kategori.equalsIgnoreCase("adult")) {
                if (ukuran == 40)
                    harga = 1500000;
                if (ukuran == 41)
                    harga = 1500000;
                if (ukuran == 42)
                    harga = 1500000;
                if (ukuran == 43)
                    harga = 1500000;
                if (ukuran == 44)
                    harga = 1500000;
                return;
            } else {
                System.out.println("Input Tidak Valid");
            }
        }else {
            System.out.println("Input Tidak Valid");
        }
        
        System.out.println("Sepatu merk " + merk + " kategori " + kategori + " size " + ukuran);
        System.out.println("total harga yang harus dibayar = " + harga);

        System.out.println("------------------THANK YOU GUYS------------------");
    }
}
