/* Danang Wisnu Prayoga - 24060120140160 */
/* ------------- Tugas PBO ------------- */

public class ModelSegitiga {
    protected int i;

    /*
     * Keterangan i :
     * -999 : Bukan segitiga
     * 1 : Segitiga sama sisi
     * 2 : Segitiga sama kaki
     * 3 : Segitiga siku - siku
     * 4 : Segitiga sembarang
     */

    // konstruktor Model
    public ModelSegitiga() {
        // Inisialisasi --> Bukan segitiga
        this.i = -999;
    }

    // funtion cekSegitiga(int a, int b, int c)
    public int cekSegitiga(int a, int b, int c) {

        // Pengkondisian menentukan segitiga berdasarkan ketiga sisi.
        // Ketiga sisi harus lebih dari 0
        if (a > 0 && b > 0 && c > 0) {

            // Rumus apakah sisi membentuk segitiga
            if (a + b > c && a + c > b && b + c > a) {

                // Segitiga sama sisi
                if (a == b && b == c) {
                    this.i = 1;
                }

                // Segitiga sama kaki
                else if ((a == b && b != c) ||
                        (a == c && c != b) ||
                        (b == c && c != a)) {
                    this.i = 2;
                }

                // Segitiga siku - siku
                else if ((a * a) + (b * b) == c * c ||
                        (a * a) + (c * c) == b * b ||
                        (b * b) + (c * c) == a * a) {
                    this.i = 3;
                }

                // Segitiga sembarang
                else if (a != b && b != c && c != a) {
                    this.i = 4;
                }
            }
        }
        return this.i;
    }
}
