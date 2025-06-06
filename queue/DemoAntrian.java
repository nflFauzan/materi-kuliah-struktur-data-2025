package queue;

public class DemoAntrian {

    public static void main(String[] args) {
        Antrian a = new Antrian();

        // belum diisi
        System.out.println("gada yang antri kan ? " + a.habiskah());//kalo belum ada yg antri hasilnya true,kalo sudah ada yg antri hasilnya false

        Pembeli siti = new Pembeli("Siti");
        Pembeli tahtia = new Pembeli("Tahtia");
        Pembeli ainun = new Pembeli("Ainun");
        Pembeli zahra = new Pembeli("Zahra");

        a.tambahPengantri(siti);
        a.tambahPengantri(tahtia);
        a.tambahPengantri(ainun);
        a.tambahPengantri(zahra);

        a.lihatIsiAntrian();

        System.out.println("gada yang antri kan ? " + a.habiskah());//kalo belum ada yg antri hasilnya true,kalo sudah ada yg antri hasilnya false

        System.out.println("Lihat terdepan : " + a.terdepan().nama);

        while (!a.habiskah()) {
            System.out.println("Layanan untuk : " + a.layani().nama);
        }

        System.out.println("Semua Pembeli telah dilayani.");
    }
}