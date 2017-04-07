public class Negara {
    String pulau;
    String ibukota;
    
    
    public Negara(){   //konstruktor
        this.pulau="Nama Pulau";
        this.ibukota="Nama Ibu Kota";
    }
    public Negara(String p, String i){
        this.pulau = p;
        this.ibukota = i;
    }    
    public void setPulau(String p){
        this.pulau=p;
    }
    public void setIbukota(String i){
        this.ibukota = i;        
    }
    public String getPulau(){
        return this.pulau;
    }
    public String getIbukota(){
        return this.ibukota;
    }    
    public void pemerintahan(){
        System.out.println("Pemerintahan demokrasi");        
    }
    public void uud(){
        System.out.println("Undang undang dasar negara");        
    }
    public void pertahanan(){
        System.out.println("Mempertahankan kedaulatan negara");        
    }
	public void tampilkan(){
	System.out.println("Tampilan dari Kelas Negara");
	}
}