package Tugas2;

public class main {
    public static void main(String[] args) {

        System.out.println("=============  Pada class Manusia  =============");
        Manusia mns = new Manusia();
        mns.bernafas();
        mns.makan();

        System.out.println("=============  Pada class Dosen ==============");
        Dosen dsn = new Dosen();
        dsn.makan();
        dsn.lembur();

        System.out.println("=============  Pada class Mahasiswa  ============");
        Mahasiswa mhs = new Mahasiswa();
        mhs.makan();
        mhs.tidur();
        
    }
    
}
