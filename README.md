# MODUL VII - OVERLOADING DAN OVERRIDING
## Dasar Teori

**Overloading** merupakan keadaan dimana terdapat beberapa method yang mempunyai nama yang sama pada satu class, tetapi memiliki paramater yang berbeda. Overloading ini bertujuan untuk memudahkan penggunaan method yang memiliki fungsi hampir sama.
Contoh:
```java
public void print(Strint temp){
  System.out.println("Name: "+ name);
  System.out.println("Address: "+ address);
  System.out.println("Age: "+ age);
}
```
```java
public void print(double eGrade, double mGrade, double sGrade){
  System.out.printlon("Name: "+ name);
  System.out.printlon("Math Grade: "+ mGrade);
  System.out.printlon("English Grade: "+ eGrade);
  System.out.printlon("Science Grade: "+ sGrade);
}
```

Overloading mempunyai ciri-ciri sebagai berikut:
1. Memiliki nama method yang sama
2. Daftar paramater harus sama
3. Memiliki tipe return yang sama

Contoh terjadinya overriding dimana method RupiahVsDolar() pada class sekarang melakukan override method RupiahVsDolar() pada class dulu.
```java
class Dulu{
  public String RupiahVsDolar(){
    Syste.out.println("Rp. 10.000");
  }
}

class Sekarang extends Dulu{
  public String RupiahVsDolar(){
    System.out.println("Rp. 14.000");
  }
}
```

Method yang terkena override tidak boleh mempunyai modifier yang lebih luas aksenya dari method yang meng override.
