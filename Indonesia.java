public class Indonesia extends Negara{
	String nama;
	public void tampilkan(){
	System.out.println("Tampilan dari Kelas Indoneisa");
	}
	
	public void Negara(){
		super.tampilkan();
		super.pemerintahan();
		super.uud();
		super.pertahanan();

	}
	public static void main (String[] args){
		Indonesia cal = new Indonesia();
		pgl.Negara();
		
		
		Negara negara1 = new Negara();
        negara1.setPulau("Jawa");
        negara1.setIbukota("Jakarta");        
        System.out.println("Pulau Negara  = "+negara1.getPulau());
        System.out.println("Ibukota Negara  = "+negara1.getIbukota());
	}
}