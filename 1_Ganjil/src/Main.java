import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan tiga bilangan bulat:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        System.out.println("Hasil Penjumlahan(+): " + (num1 + num2 + num3));
        System.out.println("Hasil Pengurangan(-): " + (num1 - num2 - num3));
        System.out.println("Hasil Perkalian(x) : " + (num1 * num2 * num3));
        System.out.println("Hasil Pembagian(/) : " + ((double) num1 / num2 / num3));
    }
}
