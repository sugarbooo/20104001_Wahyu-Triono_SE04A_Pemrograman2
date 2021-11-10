package Percobaan;

import Percobaan.Mahasiswa;

public class Mahasiswa {
    private int kodekelas;
    private String namakelas;
    private Mahasiswa mahasiswa;

    public Mahasiswa(int kode, String nama) {
        this.kodekelas = kode;
        this.namakelas = nama;
    }

    public void setMhs(Mahasiswa mhs) {
        this.mahasiswa = mhs;
    }
}
