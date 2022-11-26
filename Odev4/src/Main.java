import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Hesaplama hesap=new Hesaplama();
	
		
		String islemler="Boy kilo indeksi hesaplama için 1 basın\n"+
		"Karenin Alanını hesaplama için 2 basın\n"+
		"Karenin Çevresini hesaplama için 3 basın\n"+
		"Dairenin Çevresini hesaplama için 4 basın\n"+
		"Dairenin Alanının hesaplamak için 5 basın\n"+
		"Dik üçgenin Hipotenusu hesaplamak için 6 basın\n"+
		"Üçgenin alanını hesaplamak için 7 basın\n"+
		"Üçgenin çevresini hesaplamak için 8 basın\n"+
		"Vize ve final notunu girdiğimiz öğrençinin notunu hesaplamak için 9 basın\n"+
		"Programdan çıkmak için 0 basın ";
		
		while(true) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("-----------------------------");
			System.out.println(islemler);
			System.out.print("Yapmak istediğiniz işlemi giriniz:");
			try {
			int islem=scanner.nextInt();
			scanner.nextLine();
			switch (islem) {
			case 1: {
				hesap.BoyKiloIndeksi();
				break;
			}
			case 2:{
				System.out.print("Karenin kısa kenarını giriniz:");
				int kisa=scanner.nextInt();
				System.out.print("Karenin uzun kenarını giriniz:");
				int uzun=scanner.nextInt();
				hesap.AlanHesaplama(uzun, kisa);
				break;
			}
			case 3:{
				System.out.println("Üçgenin çevresi:"+hesap.CevreHesaplama());
				break;
			}
			case 4:{
				System.out.print("Dairenin yarı çapını giriniz:");
				double r=scanner.nextDouble();
				System.out.println("Dairenin çevresi:"+hesap.DaireCevreHesaplama(r));
				break;
			}
			case 5:{
				System.out.print("Dairenin yarı çapını giriniz:");
				double r=scanner.nextDouble();
				System.out.println("Dairenin Alanı:"+hesap.DaireAlanHesaplama(r));
				break;
			}
			case 6:{
				hesap.HipotenusHesaplama();
				break;
			}
			case 7:{
				System.out.print("Üçgenin 1. kenarı giriniz:");
				int a=scanner.nextInt();
				System.out.print("Üçgenin 2. kenarı giriniz:");
				int b=scanner.nextInt();
				System.out.print("Üçgenin 3. kenarı giriniz:");
				int c=scanner.nextInt();
				hesap.UcgenAlanHesaplama(a, b, c);
				break;
			}
			case 8:{
				System.out.print("Üçgenin 1. kenarı giriniz:");
				int a=scanner.nextInt();
				System.out.print("Üçgenin 2. kenarı giriniz:");
				int b=scanner.nextInt();
				System.out.print("Üçgenin 3. kenarı giriniz:");
				int c=scanner.nextInt();
				hesap.UcgenCevreHesaplama(a, b, c);
				break;
			}
			case 9:{
				System.out.print("Öğrecinin adı ve soyadı:");
				String isim=scanner.nextLine();
				System.out.print("Öğrencinin vize notunu giriniz :");
				double vize=scanner.nextDouble();
				System.out.println("Öğrencinin final notunu giriniz:");
				double finalNotu=scanner.nextDouble();
				
				hesap.Harf(hesap.NotHesaplama(vize, finalNotu), isim);
				break;
				
			}
			case 0:{
				System.out.println("Programdan çıkılıyor...");
				return;
			}
			}
			}catch (Exception e) {
				System.out.println("Sistemde bir hata oluştu");
			}
			
		}


	}

}
