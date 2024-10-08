import java.util.Scanner;
public class Pemilihan2Percobaan209 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        int pilihanMenu;
        String member,pembayaran;
        double diskon = 0.0, harga = 0, totalBayar = 0, pakeQris;

        System.out.println("-------------------------");
        System.out.println("===== MENU CAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("-------------------------");
        System.out.print("Silahkan masukkan angka untuk menu yang dipilih: ");
        pilihanMenu = input09.nextInt();
        input09.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input09.nextLine();
        System.out.println("Pembayaran melalui QRIS / Tunai? ");
        pembayaran = input09.nextLine();
        System.out.println("-------------------------");


    if (member.equalsIgnoreCase("y")) { //menggunakan equalsIgnoreCase untuk membandingkan string
        diskon = 0.10;
        System.out.println("Besar diskon = 10%");
        if (pilihanMenu == 1) {
            harga = 14000;
            System.out.println("Harga Ricebowl = " + harga);

        } else if (pilihanMenu == 2) {
            harga = 3000;
            System.out.println("Harga Ice Tea = " + harga);
        
        } else if (pilihanMenu == 3) {
            harga = 15000;
            System.out.println("Harga bundling = " + harga);
        
        } else {
            System.out.println("Masukkan pilihan menu dengan benar"); 
            return; // menghentikan eksekusi lebih lanjut jika pilihan salah
        }
        totalBayar = harga - (harga * diskon);
        System.out.println("Total bayar setelah diskon = " + totalBayar);
        pakeQris = totalBayar - 1000.0;

        if (pembayaran.equalsIgnoreCase("QRIS")) {
            System.out.println("Setelah diskon QRIS = " + pakeQris);
            return;
        } 
        }    
        

        else if (member.equalsIgnoreCase("n")) { //menggunakan equalsIgnoreCase untuk membandingkan string
            if (pilihanMenu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
            
            } else if (pilihanMenu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);

            } else if (pilihanMenu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; // menghentikan eksekusi lebih lanjut jika pilihan salah
            }
            
            // menghitung total bayar
            pakeQris = harga -1000;

            if (pembayaran.equalsIgnoreCase("QRIS")) {
                System.out.println("Total Harga Bayar= " + pakeQris);
            }
        }
        else {
            System.out.println("Member tidak valid");
        }    

        
        System.out.println("--------------------------------");

    }
}

