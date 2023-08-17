import java.util.Scanner;

public class HesapMak {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1. Numarayi Giriniz: ");
		int n1 = scanner.nextInt();
		System.out.print("2. Numarayi Giriniz: ");
		int n2 = scanner.nextInt();
		
		System.out.println("1 Toplama \n2 Cikarma \n3 Carpma \n4 Bolme");
		
		System.out.println("Seciminizi yapiniz: ");
		int select = scanner.nextInt();
		
		switch (select) {
		case 1:
			System.out.println("Sonuc: " + (n1 + n2));
			break;
		case 2:
			System.out.println("Sonuc: " + (n1 - n2));
			break;
		case 3:
			System.out.println("Sonuc: " + (n1 * n2));
			break;
		case 4:
			System.out.println("Sonuc: " + (n1 / n2));
			break;
		default:
			System.out.println("Boyle bir islem bulunmamaktadir!!!");
			break;
		}

	}

}
