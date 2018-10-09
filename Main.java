package tugas2;

public class Main {
	public static void main(String[] args) {
		System.out.println("------Object Kelas Kotak------");
		
		// Membuat Object dari Class Kotak
		Kotak Main = new Kotak();
			
		// Method Setter Kotak
		Main.setpanjang(99.23);
		Main.setlebar(23.99);
			
		// Method Getter Kotak
		System.out.println("Panjang Kotak : " + Main.getpanjang());
		System.out.println("Lebar Kotak : " + Main.getlebar());
		System.out.println("Luas Kotak : " + Main.getpanjang()*Main.getlebar());
		System.out.println("Keliling Kotak : " + Main.getlebar()*Main.getpanjang()*Main.getlebar()*Main.getpanjang());
		
		System.out.println("------Biodata Pribadi Mahasiswa------");
		
		//Membuat Object dari Class Mahasiswa
		Mahasiswa Mahasiswa = new Mahasiswa();
		
		//Method Setter Mahasiswa
		Mahasiswa.Nama = "Wira Prayana Yaskur";
		Mahasiswa.NIM = "D0217363";
		Mahasiswa.Alamat = "Tanjung Batu";
		Mahasiswa.GolonganDarah = "O";
		Mahasiswa.Status = "Mahasiswa";
		Mahasiswa.BeratBadan = "82";
		Mahasiswa.TinggiBadan = "183";
		
		
		//Method Getter Mahasiswa
		System.out.println("Nama Mahasiswa : " + Mahasiswa.getNama());
		System.out.println("NIM : " + Mahasiswa.getNIM());
		System.out.println("Alamat : " + Mahasiswa.getAlamat());
		System.out.println("Golongan Darah : " + Mahasiswa.getGolongnDarah());
		System.out.println("Status : " + Mahasiswa.getStatus());
		System.out.println("Berat Badan : " + Mahasiswa.getBeratBadan());
		System.out.println("Tinggi Badan : " + Mahasiswa.getTinggiBadan());
		
		System.out.println("------Kelas Node------");
		
		//Membuat Object dari Kelas node
		Node Node = new Node();
		
		//Method Setter Node
		Node.Label = "IZOURA";
		Node.Value = 1;
		
		//Method Getter Node
		System.out.println("Nama Label Minuman : " + Node.getlabel());
		System.out.println("jumlah label Minuman: " + Node.getValue());

		System.out.println("------Kelas Stack------");
		
		//Membuat Object dari Kelas Stack
		Stack Stack = new Stack();
		
		Stack.Value[0] = "Wira Prayana Yaskur";
		Stack.Value[1] = "ZUlkifli Suriadi";
		Stack.Value[2]= "Muh Dandi Dahri";
		Stack.Value[3]= "Rusman";
		Stack.Value[4]= "Muhammad Baqilani";
		Stack.setvalueAt(5 ,"Muhammad Irsyad Bol");

		//Menampilkan stack
		for(int i=0;i<Stack.Value.length;i++){System.out.println(Stack.Value[i]);};		
	}

}
