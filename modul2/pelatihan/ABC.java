package modul2.pelatihan;

import java.util.Scanner;

public class ABC {
    public static void main(String args[]) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukan jumlah testcase: ");
        int tc = masukan.nextInt();

        for (int i = 0; i < tc; i++) {
            System.out.print("Masukan nilai A" + (i + 1) + ": ");
            int temp_a = masukan.nextInt();
            System.out.print("Masukan nilai B" + (i + 1) + ": ");
            int temp_b = masukan.nextInt();
            System.out.print("Masukan nilai C" + (i + 1) + ": ");
            int temp_c = masukan.nextInt();
            int a[] = new int[tc];
            int b[] = new int[tc];
            int c[] = new int[tc];

            a[i] = temp_a;
            b[i] = temp_b;
            c[i] = temp_c;
            int d = a[i] + b[i] - c[i];
            System.out.println(d);
        }
    }
}
