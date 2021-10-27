# MODUL 3 : PENGENALAN PEMROGRAMAN BERIORIENTASI OBJEK

## Dasar Teori 

* Keyword dalam Java
Merupakan identifier yang telah di tetapkan/didefinisikan sebelumnya oleh Java dalam penggunaanya, keyword yang telah didefinisikan ini tidak dapat digunakan sebagai nama variabel, class, dan method.
Ada juga 3 kata literal yaitu true, false, dan true yang juga tidak bisa dipakai untuk penamaan identifier.

* Tipe Dasar
Merupakan tipe yang digunakan untuk membedakan data pada java. Pada java terdapat 8 tipe dasar, yaitu boolean, char, byte, short, int, long, float, dan double.

* Variabel
Merupakan data yang dimasukan kedalam suatu wadah (memiliki tipe data dan nama) yang nantinya dapat digunakan secara berulang ulang.
Dalam penamaan variabel memiliki 4 aturan, yaitu:
1. Diawali dengan : Huruf/abjad atau karakter mata uang atau underscore(_)
2. Terdiri dari huruf/abjad, angka dan underscore
3. Tidak boleh mengandung karakter khusus atau spasi
4. Tidak boleh diawali dengan angka

* Casting dan Promotion
Casting diperlukan untuk mengkonversi dari suatu tipe ke tipe
data yang lebih kecil panjang bitnya. Sedangkan promotion terjadi pada
saat mengkonversi dari suatu tipe data ke tipe data yang lebih panjang
bitnya.


<hr>

## LATIHAN
1. Menganalisa batasan maksimum dari suatu tipe
```java
public class BigInteger {
    public static void main(String args[]) {
        long p=2147483648;
    }
}
```

Jawab:
Program tersebut terjadi error karena pada java, walaupun memiliki tipe data long variabel tersebut tetap didefinisikan dengan int karena jika ingin menggunakan long, kita harus menambahkan huruf L setelah data pada variabel tersebut.

2. Anak Ayam
```java
package modul2.pelatihan;

public class Ayam {
    public static void main(String args[]) {
        int ayam = 10;
        while (ayam >= 1) {
            System.out.println("Anak ayam turun " + ayam);
            ayam--;
            if (ayam >= 1) {
                System.out.println("Mati 1 tinggal " + ayam);
            }
        }
        System.out.println("Mati 1 tinggal Induknya");
    }
};
```

Hasil running:
![Hasil Running](https://i.ibb.co/fDFPy83/image-2021-10-27-215715.png)

3. A+B+C
```java
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
```

Hasil running: 
![Hasil Running](https://i.ibb.co/SsKZ98Z/image-2021-10-27-215920.png)
