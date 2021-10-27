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
