package queue;
public class Antrian {

    Pembeli terdepan;

    // push
    // bahasa inggrisnya : enqueue
    public void tambahPengantri(Pembeli p){
        if (terdepan == null) {
            terdepan = p;
        } else {
            Pembeli current = terdepan;
            while (current.terbelakangnya != null) {
                current = current.terbelakangnya;
            }
            current.terbelakangnya = p;
        }
        p.terbelakangnya = null;
    }

    public void lihatIsiAntrian(){
        if(terdepan == null){
            System.out.println("Antrian kosong");
            return;
        }

        Pembeli sekarang = terdepan;
        System.out.println("Pembeli : "+sekarang.nama);

        while(sekarang.terbelakangnya != null) {
            sekarang = sekarang.terbelakangnya;
            System.out.println("Pembeli : "+sekarang.nama);
        }
    }

    // pop
    public Pembeli layani(){
        Pembeli depan = terdepan;
        terdepan = depan.terbelakangnya;
        return depan;
    }

    // peek
    public Pembeli terdepan(){
        return terdepan;
    }

    // isEmpty
    public Boolean habiskah(){
        return terdepan == null;
    }
}