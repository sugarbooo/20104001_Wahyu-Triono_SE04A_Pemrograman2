# MODUL VIII - POLIMORFISME
## Dasar Teori

**Polymorphism** dalam bahasa inggir merupakan sebuah prinsip dalam biologi di mana organisme atau spesies memiliki banyak bentuk atau tahapan. Sehingga dapat diartikan dalam pemrograman java, polimorfisme adalah sebuah prinsip di mana class memiliki banyak bentuk method yang berbeda-beda meskipun nama method nya sama.
Cara pemanggilan:
```java
Employee employee=new Manager();
//<nama class> <variable bebas> = new <kontruktor>();
```

**Virtual Method Invocation (VMI)** terjadi ketika polimorfisme dan overriding dilakukan. Ketika objek yang telah dibuat memanggil overridding method pada parrent class nya, compiler akan melakukan pemanggilan terhadap overriding method yang terdapat pada subclass, yang seharusnya dipanggil overriding method. 
Contoh terjadi VMI:
```java
class Parent {
  int x = 5;
  public void Info() {
    System.out.println(“Ini class Parent”);
  }
}
class Child extends Parent {
  int x = 10;
  public void Info() {
    System.out.println(“Ini class Child”);
  }
}
public class Tes {
  public static void main(String args[]) {
    Parent tes = new Child();
    System.out.println(“Nilai x = “+tes.x);
    tes.Info();
  }
}

// Hasil running
// Nilai x = 5
// Ini class Child
```

**Polimorphic arguments** merupakan tipe paramater yang dapat menerima nilai bertipe dari subclass-nya. 
Contoh:
```java
class Pegawai {
  …}
class Manajer extends Pegawai {
  …}
public class Tes {
  public static void Proses(Pegawai peg) {
    …}
  public static void main(String args[]) {
    Manajer man = new
    Manajer();
    Proses(man);
  }
```

**Instaneceof** sangat berguna dalam mengetahui tipe asal dari suatu polymotphic arguments. Misalnya dari contoh polimorphic arguments, kita modifikasi pada class Tes dan ditambah sebuah class baru Kurir:
```java
…
class Kurir extends Pegawai {
  …}
public class Tes {
  public static void Proses(Pegawai peg) {
    if (peg instanceof Manajer) {
      …
      lakukan tugas - tugas manajer…
    } else if (peg instanceof Kurir) {
      …
      lakukan tugas - tugas kurir…
    } else {
      …
      lakukan tugas - tugas lainnya…
    }
  }
  public static void main(String args[]) {
    Manajer man =
      new
    Manajer();
    Kurir kur = new Kurir();
    Proses(man);
    Proses(kur);
  }
}
```
Pemakaian instanceof sering diikuti dengan casting object dari tipe paramater ke tipe asal. Misalnya program sebelumnya pada saat setelah melakukan instanceof dari tipe Manajer, kita melakukan casting objek ke tipe asalnya, yaitu Manajer. Caranya sebagai berikut:
```java
…
if (peg instanceof Manajer) {
  Manajer man = (Manajer) peg;…
  lakukan tugas - tugas manajer…
}
```
