package model;

public interface crud{
    void tambahProduk(Produk produk);
    void hapusProduk(String namaProduk);
    void tampilkanProduk();
    void perbaruiProduk(String namaProduk, double hargaBaru, int stokBaru);
}