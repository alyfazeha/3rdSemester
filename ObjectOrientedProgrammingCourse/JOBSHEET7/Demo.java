package JOBSHEET7;
public class Demo {
    public static void main(String[] args) {
        Manusia m1 = new Dosen();
        Manusia m2 = new Mahasiswa();

        m1.bernafas();
        m1.makan(); 

        m2.bernafas();
        m2.makan(); 
    }
}
