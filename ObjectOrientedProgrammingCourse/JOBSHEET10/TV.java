package JOBSHEET10;
public class TV extends AlatElektronik implements Audible {
    private String jenisLayar;
    private int volume;

    public String getJenisLayar() {
        return jenisLayar;
    }

    public void setJenisLayar(String jenisLayar) {
        this.jenisLayar = jenisLayar;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public TV(double harga, String warna, String merk, String jenisLayar, int volume) {
        super(harga, warna, merk);
        this.jenisLayar = jenisLayar;
        this.volume = volume;
    }

    @Override
    public void naikkanVolume(int increment) {
        volume += increment;
    }

    @Override
    public void turunkanVolume(int decrement) {
        volume -= decrement;
    }

    public void getInfo() {
        System.out.println("================= Info TV ==================");
        System.out.println("Merk        : " + getMerk());
        System.out.println("Warna       : " + getWarna());
        System.out.println("Harga       : " + getHarga());
        System.out.println("Jenis Layar : " + getJenisLayar());
        System.out.println("Volume      : " + getVolume());
        System.out.println();
    }
}
