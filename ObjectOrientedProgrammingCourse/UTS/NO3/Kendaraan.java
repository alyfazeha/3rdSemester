package UTS.NO3;
import java.text.NumberFormat;
import java.util.Locale;

abstract class Kendaraan {
    private String platNomor;
    private String merek;
    private int tahun;
    private static final double BIAYA_CUCI = 50000.0; 

    public Kendaraan(String platNomor, String merek, int tahun) {
        this.platNomor = platNomor;
        this.merek = merek;
        this.tahun = tahun;
    }

    public String getPlatNomor() { return platNomor; }
    public String getMerek() { return merek; }
    public int getTahun() { return tahun; }
    
    public abstract String getJenisKendaraan();
    public abstract double getBiayaDasarServis();

    public double hitungBiayaServis() {
        return getBiayaDasarServis();
    }

    public double hitungBiayaServis(boolean denganCuci) {
        double biayaTotal = getBiayaDasarServis();
        if (denganCuci) {
            biayaTotal += BIAYA_CUCI;
        }
        return biayaTotal;
    }
}
