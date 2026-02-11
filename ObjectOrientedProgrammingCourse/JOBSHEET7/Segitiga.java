package JOBSHEET7;
public class Segitiga {
    int sudut;

    int totalSudut(int sudutA) {
        return 180 - sudutA;
    }
    int totalSudut(int sudutA, int sudutB) {
        return 180 - (sudutA + sudutB);
    }

    int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }
    double keliling(int sisiA, int sisiB) {
        return Math.sqrt((sisiA * sisiA) + (sisiB * sisiB));
    }

    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();
        System.out.println("Total sudut (1 parameter): " + segitiga.totalSudut(60));
        System.out.println("Total sudut (2 parameter): " + segitiga.totalSudut(60, 30));
        System.out.println("Keliling (3 sisi): " + segitiga.keliling(3, 4, 5));
        System.out.println("Keliling (2 sisi): " + segitiga.keliling(3, 4));
    }
}

