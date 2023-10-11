package pbopraktikum;

public class DemoNilai {

    public static void main(String[] args) {
        Nilai nilaiAkhir = new Nilai();
        
        nilaiAkhir.nim = "2210631170022";
        nilaiAkhir.nama = "Ghaida Putri Yunisa";
        nilaiAkhir.absen = 100;
        nilaiAkhir.tugas = 95;
        nilaiAkhir.uts = 80;
        nilaiAkhir.uas = 90;
        
        nilaiAkhir.CetakNilai();
    }

}
