public class Dosen_05 {
    String nidn;
    String nama;
    int tahunMasuk;
    String jenjangPendidikan;
    String prodi;

    public Dosen_05(String nidn, String nama, int tahunMasuk, String jenjangPendidikan, String prodi) {
        this.nidn = nidn;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.jenjangPendidikan = jenjangPendidikan;
        this.prodi = prodi;
    }

    void tampilkanInfo() {
        System.out.println("NIDN  : " + nidn);
        System.out.println("Nama  : " + nama);
        System.out.println("Tahun Masuk : " + tahunMasuk);
        System.out.println("Jenjang Pendidikan : " + jenjangPendidikan);
        System.out.println("Prodi : " + prodi);
    }

    void ubahProdi(String prodiBaru) {
        this.prodi = prodiBaru;
        System.out.println("Prodi berhasil diubah menjadi: " + prodi);
    }

    void ubahPendidikan(String jenjangBaru) {
        this.jenjangPendidikan = jenjangBaru;
        System.out.println("Jenjang pendidikan berhasil diubah menjadi: " + jenjangPendidikan);
    }
}