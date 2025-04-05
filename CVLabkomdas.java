import java.util.*;

/**
 * Program CV Labkomdas
 * Fitur:
 * 1. Menjual tiga jenis jaket: A, B, dan C
 * 2. Harga tiap jaket akan berubah jika pembelian lebih dari 100 unit
 * 3. Menampilkan subtotal harga untuk tiap jenis jaket yang dibeli
 * 4. Menghitung dan menampilkan total keseluruhan belanja
 * 
 * Program ini menggunakan konstanta final untuk menetapkan harga awal jaket.
 * Konstanta final berarti nilai tersebut tidak bisa diubah setelah pertama kali dideklarasikan,
 * sehingga aman digunakan untuk nilai tetap seperti harga dasar barang.
 */
public class CVLabkomdas {
    // Harga dasar untuk masing-masing jaket (menggunakan konstanta final)
    // final = nilai tetap, tidak bisa diubah selama program berjalan
    final int hargaJaketA = 100000; // Harga awal jaket A
    final int hargaJaketB = 125000; // Harga awal jaket B
    final int hargaJaketC = 175000; // Harga awal jaket C

    // Variabel untuk menyimpan total seluruh pembelian
    int total = 0;

    /**
    * Metode untuk menghitung dan menampilkan harga pembelian jaket A.
    * Jika jumlah pembelian lebih dari 100, harga per jaket menjadi Rp 95.000.
    * Jika jumlah pembelian 100 atau kurang, harga per jaket tetap Rp 100.000.
    */    
    public void jaketA(int jumlah) {
        /**
         * Menentukan harga per jaket berdasarkan jumlah pembelian.
         * Menggunakan operator ternary untuk penentuan harga:
         * Jika jumlah > 100, maka hargaA = 95000; jika tidak, hargaA = hargaJaketA (100000).
        */
        int hargaA = (jumlah > 100) ? 95000 : hargaJaketA; // hargaJaketA tetap karena final
        int subTotal = hargaA * jumlah; // Menghitung subtotal harga untuk jumlah jaket yang dibeli.
        total += subTotal; // Menambahkan subtotal jaket ini ke total keseluruhan

        // Menampilkan detail pembelian jaket A
        System.out.println("Jumlah          : " + jumlah);
        System.out.println("Harga per jaket : Rp " + hargaA);
        System.out.println("Harga           : Rp " + subTotal);
        System.out.println("--------------------------------------------------");
    }

    /**
     * Method untuk menghitung dan menampilkan harga pembelian jaket B
     * Jika jumlah pembelian lebih dari 100, harga per jaket jadi Rp 120.000
     * Jika jumlah pembelian kurang dari 100, harga per jaket tetap Rp 125.000
     */
    public void jaketB(int jumlah) {
        /**
         * Menggunakan operator ternary untuk penentuan harga:
         * - Jika jumlah > 100, maka hargaB = 120000
         * - Jika tidak, maka hargaB = hargaJaketB (125000)
         */
        int hargaB = (jumlah > 100) ? 120000 : hargaJaketB; // hargaJaketB tetap karena final
        int subTotal = hargaB * jumlah; // Menghitung subtotal harga untuk jumlah jaket yang dibeli.
        total += subTotal; // Menambahkan subtotal jaket ini ke total keseluruhan

        // Menampilkan detail pembelian jaket B
        System.out.println("Jumlah          : " + jumlah);
        System.out.println("Harga per jaket : Rp " + hargaB);
        System.out.println("Harga           : Rp " + subTotal);
        System.out.println("--------------------------------------------------");
    }

    /**
     * Method untuk menghitung dan menampilkan harga pembelian jaket C
     * Jika jumlah pembelian lebih dari 100, harga per jaket jadi Rp 160.000
     * Jika jumlah pembelian kurang dari 100, harga per jaket tetap Rp 175.000
     */
    public void jaketC(int jumlah) {
        /**
         * Menggunakan operator ternary untuk efisiensi kondisi:
         * - Jika jumlah > 100, maka hargaC = 160000
         * - Jika tidak, maka hargaC = hargaJaketC (175000)
         */
        int hargaC = (jumlah > 100) ? 160000 : hargaJaketC; // hargaJaketC tetap karena final
        int subTotal = hargaC * jumlah; // Menghitung subtotal harga untuk jumlah jaket yang dibeli.
        total += subTotal; // Menambahkan subtotal jaket ini ke total keseluruhan

        // Menampilkan detail pembelian jaket C
        System.out.println("Jumlah          : " + jumlah);
        System.out.println("Harga per jaket : Rp " + hargaC);
        System.out.println("Harga           : Rp " + subTotal);
        System.out.println("--------------------------------------------------");
    }

    // Method untuk menampilkan total seluruh belanja
    public void getTotal() {
        System.out.println("\nTOTAL BELANJA : Rp " + total);
    }

    /**
     * Method utama program
     * 1. Membuat objek CVLabkomdas
     * 2. Meminta user memasukkan jumlah pembelian jaket A, B, dan C
     * 3. Menghitung harga masing-masing jaket dan total
     * 
     * Penjelasan pemanggilan method seperti: toko.jaketA(jumlahA);
     * - "toko" adalah nama objek dari class CVLabkomdas
     * - "jaketA" adalah method untuk menghitung harga jaket A
     * - "jumlahA" adalah jumlah jaket A yang dibeli (diinput oleh user)
     * Jadi pemanggilan itu berarti: jalankan method jaketA milik objek toko dengan argumen jumlahA
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Untuk membaca input dari pengguna
        CVLabkomdas toko = new CVLabkomdas(); // Membuat objek toko

        // Menampilkan judul dan instruksi
        System.out.println("--------------------------------------------------");
        System.out.println("         Selamat Datang di CV. Labkomdas          ");
        System.out.println("--------------------------------------------------");

        // Input dan proses pembelian jaket A
        System.out.println("\nSilahkan masukkan jumlah jaket yang ingin dibeli :");
        System.out.println("\n-------------------- JAKET A ---------------------");
        System.out.print("Masukkan jumlah jaket A : ");
        int jumlahA = input.nextInt();
        toko.jaketA(jumlahA);

        // Input dan proses pembelian jaket B
        System.out.println("\n-------------------- JAKET B ---------------------");
        System.out.print("Masukkan jumlah jaket B : ");
        int jumlahB = input.nextInt();
        toko.jaketB(jumlahB);

        // Input dan proses pembelian jaket C
        System.out.println("\n-------------------- JAKET C ---------------------");
        System.out.print("Masukkan jumlah jaket C : ");
        int jumlahC = input.nextInt();
        toko.jaketC(jumlahC);
        
        // Menampilkan total seluruh belanja
        toko.getTotal();

        System.out.println("Terima kasih telah berbelanja di CV. Labkomdas!");
    }
}
