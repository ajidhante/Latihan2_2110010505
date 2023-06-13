package universitas;

public class Mahasiswa {
    
    String npm,nama,prodi;

    //setter
    public void setNpm(String npm) {
        this.npm = npm;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
    
    //getter
    public String getNpm() {
        return npm;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }
    
    
}
