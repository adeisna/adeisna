/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan17programtunjangan;

/**
 *
 * @author ip1pf
 * NAMA: Ade Isna Nurkharomah
 * KELAS: PBO12
 * NIM: 23176027
 * PRODI: Sistem Informasi
 * SEMESTER: 3
 * Deskripsi Program: Program Tunjangan
 */

import java.util.Scanner;

public class Latihan17Programtunjangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Berapa gaji pokok Anda per bulan? Rp. ");
        double gajiPokok = input.nextDouble();

        System.out.print("Status Anda? (Menikah/Belum): ");
        String statusPernikahan = input.next();

        double tunjangan;
        if (statusPernikahan.equalsIgnoreCase("menikah")) {
            tunjangan = gajiPokok * 0.35;
        } else {
            tunjangan = 0;
        }

        double totalGaji = gajiPokok + tunjangan;

        System.out.println("\nHasil Perhitungan Gaji Anda");
        System.out.printf("Gaji Pokok         : Rp %.2f\n", gajiPokok);
        System.out.printf("Tunjangan        : Rp %.2f\n", tunjangan);
        System.out.printf("Total Gaji        : Rp %.2f\n", totalGaji);
        System.out.println("(Developed by Rizki Adam Kurniawan)");
        System.out.println("BUILD SUCCESSFUL (total time: 6 seconds)");
    }
}