package UTS.NO3;

class Mobil extends Kendaraan {
    private static final double BIAYA_SERVIS_DASAR = 500000.0;

    public Mobil(String platNomor, String merek, int tahun) {
        super(platNomor, merek, tahun);
    }

    @Override
    public String getJenisKendaraan() {
        return "Mobil";
    }

    @Override
    public double getBiayaDasarServis() {
        return BIAYA_SERVIS_DASAR;
    }
}
