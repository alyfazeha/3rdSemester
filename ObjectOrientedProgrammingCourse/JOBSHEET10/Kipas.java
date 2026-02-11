package JOBSHEET10;
public class Kipas extends AlatElektronik {
    private String jenis;

    public Kipas(double harga, String warna, String merk, String jenis) {
        super(harga, warna, merk);
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void getInfo() {
        System.out.println("================ Info Kipas ================");
        System.out.println("Merk    : " + getMerk());
        System.out.println("Warna   : " + getWarna());
        System.out.println("Harga   : " + getHarga());
        System.out.println("Jenis   : " + getJenis());
        System.out.println();
    }
}
