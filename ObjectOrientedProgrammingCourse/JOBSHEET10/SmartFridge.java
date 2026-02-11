package JOBSHEET10;
public class SmartFridge extends Kulkas implements Audible {
    private int volume;

    public SmartFridge(int volume, int jumlahPintu, double harga, String warna, String merk) {
        super(harga, warna, merk, jumlahPintu);
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

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void getInfo() {
        System.out.println("============= Info Smart Fridge ============");
        System.out.println("Merk        : " + getMerk());
        System.out.println("Warna       : " + getWarna());
        System.out.println("Harga       : " + getHarga());
        System.out.println("Jumlah Pintu: " + getJumlahPintu());
        System.out.println("Volume      : " + getVolume());
        System.out.println();
    }
}
