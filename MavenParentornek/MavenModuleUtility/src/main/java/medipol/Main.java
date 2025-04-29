package medipol;

public class Main {

	public static void main(String[] args) {
		
		 Hesaplama hesap = new Hesaplama();
	        System.out.println("Toplam: " + hesap.topla(3, 5));
	        System.out.println("Fark: " + hesap.cikar(10, 4));
	        System.out.println("Çarpım: " + hesap.carp(3, 4));
	        System.out.println("Bölüm: " + hesap.bol(8, 2));
	}

}
