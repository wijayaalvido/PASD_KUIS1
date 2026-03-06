public class MataKuliah_05 {
    String kodeMK;
    String namaMK;
    int sks;
    Dosen_05[] dosenPengampu;

    public MataKuliah_05(String kodeMK, String namaMK, int sks, Dosen_05[] dosenPengampu) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
        this.dosenPengampu = dosenPengampu;
    }

    void tampilkanInfo() {
        System.out.println("Kode Mata Kuliah : " + kodeMK);
        System.out.println("Nama Mata Kuliah : " + namaMK);
        System.out.println("SKS : " + sks);
        System.out.println("Dosen Pengampu:");
        for (Dosen_05 dosen : dosenPengampu) {
            System.out.println("- " + dosen.nama);
        }
    }

    void ubahNamaMK(String namaBaru) {
        this.namaMK = namaBaru;
        System.out.println("Nama mata kuliah berhasil diubah menjadi : " + namaMK);
    }

    void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS mata kuliah berhasil diubah menjadi  : " + sks);
    }

    void tambahDosen(Dosen_05 dosenBaru) {
        Dosen_05[] dosenBaruArray = new Dosen_05[dosenPengampu.length + 1];
        System.arraycopy(dosenPengampu, 0, dosenBaruArray, 0, dosenPengampu.length);
        dosenBaruArray[dosenPengampu.length] = dosenBaru;
        this.dosenPengampu = dosenBaruArray;
        System.out.println("Dosen " + dosenBaru.nama + " berhasil ditambahkan sebagai pengampu.");
    }
    
}