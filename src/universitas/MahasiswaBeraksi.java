package universitas;

public class MahasiswaBeraksi {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();
        
        mahasiswa1.npm = "2110010505";
        mahasiswa1.nama = "Fadli";
        mahasiswa1.prodi = "TI";
        
        System.out.println("Constructor");
        System.out.println("NPM : "+mahasiswa1.npm);
        System.out.println("Nama : "+mahasiswa1.nama);
        System.out.println("Prodi : "+mahasiswa1.prodi);

        
    }
}
