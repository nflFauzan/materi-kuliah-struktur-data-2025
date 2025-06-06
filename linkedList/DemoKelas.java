public class DemoKelas {
    public static void main(String[] args) {
        Siswa zann = new Siswa("Naufal");

        Kelas k = new Kelas(zann);

        Siswa siti = new Siswa("Siti");
        k.tambahDiBelakang(siti);
        k.tambahDiBelakang(new Siswa("Tahtia"));
        k.tambahDiBelakang(new Siswa("Ainun"));
        k.tambahDiBelakang(new Siswa("Zahra"));
        System.out.println("List siswa awal");
        k.tampilkanSemua();

      k.tambahDiDepan(new Siswa("Muhamad"));
        System.out.println("=========================");
        System.out.println("List siswa setelah ditambah di depan");
        k.tampilkanSemua();

        Integer urutan = 7;
        Siswa x = k.ambilDi(urutan);
        if(x != null) {
            System.out.println("Siswa urutan "+ urutan +" : "+x.nama);
        } else {
            System.out.println("Siswa urutan "+urutan+" tidak ada");
        }


        System.out.println("===================");
        System.out.println("Jumlah siswa : "+k.jumlahSiswa());

        Kelas k1 = new Kelas(null);
        System.out.println("Jumlah siswa : "+k1.jumlahSiswa());

        System.out.println("=========================");
        System.out.println("Cari nama Ojan di kelas kosong : " +k1.urutan("Ojan"));
        System.out.println("Cari nama Ojan di kelas berisi : " +k.urutan("Ojan"));
        System.out.println("Cari nama Siti di kelas berisi : " +k.urutan("Siti"));
        System.out.println("Cari nama Muhamad di kelas berisi : " +k.urutan("Muhamad"));
        System.out.println("Cari nama Zahra di kelas berisi : " +k.urutan("Zahra"));

        System.out.println("=========================");
        System.out.println("tambah siswa Fauzan setelah Naufal");
        k.tambahSetelah("Naufal", new Siswa("Fauzan"));
        k.tampilkanSemua();
        System.out.println("Jumlah siswa : "+k.jumlahSiswa());

        System.out.println("=========================");
        k1.hapus("Nopal");
        k1 = new Kelas(new Siswa("Nopal"));
        System.out.println("Setelah di-add");
        k1.tampilkanSemua();

        k1.hapus("Nopal");
        System.out.println("Setelah dihapus");
        k1.tampilkanSemua();

        System.out.println("========== Sebelum dihapus ===============");
        k.tampilkanSemua();
        k.hapus("Muhamad");
        System.out.println("========== Setelah hapus pertama ===============");
        k.tampilkanSemua();
        k.hapus("Siti");
        System.out.println("========== Setelah hapus tengah ===============");
        k.tampilkanSemua();
        k.hapus("Zahra");
        System.out.println("========== Setelah hapus akhir ===============");
        k.tampilkanSemua();
    }

}
// test