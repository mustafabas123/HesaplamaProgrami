import java.util.Scanner;

public class Hesaplama {
	
	public void BoyKiloIndeksi() {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("--------------------------------");
		System.out.println("---Boy Kilo Indeksi Hesaplama---");
		System.out.println("--------------------------------");
		
		System.out.println("--------------------------------");
		System.out.print("Lütfen kilonuzu giriniz(KG):");
		double kilo=scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println("----------------------------------");
		System.out.print("Lütfen Boyunuzu giriniz(M):");
		double boy=scanner.nextDouble();
		scanner.nextLine();
		
		double bke=kilo/(boy*boy);
		
		if(bke<18.5) {
			System.out.println(" isimli kişisi zayıftır ");
			System.out.println("Boy kütle indeksi:"+bke);
		}
		else if(bke>18.5 && bke<25.0) {
			System.out.println(" isimli kişisi normaldir");
			System.out.println("Boy kütle indeksi:"+bke);
		}
		else if(bke>25.0 && bke<30.0) {
			System.out.println(" isimli kişisi biraz kilole");
			System.out.println("Boy kütle indeksi:"+bke);
		}
		else if(bke>=30 && bke<35.0) {
			System.out.println(" isimli kişisi obezdir derecesininde kilolu");
			System.out.println("Boy kütle indeksi:"+bke);
		}
		else {
			System.out.println(" isimli kişisi obezdir");
			System.out.println("Boy kütle indeksi:"+bke);
		}
		
	}
	public void AlanHesaplama(double UzunKenar,double KisaKenar) {
		double sonuc=UzunKenar*KisaKenar;
		System.out.println("Karenin alani:"+sonuc);
		
	}
	public double CevreHesaplama() {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Karenin uzun kenarı:");
		double uzun=scanner.nextDouble();
		System.out.print("Karenin kisa kenarı:");
		double kisa=scanner.nextDouble();
		
		return (uzun*2)+(kisa*2);
	}
	public double DaireCevreHesaplama(double yariCap) {
		return Math.PI*2*yariCap;
		
	}
	public double DaireAlanHesaplama(double yariCap) {
		return Math.PI*yariCap*yariCap;
	}
	public void HipotenusHesaplama() {
	    Scanner scanner=new Scanner(System.in);
	    
	    System.out.print("Lütfen üçgenin bir kenarını giriniz:");
	    int a=scanner.nextInt();
	    System.out.print("Lütfen diğer kenarı giriniz:");
	    int b=scanner.nextInt();
	    double hipotenus=Math.sqrt(a*a+b*b);
	    System.out.println("Üçgenin Hipotenusü: "+hipotenus);
	}
	public void UcgenAlanHesaplama(int a,int b,int c) {
	       double u=(a+b+c)/2.0;
	       double alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
	        System.out.println(" üçgenin'nin alanı: "+alan);
	}
	public void UcgenCevreHesaplama(int a,int b,int c) {
		double cevre=a+b+c;
		System.out.println("Üçgenin çevresi:"+cevre);
	}
	public double NotHesaplama(double vizeNot,double finalNot) {
		double sonuc=(vizeNot*0.4)+(finalNot*0.6);
		return sonuc;
	}
	public void Harf(double Not,String isim) {
		if(Not>85) {
			System.out.println(isim+" isimli öğrenci Dersten AA ile geçti");
			System.out.println(isim+" isimli öğrencinin Notu:"+Not);
		}
		else if(Not<85 && Not>=70) {
			System.out.println(isim+" isimli öğrenci Dersten BB ile geçti");
			System.out.println(isim+" isimli öğrencinin Notu:"+Not);
		}
		else if(Not<70 && Not>=60) {
			System.out.println(isim+" isimli öğrenci Desten CC ile geçti");
			System.out.println(isim+" isimli öğrencinin Notu:"+Not);
		}
		else if(Not<60 && Not>=50) {
			System.out.println(isim+" isimli öğrenci Desten DD ile sorulu geçti");
			System.out.println(isim+" isimli öğrencinin Notu:"+Not);
		}
		else if(Not<49) {
			System.out.println(isim+" isimli öğrenci Desten FF ile kaldı");
			System.out.println(isim+" isimli öğrencinin Notu:"+Not);
		}
		
		
	}
	
		
}
