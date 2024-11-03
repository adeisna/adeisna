/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan21programrataratanilai;

/**
 *
 * @author ip1pf
 * NAMA: Ade Isna Nurkharomah
 * KELAS: PBO12
 * NIM: 23176027
 * PRODI: Sistem Informasi
 * SEMESTER: 3
 * Deskripsi Program: Program ini berisi program untuk menampilkan Program rata-rata nilai
 */
import java.util.Scanner;

public class Latihan21Programrataratanilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Banyaknya Mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();

        if (jumlahMahasiswa <= 0) {
            System.out.println("Jumlah mahasiswa harus lebih dari 0.");
            return;
        }

        int[] nilaiMahasiswa = new int[jumlahMahasiswa];
        int totalNilai = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + (i + 1) + ": ");
            while (!input.hasNextInt()) {
                System.out.print("Input harus berupa angka. Masukkan lagi: ");
                input.next();
            }
            int nilai = input.nextInt();
            if (nilai < 0) {
                System.out.println("Nilai tidak boleh negatif. Masukkan lagi: ");
                i--; // Ulangi input untuk mahasiswa yang sama
                continue;
            }
            nilaiMahasiswa[i] = nilai;
            totalNilai += nilai;
        }

        double rataRata = (double) totalNilai / jumlahMahasiswa;

        System.out.println("\nMaka, Rata-rata Nilainya adalah " + rataRata);
        System.out.println("Developed by : Rizki Adam Kurniawan");

        input.close();
    }
}