import java.util.Scanner;
public class lat5
{
	public static void main(String[]args)
{
   
    int bil;
    Scanner sc=new Scanner(System.in);
    System.out.println("Masukkan bilangan : ");
    bil=sc.nextInt();
    if (bil<0){
        System.out.println("bilangan " +bil+ " adalah bilangan negative");

    }
    if (bil>0){
        System.out.println("bilangan " +bil+ " adalah bilangan positif");
    }

    if (bil==0){
        System.out.println("bilangan " +bil+ " adalah bukan positif atau negative");
    }
  }
}