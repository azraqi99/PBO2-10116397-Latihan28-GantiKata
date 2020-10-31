/*
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Program GAnti Kata
 */
package pbo210116397latihan28gantikata;

import java.util.Scanner;

/**
 *
 * @author Zetro
 */
public class PBO210116397Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String said1;
        String said2;
        String said3;

        Scanner kata = new Scanner(System.in);

        System.out.println("===== Program Mengganti Nama =====");
        System.out.println("");
        System.out.print("Masukkan Kalimat\t : ");
        said1 = kata.nextLine();
        System.out.print("Ganti Kata\t : ");
        said2 = kata.next();
        System.out.print("Menjadi Kata\t : ");
        said3 = kata.next();

        System.out.println("");
        System.out.println("===== Hasil Formatting =====");
        System.out.println("Kalimat Awal\t : " + said1);
        String kataAkhir = said1.replace(said2, said3);
        System.out.println("Kalimat Baru\t : " + kataAkhir);
    }
    
}
