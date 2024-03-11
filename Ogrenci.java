public class Ogrenci {
    private String ad = "";
    private String bolum = "";
    private int girisYili;
    private String OgrenciNo = "";
    private double gano;
    private static final int bolumKodu = 258;
    private static int girisSirasi = 10;

    public Ogrenci() throws Exception {
        girisSirasi++;
        this.ad = "";
        this.bolum = "";
        this.gano = 1.0;
        this.girisYili = 2023;
        this.OgrenciNo = OgrNoHesapla();
    }

    public Ogrenci(String ad, String bolum) throws Exception {
        girisSirasi++;
        this.ad = ad;
        this.bolum = bolum;
        this.OgrenciNo = OgrNoHesapla();
    }

    public Ogrenci(String ad, String bolum, int girisYili, double gano) throws Exception {

        if (gano < 0 || gano > 4) {
            throw new IllegalArgumentException("Gano hatalı!");
        }
        girisSirasi++;
        this.ad = ad;
        this.bolum = bolum;
        this.gano = gano;
        this.girisYili = girisYili;
        this.OgrenciNo = OgrNoHesapla();
    }

    public Ogrenci(Ogrenci ogrenci) {
        girisSirasi++;
        this.ad = ogrenci.getAd();
        this.bolum = ogrenci.getBolum();
        this.gano = ogrenci.getGano();
        this.girisYili = ogrenci.getGirisYili();
        this.OgrenciNo = ogrenci.getOgrenciNo();
    }

    public String getAd() {
        if (ad.equals("")) {
            return "null";
        }
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBolum() {
        if (bolum.equals("")) {
            return "null";
        }
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getGirisYili() {
        return girisYili;
    }

    public void setGirisYili(int girisYili) {
        this.girisYili = girisYili;
    }

    public String getOgrenciNo() {
        return OgrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        OgrenciNo = ogrenciNo;
    }

    public int getGirisSirasi() {
        return girisSirasi;
    }

    public static int getBolumKodu() {
        return bolumKodu;
    }

    public double getGano() {
        return gano;
    }

    public void setGano(double gano){
        if (gano < 0 || gano > 4) {
            throw new IllegalArgumentException("Gano hatalı!");

        }
        this.gano = gano;
    }

    public String OgrNoHesapla() throws Exception {
        if (girisSirasi>999){
            throw new Exception("Öğrenci sayısı cok fazla");
        }

        if (girisSirasi < 10) {
            return String.valueOf(girisYili) + bolumKodu + "00" + girisSirasi;
        } else if (girisSirasi < 100) {
            return String.valueOf(girisYili) + bolumKodu + "0" + girisSirasi;
        } else
            return String.valueOf(girisYili) + bolumKodu + girisSirasi;
    }

    public double harcHesap(int derssayisi) {
        return derssayisi * 120;
    }

    public double harcHesap(int derssayisi, int uzatmalar) {
        return derssayisi * 120 * uzatmalar;
    }


}



