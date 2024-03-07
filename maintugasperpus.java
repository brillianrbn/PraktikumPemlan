package tugasPemlanPraktikum;

import java.util.Scanner;

public class maintugasperpus {
    public static void main(String[] args) {
        tugasperpus perpus = new tugasperpus();
        Scanner scn = new Scanner(System.in);

        System.out.println("****************PERPUSTAKAAN****************");
            System.out.println("SELAMAT DATANG DI PERPUSTAKAAN");
            System.out.println("============================================\n");
            System.out.println("Daftar kategori buku di perpustakaan ini :\n");
            System.out.println("1. Teknologi");
            System.out.println("2. Filsafat");
            System.out.println("3. Sejarah");
            System.out.println("4. Agama");
            System.out.println("5. Psikologi");
            System.out.println("6. Politik");
            System.out.println("7. Fiksi\n");
            System.out.println("8. Keluar\n");
            System.out.print("Silahkan masukkan kode kategori buku yang ingin Anda cari : ");

            int kode = scn.nextInt();
            String informasiBuku = perpus.getInformasiBuku(kode);
            System.out.println(informasiBuku);

        scn.close(); 
    }
}
