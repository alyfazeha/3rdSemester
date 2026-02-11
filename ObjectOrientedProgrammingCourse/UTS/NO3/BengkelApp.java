package UTS.NO3;
import java.text.NumberFormat;
import java.util.Locale;

public class BengkelApp {

    public static String formatRupiah(double number) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        formatter.setMaximumFractionDigits(0);
        return formatter.format(number).replace("Rp", "Rp");
    }

    public static void tampilkanData(Kendaraan k) {
        System.out.println("No Plat: " + k.getPlatNomor());
        System.out.println("Merk: " + k.getMerek());
        System.out.println("Tahun: " + k.getTahun());
        System.out.println("Jenis: " + k.getJenisKendaraan());
        
        double biayaServis = k.hitungBiayaServis();
        System.out.println("Biaya Servis: " + formatRupiah(biayaServis));
        
        double biayaServisCuci = k.hitungBiayaServis(true);
        System.out.println("Biaya Servis + Cuci: " + formatRupiah(biayaServisCuci));
        System.out.println();
    }

    public static void main(String[] args) {
        Mobil mobil = new Mobil("N 1234 AB", "Toyota", 2020);
        Motor motor = new Motor("N 5678 XY", "Honda", 2022);

        System.out.println("=== Data Servis Bengkel Maju Jaya ===");
        tampilkanData(mobil); 
        tampilkanData(motor);
    }
}
