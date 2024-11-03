/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan28gantikata;

/**
 *
 * @author ip1pf
 * NAMA: Ade Isna Nurkharomah
 * KELAS: PBO12
 * NIM: 23176027
 * PRODI: Sistem Informasi
 * SEMESTER: 3
 * Deskripsi Program: Program ini berisi program untuk menampilkan Program ganti kata
 */


import java.util.Scanner;

public class Latihan28Gantikata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("====Program Mengganti Kata====");
        System.out.print("Masukkan Kalimat : ");
        String kalimat = input.nextLine();

        System.out.print("Ganti Kata : ");
        String kataGanti = input.nextLine();

        System.out.print("Menjadi Kata : ");
        String kataBaru = input.nextLine();

        // Mengganti kata yang diminta dengan kata baru
        String kalimatBaru = kalimat.replace(kataGanti, kataBaru);

        // Menampilkan hasil
        System.out.println("\n====Hasil Formatting====");
        System.out.println("Kalimat awal : " + kalimat);
        System.out.println("Kalimat baru : " + kalimatBaru);

        input.close();
    }
}
