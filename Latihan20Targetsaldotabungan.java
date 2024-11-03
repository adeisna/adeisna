/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan20targetsaldotabungan;

/**
 *
 * @author ip1pf
 * NAMA: Ade Isna Nurkharomah
 * KELAS: PBO12
 * NIM: 23176027
 * PRODI: Sistem Informasi
 * SEMESTER: 3
 * Deskripsi Program: Program ini berisi program untuk menampilkan Target Saldo Tabungan
 */

 public class Latihan20Targetsaldotabungan {
    public static void main(String[] args) {
        // Inisialisasi variabel
        double saldoAwal = 3500000;
        double bungaPerBulan = 8;
        double saldoTarget = 6000000;

        // Hitung saldo tabungan setiap bulan
        double saldoSaatIni = saldoAwal;
        int bulan = 1;
        while (saldoSaatIni < saldoTarget) {
            saldoSaatIni = saldoSaatIni * (1 + bungaPerBulan / 100);
            System.out.println("Saldo di bulan ke-" + bulan + ": Rp. " + saldoSaatIni);
            bulan++;
        }

        // Output hasil
        System.out.println("Untuk mencapai saldo target Rp. 6.000.000, dibutuhkan waktu " + bulan + " bulan.");
    }
}