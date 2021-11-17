# MODUL VI - KONSEP INHERITANCE
## Dasar Teori

**Inheritance** atau turunan merupakan konsep yang digunakan dalam pemrograman dimana class dapat menurunkan property atau method dari class utama nya.
```java
public class B extends A {
    
}
```
Code diatas berarti class A akan menurunkan properti atau method nya ke dalam class B.

**Super** atau kunci super digunakan dalam merujuk pada member dari class utamanya. Beberapa hal yang harus diingat dalam penggunaan kunci super:
1. Pemanggil super() harus dijadikan pernyataan pertama di dalam constructor
2. Pemanggil super() hanya dapat digunakan dalam definisi constructor
3. Termasuk contructor this() dan pemanggil super() tidak boleh terjadi dalam constructor yang sama.
```java
public class Siswa{
    private int nilai;
    public setNilai (int nilai){
        this.nilai = nilai;
    }
}
```

# Praktikum
Hasil output:
![Hasil output](https://i.ibb.co/XxQnhjN/image-2021-11-18-001824.png)
![Hasil output](https://i.ibb.co/3smD8B6/image-2021-11-18-001934.png)
![Hasil output](https://i.ibb.co/PNKs3P7/image-2021-11-18-002002.png)
