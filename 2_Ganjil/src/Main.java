import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan jumlah uang yang anda miliki:");
        int uang = scanner.nextInt();

        System.out.println("Apakah hari ini hujan? (true/false)");
        boolean hujan = scanner.nextBoolean();

        if ( (uang>5000) && (!hujan) ) {
            System.out.println("Anda dapat membeli gorengan.");
        } else {
            System.out.println("Anda tidak dapat membeli gorengan.");
        }
    }
}
