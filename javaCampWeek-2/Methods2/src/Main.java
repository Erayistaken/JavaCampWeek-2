
public class Main {

	public static void main(String[] args) {

		String mesaj = "Bugün hava çok güzel ";
		String yeniMesaj = şehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(15, 7);
		System.out.println(sayi);

	}

	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static void güncelle() {
		System.out.println("Güncellendi");
	}

	public static int topla(int sayi1, int sayi2) {

		return sayi1 + sayi2;
	}

	public static String şehirVer() {
		return "Ankara";

	}

}
