/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan25ejaannama;

/**
 *
 * @author ip1pf
 * NAMA: Ade Isna Nurkharomah
 * KELAS: PBO12
 * NIM: 23176027
 * PRODI: Sistem Informasi
 * SEMESTER: 3
 * Deskripsi Program: Program ini berisi program untuk menampilkan Program ejaan nama
 */

import java.util.Scanner;

public class Latihan25Ejaannama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta pengguna memasukkan nama
        System.out.print("Masukkan nama depan anda untuk di eja: ");
        String nama = scanner.nextLine();
        
        System.out.println("Ejaan untuk \"" + nama + "\" adalah :");
        
        // Melakukan perulangan untuk setiap huruf dalam nama
        for (int i = 0; i < nama.length(); i++) {
            System.out.println("Huruf ke-" + (i + 1) + " : " + nama.charAt(i));
        }  
        // Menutup scanner
        scanner.close();
        
        System.out.println("BUILD SUCCESSFUL");
    }
}