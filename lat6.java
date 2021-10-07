public class lat6{
public static void main(String args[]){
	char hurufAwal = 'a';
	System.out.print("Masukkan huruf awal nama kamu : ");
	try{
		hurufAwal = (char)System.in.read();
	
	}catch(Exception e){
		System.out.println("Salah inputanmu cess!!");
	}
	switch(hurufAwal){
	case(char)-1 : System.out.println("bukan huruf depan!!"); break;
	case 'a' :System.out.println("apa namamu amin?");break;
	case 'b' :System.out.println("apa namamu bebek?");break;
	case 'c' :System.out.println("apa namamu cece?");		//saat break dihilangkan, maka case setelah c akan muncul juga
	case 'd' :System.out.println("apa namamu dede?");break;
	case 'e' :System.out.println("apa namamu eko?");break;
	default :System.out.println("aku tidak bisa menebak");
}		
}
}