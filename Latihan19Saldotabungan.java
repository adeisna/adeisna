/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan19saldotabungan;

/**
 *
 * @author ip1pf
 * NAMA: Ade Isna Nurkharomah
 * KELAS: PBO12
 * NIM: 23176027
 * PRODI: Sistem Informasi
 * SEMESTER: 3
 * Deskripsi Program:Program ini berisi program untuk menampilkan Saldo Tabungan
 */ 

import java.util.Scanner;

public class Latihan19Saldotabungan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan saldo awal: Rp ");
        double saldoAwal = input.nextDouble();

        System.out.print("Masukkan bunga per bulan (%): ");
        double bungaPerBulan = input.nextDouble();

        System.out.print("Masukkan lama menabung (bulan): ");
        int lamaBulan = input.nextInt();

        // Validasi input
        if (saldoAwal <= 0 || bungaPerBulan <= 0 || lamaBulan <= 0) {
            System.out.println("Nilai saldo awal, bunga, dan lama menabung harus positif.");
            return;
        }

        // Hitung saldo akhir menggunakan bunga majemuk dan Math.pow()
        double saldoAkhir = saldoAwal * Math.pow(1 + bungaPerBulan/100, lamaBulan);

        // Format output dengan koma pemisah ribuan
        System.out.printf("Saldo Akhir setelah %d bulan: Rp %,2f%n", lamaBulan, saldoAkhir);
    }
}