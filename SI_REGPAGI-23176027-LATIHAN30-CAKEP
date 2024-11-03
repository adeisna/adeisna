/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan30cakep;

/**
 *
 * @author ip1pf
 * NAMA: Ade Isna Nurkharomah
 * KELAS: PBO12
 * NIM: 23176027
 * PRODI: Sistem Informasi
 * SEMESTER: 3
 * Deskripsi Program:Program ini berisi program untuk menampilkan Program Cakep
 */

import java.util.Scanner;

public class Latihan30Cakep {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static String colorText(String text, String colorCode) {
        return colorCode + text + ANSI_RESET;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print( colorText("Kamu ", ANSI_CYAN) 
                + colorText("ngerjain ", ANSI_YELLOW) + colorText("sendiri ", ANSI_PURPLE) 
                + colorText("latihan ", ANSI_CYAN) + colorText("17 ", ANSI_RED)
                + colorText("sampe ", ANSI_YELLOW) + colorText("latihan ", ANSI_CYAN) 
                + colorText("30 ", ANSI_RED) + colorText("ini? \n", ANSI_YELLOW) 
                + colorText("Jawab ", ANSI_CYAN) + colorText("(Yoi/Enggak): ", ANSI_RED) + "\033[0m");
        String jawaban = scanner.nextLine();

        if (jawaban.equalsIgnoreCase("Yoi")) {
            System.out.println("\n" + colorText("Cakep Bener. Good Job", ANSI_GREEN) + "\033[0m");
        } else if (jawaban.equalsIgnoreCase("Enggak")) {

            System.out.println("\n" + colorText("Tetep cakep sih.", ANSI_RED) + "\033[0m");
            System.out.println(colorText("Sing penting paham konsep nya yee.", ANSI_RED) + "\033[0m");
            System.out.println(colorText("Keep the code works dude", ANSI_RED) + "\033[0m");

        } else {
            System.out.println("Input tidak valid. Silahkan jawab dengan 'Yoi' atau 'Enggak'.");
        }
    }

        }
