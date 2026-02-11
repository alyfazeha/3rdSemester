package UTS.NO3;

class Motor extends Kendaraan {
    private static final double BIAYA_SERVIS_DASAR = 250000.0;

    public Motor(String platNomor, String merek, int tahun) {
        super(platNomor, merek, tahun);
    }

    @Override
    public String getJenisKendaraan() {
        return "Motor";
    }

    @Override
    public double getBiayaDasarServis() {
        return BIAYA_SERVIS_DASAR;
    }
}
