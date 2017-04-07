public class Malaysia extends Negara{
	String nama;
	public void tampilkan(){
	System.out.println("Tampilan dari Kelas Malaysia");
	}
	
	public void Sepeda(){
		tampilkan();
		super.tampilkan();
		super.pemerintahan();
		super.uud();
		super.pertahanan();

	}
	public static void main (String[] args){
		Malaysia cal = new Malaysia();
		cal.Malaysia();
		
		Negara negara1 = new Negara();
        negara1.setPulau("Senarai");
        negara1.setIbukota("Kuala Lumpur");        
        System.out.println("Pulau Negara  = "+negara1.getPulau());
        System.out.println("Ibukota Negara  = "+negara1.getIbukota());
	}
}