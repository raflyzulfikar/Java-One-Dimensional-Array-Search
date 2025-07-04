import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        int[] array = {5, 10, 15, 20, 25};

        System.out.print("Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int target = scanner.nextInt();

        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Nilai " + target + " ditemukan pada indeks: " + index);
        } else {
            System.out.println("Nilai " + target + " tidak ditemukan dalam array.");
        }

        System.out.print("Nilai dalam array yang tidak habis dibagi 0: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}