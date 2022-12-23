import java.beans.AppletInitializer;

class Pemain{
    public String nama;
    public Darah darah;
    

    Pemain(String nilai){
        this.nama=nilai;
    }

    public void setUang(Darah darah){
        this.darah=darah;
    }

    public void status(){
        System.out.println("Nama : "+this.nama);
        System.out.println("Darah : "+this.darah.getDarah());
    }

    public String getNama(){
        return this.nama;
    }
}

class Darah{
    private int kembalian;
    private int darah;
    private Pemain manusia;
    private Barang barang;

    Darah(){
        this.darah = 100;
    }

    public int getDarah(){
        return this.darah;
    }

    public void setManusia(Pemain manusia){
        this.manusia=manusia;
    }

    public void beli(){
        System.out.println("Saya membeli "+this.barang.getNama()+" seharga "+this.barang.getHarga());
        if (this.darah > this.barang.getHarga()){
            kembalian = this.darah - this.barang.getHarga();
        }else{
            kembalian = 0;
            this.darah-=kembalian;
        }
    }

    public int getKembalian(){
        return kembalian;
    }

    public void setBarang(Barang barang){
        this.barang=barang;
    }
}

class Barang{
    private String nama;
    private int harga;

    Barang(String nilai,int value){
        this.nama=nilai;
        this.harga=value;
    }

    public int getHarga(){
        return this.harga;
    }

    public String getNama(){
        return this.nama;
    }
}

class Pelindung{
    private String nama_pelindung;
    private String kekuatan;

    Pelindung(String pelindung, String kekuatan){
        this.nama_pelindung=pelindung;
        this.kekuatan=kekuatan;
    }

    public void status2(){
        System.out.println("pelindung : "+this.nama_pelindung);
        System.out.println("kekuatan : "+this.kekuatan);
    }


}

class Senjata{
    private String nama_senjata;
    private String kekuatan_senjata;

    Senjata(String nilai, String value){
        this.nama_senjata=nilai;
        this.kekuatan_senjata=value;
    }

    public void status3(){
        System.out.println("nama senjata : "+this.nama_senjata);
        System.out.println("kekuatan : "+this.kekuatan_senjata);
    }
}

class pemain1{
    private Pemain nama;
    private Darah darah;
    private Pelindung pelindung;
    private Senjata senjata;

    

    pemain1(Pemain pemain, Darah darah, Pelindung pelindung, Senjata senjata){
        this.nama=pemain;
        this.darah=darah;
        this.pelindung=pelindung;
        this.senjata=senjata;


    }

    public void setpemain(){
        System.out.println("pemain 1");
        System.out.println("nama : "+this.nama);
        System.out.println("darah : "+this.darah);
        System.out.println("pelindung : "+this.pelindung);
        System.out.println("senjata : "+this.senjata);

    } 
}
public class App {
    public static void main(String[] args) throws Exception {
        Pemain orang1 = new Pemain("Badrul");
        pemain1 orang4 = new pemain1(orang1, null, null, null);
        Pelindung orang = new Pelindung("armor", "api");
        Senjata orang2 = new Senjata("parang", "45");
        Barang barang1 = new Barang("baju", 75000);
        Darah nominal1 = new Darah();
        orang1.setUang(nominal1);
        nominal1.setManusia(orang1);
        orang1.status();
        orang.status2();
        orang2.status3();
        nominal1.setBarang(barang1);
        nominal1.beli();
        orang4.setpemain();
        System.out.println("sisa uang adalah "+nominal1.getKembalian());

       
    }
}
