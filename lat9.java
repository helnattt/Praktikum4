public class lat9{
	public static void main(String[] args){
		int batas = 0;
		do{
			System.out.print(batas);
			batas--; //akan terjadi infinite loop
		} while (batas<10);
	}
	}