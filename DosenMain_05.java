public class DosenMain_05 {
    public static void main(String[] args) {
        Dosen_05 dosen1 = new Dosen_05("254107060136", "Alvido Ariesta", 2035, "S2", "Teknik Mesin");

        System.out.println("Informasi Dosen 1:");
        dosen1.tampilkanInfo();
        System.out.println();

        System.out.println("Melakukan perubahan pada Dosen 1...");
        dosen1.ubahProdi("Sistem Informasi Bisnis");
        dosen1.ubahPendidikan("S3");

        System.out.println("\nInformasi Dosen 1 setelah perubahan:");
        dosen1.tampilkanInfo();
    }
    
}