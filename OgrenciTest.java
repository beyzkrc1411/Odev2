
public class OgrenciTest {

    public static void main(String[] args) throws Exception {
        Ogrenci o1 = new Ogrenci();
        Ogrenci o2 = new Ogrenci("Sinem", "Bilgisayar");
        Ogrenci o3 = new Ogrenci("Nazlı", "Bilgisayar", 2024, 2.5);
        System.out.println("Ogrenciler ---------------------------");
        System.out.println("OGR-1 " + o1.getAd() + " " + o1.getBolum() + " " + o1.getGano() + " " + o1.getGirisYili());
        System.out.println("OGR-2 " + o2.getAd() + " " + o2.getBolum() + " " + o2.getGano() + " " + o2.getGirisYili());
        System.out.println("OGR-3 " + o3.getAd() + " " + o3.getBolum() + " " + o3.getGano() + " " + o3.getGirisYili());
        System.out.println("OGR-1 ogrNo " + o1.getOgrenciNo());
        System.out.println("OGR-3 ogrNo " + o3.getOgrenciNo());

        System.out.println("OGR-1 Harc " + o1.harcHesap(4));
        System.out.println("OGR-2 Harc " + o2.harcHesap(4, 3));
    }

}