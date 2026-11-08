import java.util.Scanner;

public class Tugas125 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int totalAngka = 0;
        int i = 0;
        int j = 0;

        System.out.print("Masukkan nilai n = ");
        n = sc.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
                totalAngka++;
            }
            System.out.println();
        }

        System.out.println("Total angka tercetak: " + totalAngka);
        sc.close();
    }
}
