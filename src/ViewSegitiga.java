/* Danang Wisnu Prayoga - 24060120140160 */
/* ------------- Tugas PBO ------------- */

import java.util.*;

public class ViewSegitiga {
    protected int sisiA, sisiB, sisiC;
    protected int kategori;
    protected String segitiga;

    // procedure readSisiA()
    public void readSisiA() {
        System.out.print("Masukkan Sisi A : ");
        Scanner input = new Scanner(System.in);
        this.sisiA = input.nextInt();
    }

    // procedure readSisiB()
    public void readSisiB() {
        System.out.print("Masukkan Sisi B : ");
        Scanner input = new Scanner(System.in);
        this.sisiB = input.nextInt();
    }

    // procedure readSisiC()
    public void readSisiC() {
        System.out.print("Masukkan Sisi C : ");
        Scanner input = new Scanner(System.in);
        this.sisiC = input.nextInt();
    }

    // funtion getSisiA()
    public int getSisiA() {
        return this.sisiA;
    }

    // funtion getSisiB()
    public int getSisiB() {
        return this.sisiB;
    }

    // funtion getSisiC()
    public int getSisiC() {
        return this.sisiC;
    }

    // procedure setSegitiga()
    public void setSegitiga(int i) {
        this.kategori = i;
    }

    // procedure showSegitiga()
    public void showSegitiga() {
        // Case kategori
        switch (this.kategori) {
            case -999:
                System.out.println("Bukan segitiga");
                break;
            case 1:
                System.out.println("Segitiga sama sisi");
                break;
            case 2:
                System.out.println("Segitiga sama kaki");
                break;
            case 3:
                System.out.println("Segitiga siku - siku");
                break;
            case 4:
                System.out.println("Segitiga sembarang");
                break;
        }
    }
}
