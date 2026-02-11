package JOBSHEET4;
import java.util.ArrayList;
import java.time.LocalDate;
public class Patient {
    private String noRekamMedis;
    private String name;
    private ArrayList<Konsultasi> riwayatKonsultasi;

    public String getNoRekamMedis() {
        return noRekamMedis;
    }
    public void setNoRekamMedis (String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }
    public String getName() {
        return name;
    }
    public void setName (String name) {
        this.name = name;
    }

    public Patient (String noRekamMedis, String name) {
        this.noRekamMedis = noRekamMedis;
        this.name = name;
        this.riwayatKonsultasi = new ArrayList<Konsultasi>();
    }

    public String getInfo() {
        String info = "";
        info += "No Rekam Medis     : " + this.noRekamMedis + "\n";
        info += "Nama               : " + this.name + "\n";

        if (!riwayatKonsultasi.isEmpty()) {
            info += "Riwayat Konsultasi :\n";

            for (Konsultasi konsultasi : riwayatKonsultasi) {
                info += konsultasi.getInfo();
            }
        } else {
            info += "Belum ada riwayat konsultasi";
        }
        
        info += "\n";

        return info;
    }

    public void tambahKonsultasi (LocalDate tanggal, Employee dokter, Employee perawat) {
        Konsultasi konsultasi = new Konsultasi();
        konsultasi.setTanggal(tanggal);
        konsultasi.setDokter(dokter);
        konsultasi.setPerawat(perawat);
        riwayatKonsultasi.add(konsultasi);
    }
}
