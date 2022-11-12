package Praktikum;

public class manager extends karyawan {
    private double tunjangan;
    private String bagian;
    private staff set[];

    public void setTunjangan(double tunjangan){
        this.tunjangan=tunjangan;
    }
    public double getTunjangan(){
        return tunjangan;
    }
    public void setBagian(String bagian){
        this.bagian=bagian;
    }
    public String getBagian(){
        return bagian;
    }
    public void setStaff(staff set[]){
        this.set=set;
    }

    public void viewStaff(){
        int i;
        System.out.println("==========================");
        for(i=0;i<set.length;i++){
            set[i].lihatInfo();
        }
        System.out.println("==========================");
    }

    public void lihatInfo(){
       System.out.println("Manager   :"+this.getBagian());
       System.out.println("NIP       :"+this.getNip()); 
       System.out.println("Nama      :"+this.getNama()); 
       System.out.println("Golongan  :"+this.getGolongan()); 
       System.out.println("Tunjangan :"+this.getTunjangan());
       System.out.println("Gaji      :"+this.getGaji()); 
       System.out.println("Bagian    :"+this.getBagian());
       this.viewStaff();  
    }
    public double getGaji(){
        return super.getGaji()+tunjangan;
    }

    
}
