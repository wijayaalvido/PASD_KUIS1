public class MataKuliahMain_05 {
    public static void main(String[] args) {
        Dosen_05 dosen1 = new Dosen_05("20260306", "Bu Triana", 2007, "S2", "Teknik Informatika");

        Dosen_05[] dosenPengampu = {dosen1};
        MataKuliah_05 mataKuliah = new MataKuliah_05("ASD", "Algoritma dan Struktur Data", 2, dosenPengampu);

        System.out.println("Informasi Mata Kuliah:");
        mataKuliah.tampilkanInfo();
        System.out.println();

        System.out.println("Melakukan perubahan pada Mata Kuliah...");
        mataKuliah.ubahNamaMK("Praktikum Algoritma dan Struktur Data");
        mataKuliah.ubahSKS(3);

        System.out.println("\nMenambahkan dosen baru sebagai pengampu...");
        Dosen_05 dosen2 = new Dosen_05("254107060136", "Alvido Ariesta", 2035, "S2", "Sistem Informasi Bisnis");
        mataKuliah.tambahDosen(dosen2);

        System.out.println("\nInformasi Mata Kuliah setelah perubahan:");
        mataKuliah.tampilkanInfo();
    }
}