import java.util.Scanner;


/**
 * kelas ini bertujuan untuk menghitung keliling persegi secara sederhana
 *
 * @author N13
 */
public class Main {
    // Ini adalah konstruktor default untuk kelas Main
    // Konstruktor ini menginisialisasi objek dengan nilai default.
    /**
     *mthod ini digunakan untuk membuat sebuah perhitungan sederhana sebuah persegi
     * @param sisi masukan sisi disini
     * @return melakukan operasi perkalian sisi dikalikan 4
     */
    public static double hitungKeliling(double sisi){
        return sisi * 4;
    }

    /**
     * tempat main berada
     * @param args ywdahsihwir
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan sisi persegi yang akan dihitung :");
        double sisi = input.nextDouble();
        System.out.println("hasil perhitungan = " +hitungKeliling(sisi));

    }
}