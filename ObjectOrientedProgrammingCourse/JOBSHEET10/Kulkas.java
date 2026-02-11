package JOBSHEET10;
public class Kulkas extends AlatElektronik {
    private int jumlahPintu;

    public Kulkas(double harga, String warna, String merk, int jumlahPintu) {
        super(harga, warna, merk);
        this.jumlahPintu = jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void getInfo() {
        System.out.println("=============== Info Kulkas ================");
        System.out.println("Merk        : " + getMerk());
        System.out.println("Warna       : " + getWarna());
        System.out.println("Harga       : " + getHarga());
        System.out.println("Jumlah Pintu: " + getJumlahPintu());
        System.out.println();
    }
}
