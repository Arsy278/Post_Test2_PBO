package model;

public class Produk extends barang{

    public Produk(String nama, double harga, int stok) {
        super(nama, harga, stok);
    }

    public String ambilNama() {
        return nama;
    }

    public double ambilHarga() {
        return harga;
    }

    public int ambilStok() {
        return stok;
    }

    public void aturNama(String nama) {
        this.nama = nama;
    }

    public void aturHarga(double harga) {
        this.harga = harga;
    }

    public void aturStok(int stok) {
        this.stok = stok;
    }
    
    @Override
    public void tampilkanProduk() {
        System.out.println("Nama Barang: " + nama);
        System.out.println("Harga (Per Pack): " + "Rp " + harga);
        System.out.println("Stok: " + stok);
    }
//    Subclass dari produk, yaitu makanan ringan :
    public class makananRingan extends Produk{
        public makananRingan(String nama, double harga, int stok) {
            super(nama, harga, stok);
        }
//  override
    @Override
    public void tampilkanProduk(){
            System.out.println("Daftar Makanan Ringan: ");
            super.tampilkanProduk();
        }
    }
//    Subclass dari produk, yaitu minuman :
    public class minuman extends Produk{
        public minuman(String nama, double harga, int stok) {
            super(nama, harga, stok);
        }
        @Override
        public void tampilkanProduk(){
            System.out.println("Daftar Minuman: ");
            super.tampilkanProduk();
        }
    }
}

