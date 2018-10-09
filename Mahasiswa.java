package tugas2;

public class Mahasiswa {
String Nama, NIM, Alamat, GolonganDarah, Status, BeratBadan, TinggiBadan ;
	
	//method setter dan getter
	void setNama(String Nama){
		this.Nama = Nama;
	}
	
	public String getNama(){
		return this.Nama;
	}
	
	
	void setnim(String NIM){
		this.NIM = NIM;
	}
	
	public String getNIM(){
		return this.NIM;
	}
	
	void setalamat(String Alamat){
		this.Alamat = Alamat;
	}
	
	public String getAlamat(){
		return this.Alamat;
	}
	
	void setgolonganDarah(String GolonganDarah){
		this.GolonganDarah = GolonganDarah;
	}
	
	public String getGolongnDarah(){
		return this.GolonganDarah;
	}
	
	void setstatus(String Status){
		this.Status = Status;
	}
	
	public String getStatus(){
		return this.Status;
	}
	
	void tinggiBadan(String TinggiBadan){
		this.TinggiBadan = TinggiBadan;
	}
	
	public String getTinggiBadan(){
		return this.TinggiBadan;
	}
	
	public String getBeratBadan(){
		return this.BeratBadan;
	}
	void setberatBadan(String BeratBadan){
		this.BeratBadan = BeratBadan;
	}	

}
