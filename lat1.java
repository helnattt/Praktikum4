public class lat1{
	public static void main(String args[]){
		char hurufAwal= 'a';
		System.out.print("Masukkan huruf awal nama Anda : ");
		try{
			hurufAwal=(char)System.in.read();
		}catch(Exception e){
			System.out.println("Salah inputan cess...!!");
		}
		if(hurufAwal =='a')
			System.out.println ("apa namamu amin?");
		else if (hurufAwal == 'b')
			System.out.println("apa namamu bambang?");
		else if (hurufAwal == 'c')
			System.out.println("apa namamu cece?");
		else if (hurufAwal == 'd')
			System.out.println("apa namamu daud?");
		else if (hurufAwal == 'e')
			System.out.println("apa namamu eko?");
		else 
			System.out.println("aku tidak bisa menebak");
	}
}