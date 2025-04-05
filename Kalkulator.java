import java.util.*;

/**
 * Program ini merupakan kalkulator sederhana berbasis teks yang dapat melakukan lima operasi dasar:
 * penjumlahan, pengurangan, perkalian, pembagian, dan penyederhanaan pecahan.
 * Fokus utama program ini adalah untuk menunjukkan perbedaan penggunaan method static dan non-static.
 * 
 * Alur program secara umum:
 * 1. Method utama (main) sebagai titik awal eksekusi program.
 * 2. Menampilkan tampilan pembuka.
 * 3. Meminta input dua bilangan dari user.
 * 4. Menampilkan hasil dari semua perhitungan.
 */
public class Kalkulator {

    /**
     * Method static untuk melakukan penjumlahan.
     * Karena dideklarasikan sebagai static, method ini dapat langsung dipanggil melalui nama class
     * tanpa perlu membuat objek dari class Perhitungan.
     */
    public static void penjumlahan(int a, int b) {
        int hasil = a + b; // Menghitung hasil penjumlahan
        System.out.println("Hasil penjumlahan : \n" + a + " + " + b + " = " + hasil);
    }

    /**
     * Method static untuk melakukan pengurangan.
     * Sama seperti penjumlahan, karena static maka bisa dipanggil tanpa membuat objek.
     */
    public static void pengurangan(int a, int b) {
        int hasil = a - b; // Menghitung hasil pengurangan
        System.out.println("\nHasil pengurangan : \n" + a + " - " + b + " = " + hasil);
    }

    /**
     * Method non-static untuk melakukan perkalian.
     * Karena tidak menggunakan static, method ini hanya bisa dipanggil melalui objek class.
     */
    public void perkalian(int a, int b) {
        int hasil = a * b; // Menghitung hasil perkalian
        System.out.println("\nHasil perkalian   : \n" + a + " x " + b + " = " + hasil);
    }

    /**
     * Method non-static untuk melakukan pembagian dua bilangan bulat.
     * Langkah-langkah:
     * 1. Mengecek apakah nilai pembagi (b) sama dengan nol.
     *    - Jika iya, maka ditampilkan pesan bahwa pembagian tidak dapat dilakukan, lalu keluar dari method.
     * 2. Jika pembagi valid, maka:
     *    - Hitung hasil pembagian bilangan bulat (a / b).
     *    - Hitung sisa pembagian (a % b).
     * 3. Menampilkan hasil dalam format: a / b = hasil dan sisa.
     *    Contoh: 20 / 8 = 2 sisa 4
     */
    public void pembagian(int a, int b) {
        if (b == 0) { // Mengecek apakah pembagi adalah nol
            System.out.println("\nPembagian dengan nol tidak dapat dilakukan.");
            return; // Keluar dari method jika pembagi nol
        }
        int hasil = a / b; // Melakukan pembagian bilangan bulat
        int sisa = a % b; // Sisa pembagian
        System.out.println("\nHasil pembagian   : \n" + a + " / " + b + " = " + hasil + " sisa " + sisa);
    }

    /**
     * Method untuk menyederhanakan bentuk pecahan dari dua bilangan a dan b.
     * Langkah-langkah yang dilakukan:
     * 1. Mengecek apakah penyebut (b) bukan nol, karena pembagian dengan nol tidak valid.
     * 2. Mencari nilai FPB (Faktor Persekutuan Terbesar) dari a dan b menggunakan algoritma Euclidean.
     * 3. Membagi pembilang (a) dan penyebut (b) dengan nilai FPB tersebut.
     * 4. Menampilkan hasil penyederhanaan dalam bentuk pecahan paling sederhana: a/fpb / b/fpb.
     */
    public void sederhanakan(int a, int b) {
        if (b == 0) { // Jika penyebut adalah nol
            System.out.println("Pembagian dengan nol tidak dapat dilakukan.");
            return;
        }
        int fpb = fpb(a, b); // Memanggil method untuk mencari FPB
        System.out.println("\nPenyederhanaan    : \n" + a + " / " + b + " = " + (a/fpb) + " / " + (b/fpb));
    }

    /**
     * Metode ini digunakan untuk menghitung FPB dari dua bilangan bulat menggunakan algoritma Euclidean.
     * Metode ini akan:
     * 1. Menerima dua bilangan bulat sebagai parameter (a dan b).
     * 2. Melakukan proses perulangan selama b tidak sama dengan nol:
     *    - Menghitung sisa pembagian a dengan b.
     *    - Tukar nilai a menjadi b.
     *    - Tukar nilai b menjadi sisa pembagian.
     * 3. Jika nilai b sudah nol, proses berhenti dan nilai a saat itu merupakan FPB dari dua bilangan tersebut.
     * 4. Mengembalikan nilai a sebagai hasil FPB.
     */
    public int fpb(int a, int b) {
        while (b != 0) {
            int sisa = a % b; // Menyimpan sisa pembagian
            a = b; // Tukar nilai
            b = sisa;
        }
        return a; // FPB ditemukan saat b menjadi 0
    }

     /**
     * Method utama (main) sebagai titik awal eksekusi program
     * Program akan:
     * 1. Menampilkan tampilan pembuka
     * 2. Meminta input dua bilangan dari user
     * 3. Menampilkan hasil perhitungan: penjumlahan, pengurangan, perkalian, pembagian, dan penyederhanaan
     */
    public static void main(String[] args) {
        System.out.println("---------------------------------------");
        System.out.println("        PERHITUNGAN KALKULATOR         ");
        System.out.println("---------------------------------------");
        Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk input

        // Meminta pengguna memasukkan dua bilangan
        System.out.println("Masukkan dua angka yang ingin dihitung ");
        System.out.print("Masukkan angka pertama : ");
        int angka1 = input.nextInt();
        System.out.print("Masukkan angka kedua   : ");
        int angka2 = input.nextInt();

        System.out.println("\n---------- HASIL PERHITUNGAN ----------");

        /**
         * Memanggil method static tanpa membuat objek.
         * Karena method penjumlahan dan pengurangan adalah static, maka dipanggil langsung lewat nama class.
         * Format pemanggilan: ClassName.method(parameter)
         * Contoh di sini: Perhitungan.penjumlahan(angka1, angka2)
         * Tidak perlu membuat objek Perhitungan untuk memanggil method static.
         */
        Kalkulator.penjumlahan(angka1, angka2); // Penjumlahan
        Kalkulator.pengurangan(angka1, angka2); // Pengurangan

        /**
         * Untuk method non-static, kita harus membuat objek terlebih dahulu
         * karena method-method ini tidak bisa dipanggil langsung oleh class.
         * Format pemanggilan: namaObjek.method(parameter)
         * Contoh di sini: kalkulator.perkalian(angka1, angka2)
         */
        Kalkulator perhitungan = new Kalkulator();
        perhitungan.perkalian(angka1, angka2); // Perkalian
        perhitungan.pembagian(angka1, angka2); // Pembagian
        perhitungan.sederhanakan(angka1, angka2); //Penyerdehanaan pecahan

        System.out.println("---------------------------------------");

        input.close();
        
        /*
        * - Method static dapat dipanggil langsung tanpa membuat objek dari class.
        * - Cocok digunakan untuk operasi sederhana yang tidak memerlukan data atau state dari objek.
        * - Method non-static memerlukan objek untuk dipanggil, dan digunakan jika method berpotensi bergantung pada data atau state dalam objek.
        * - Program ini menunjukkan perbedaan keduanya melalui implementasi kalkulator sederhana.
        */
    }
}
