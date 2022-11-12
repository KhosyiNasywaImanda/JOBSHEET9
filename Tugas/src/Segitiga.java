import static java.lang.Math.sqrt;
public class Segitiga {
    private int sudut;

    public int totalSudut(int sudutA){
        sudut = (180 - sudutA);
        System.out.println("Rumus 1 untuk mencari total sudut :"+sudut);
        return sudut; 
    }
    public int totalSudut(int sudutA, int sudutB){
        sudut = (180 - (sudutA + sudutB));
        System.out.println("Rumus 2 untuk mencari total sudut :"+sudut);
        return sudut;
    }
    public int keliling(int sisiA, int sisiB , int sisiC){
        int keliling = sisiA + sisiB + sisiC;
        System.out.println("Rumus 1 untuk mencari keliling segitiga :"+keliling);
        return keliling;
    }
    public double keliling(double sisiA, double sisiB ){
        double sisiC = (double) sqrt((sisiA * sisiA) + (sisiB * sisiB));
        double keliling = sisiA + sisiB + sisiC;
        System.out.println("Rumus 2 untuk mencari keliling segitiga :"+keliling);
        return keliling;
    }

    // public void cetak(){
    //     System.out.println("Rumus 1 untuk mencari total sudut :"+sudut);
    //     System.out.println("");
    //     System.out.println("Rumus 1 untuk mencari total sudut :"+totalSudut(sudut));
    //     System.out.println("");
    //     System.out.println("Rumus 2 untuk mencari total sudut :"+totalSudut(sudut, sudut));
    //     System.out.println("");
    // }




}
