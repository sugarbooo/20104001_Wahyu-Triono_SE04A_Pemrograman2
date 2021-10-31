# MODUL IV - DASAR PEMROGRAMAN BERORIENTASI OBJEK
## Dasar Teori

**Information Hiding** merupakan cara dalam pemrograman java dalam menyembunyikan atribut dan metode suatu objek dari objek lainnya. Informasi dari suatu class disembunyikan agar metode lainnya tidak dapat mengakses. Dalam pemrograman OOP cara ini dinamakan **Encapsulation (Enkapsulasi)**. Caranya adalah sebagai berikut:
```java
private int nilai;
```
**Encapsulation (Enkapsulasi)** mempunyai dua hal yang mendasar, yaitu:
1.  Information hiding
2.  Menyediakan suatu perantara (method) dalam mengakses data tersebut.

Contoh:
```java
public class Siswa {
    private int nilai;
    public void setnilai(int n){
        nilai = n;
    }
}
```
**Constructor** merupakan suatu metode yang pertama kali akan dijalankan dalam objek ketika program berjalan. Beberapa karakteristik yang dimiliki oleh constructor adalah:
1.  Metode dalam constuctor harus memiliki nama yang sama dengan classnya.
2.  Tidak mengembalikan suatu nilai (return).
3.  Satu class dalam constructor memiliki lebih dari satu constructor (Overloading constructor).
4.  Dapat ditambahkan access modifier public, private, protected maupun default.
5.  Bisa dipanggil oleh constructor lain dalam satu class yang sama.


```java
Class Nama_kelas{
    Nama_kelas() //merupakan constructor
    {
        //isi constructor
    }
    //isi class
}
```
Contoh:
```java
public class Siswa{
    private int nilai;
    private String nama;
    public Siswa(int n, String m){
        nilai = n;
        nama = m;
    }
}
```

**Overloading Constructor** merupakan class yang mempunyai lebih dari 1 constructor dengan syarat daftar parameternya tidak boleh ada yang sama. 
Contoh:
```java
public class Siswa{
    private int nilai;
    public Siswa(){
        nilai = 0;
    }
    public Siswa(int n){
        nilai = n;
    }
}
```
Construcor tidak dapat dipanggil secara langsung, namun harus dipanggil dengan operator new dalam pembentukan class.
<hr>
# Praktikum
Soal:
Analisislah dan tentukan konsep apa saja yang digunakan (dalam modul tersebut) serta mengapa hasil akhirnya seperti itu!

jawab:
Pada modul tersebut, menurut saya konsep OOP yang digunakan adalah konsep Encapsulation. Karena encapsulation itu sendiri ada suatu konsep dimana pada saat membuat variabel atau lainnya, kita melakukan pembungkusan agar tidak dapat diakses secara sembarangan atau juga penyembunyian suatu data dengan melakukan teknik visibilitas pada java (private variabel dll). Pada contoh program pada modul tersebut adalah pada class Tabungan, dimana pada class tersebut terdapat beberapa variabel yang dibungkus, yaitu:
1. private String nama
2. private int noRekening
3. private int saldo
4. private int pin

Kenapa program tersebut memiliki hasil running sebagai berikut?
Wahyu
Hitung=0

Itu karena pada class StudentRecordExample pada line 13 terdapat System.out.println(Wahyu.getName()), dimana line tersebut memanggil Wahyu.getName(), dengan penjelasan sebagai berikut:
1. Wahyu melakukan inisialisasi pemanggilan terhadap class StudentRecord()
2. getName() merupakan function/method pada class StudentRecord()
3. Pada class method getName(), program melakukan return name, dimana isi dari variabel name didapatkan dari inisialisasi class StudentRecordExample pada line 9 (Wahyu.setName("Wahyu"))
4. Pada class StudentRecordExample line 9 (Wahyu.setName("Wahyu")) program akan mengirimkan paramater "Wahyu" kedalam method setName() pada class StudentRecord(), sehingga meenghasilkan output "Wahyu"
5. Lalu output Hitung=0 terjadi karena program memanggil StudentRecord.getStudentCount() dimana method getStudentCount() melakukan return variabel studentCount yang berisi 0.
