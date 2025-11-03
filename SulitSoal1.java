import java.util.Scanner;

public class SulitSoal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("    Menghitung Nilai Siswa    ");
        System.out.println("==============================");

        System.out.print("Masukkan Jumlah Siswa: ");
        int jumlahSiswa = input.nextInt();

        System.out.print("Masukkan Jumlah Mata Pelajaran: ");
        int jumlahMapel = input.nextInt();

        double[][] nilaiSiswa = new double[jumlahSiswa][jumlahMapel];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Siswa ke-" + (i + 1) + ":");
            for (int j = 0; j < jumlahMapel; j++) {
                System.out.print("Masukkan nilai mapel ke-" + (j + 1) + ": ");
                nilaiSiswa[i][j] = input.nextDouble();
            }
        }

        System.out.println("\n==============================");
        System.out.println("     Data Nilai Semua Siswa   ");
        System.out.println("==============================");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Siswa ke-" + (i + 1) + ": ");
            for (int j = 0; j < jumlahMapel; j++) {
                System.out.print(nilaiSiswa[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n==============================");
        System.out.println("     Rata-rata Nilai Siswa    ");
        System.out.println("==============================");
        for (int i = 0; i < jumlahSiswa; i++) {
            double total = 0;
            for (int j = 0; j < jumlahMapel; j++) {
                total += nilaiSiswa[i][j];
            }
            double rataRata = total / jumlahMapel;
            System.out.println("Rata-rata siswa ke-" + (i + 1) + ": " + rataRata);
        }
    }
}

