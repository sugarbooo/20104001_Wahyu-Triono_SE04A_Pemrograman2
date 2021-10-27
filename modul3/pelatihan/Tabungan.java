package modul3.pelatihan;

public class Tabungan {
    int saldo;

    Tabungan(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public void simpanUang(int saldo) {
        this.saldo = this.saldo + saldo;
    }

    public boolean ambilUang(int ambil) {
        if (this.saldo >= ambil) {
            this.saldo = this.saldo - ambil;
            return true;
        }
        return false;
    }
}
