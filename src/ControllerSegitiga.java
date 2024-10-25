/* Danang Wisnu Prayoga - 24060120140160 */
/* ------------- Tugas PBO ------------- */

public class ControllerSegitiga {
    protected ModelSegitiga M;
    protected ViewSegitiga V;
    protected int sisiA, sisiB, sisiC, kategori;

    // konstruktor Controller
    public ControllerSegitiga() {
        // Inisialisasi objek Model dan View
        M = new ModelSegitiga();
        V = new ViewSegitiga();

        // Menjalankan fungsi main
        V.readSisiA();
        V.readSisiB();
        V.readSisiC();

        // Mengambil nilai sisi dari View
        sisiA = V.getSisiA();
        sisiB = V.getSisiB();
        sisiC = V.getSisiC();

        // Menjalankan fungsi cekSegitiga dari Model
        kategori = M.cekSegitiga(sisiA, sisiB, sisiC);

        // Menampilkan hasil kategori segitiga
        V.setSegitiga(kategori);
        V.showSegitiga();
    }
}
