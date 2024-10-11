package model;

import java.util.ArrayList;
import model.Produk.makananRingan;
import model.Produk.minuman;

public final class Gudang implements crud {
    private final ArrayList<Produk> daftarProduk;

    public Gudang() {
        daftarProduk = new ArrayList<>();
        var produkInstance = new Produk("", 0, 0);
        daftarProduk.add(produkInstance.new makananRingan("Jelly Piala Mini (Per-Pack)", 55_000, 348));
        daftarProduk.add(produkInstance.new makananRingan("Caramell Ball (Per-Pack)", 115_000, 263));
        daftarProduk.add(produkInstance.new minuman("Happy Es teller (Per-Pack)", 10500, 238));
    }

    @Override
    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }

    @Override
    public void hapusProduk(String namaProduk) {
        daftarProduk.removeIf(produk -> produk.ambilNama().equalsIgnoreCase(namaProduk));
    }

    @Override
    public void tampilkanProduk() {
        if (daftarProduk.isEmpty()) {
            System.out.println("Gudang kosong.");
        } else {
            System.out.println("Daftar Produk di Gudang:");
            for (Produk produk : daftarProduk) {
                produk.tampilkanProduk();
                System.out.println("-------------------");
            }
        }
    }

    @Override
    public void perbaruiProduk(String namaProduk, double hargaBaru, int stokBaru) {
        for (Produk produk : daftarProduk) {
            if (produk.ambilNama().equalsIgnoreCase(namaProduk)) {
                produk.aturHarga(hargaBaru);
                produk.aturStok(stokBaru);
                System.out.println("Produk berhasil diupdate.");
                return;
            }
        }
        System.out.println("Produk tidak ditemukan.");
    }
}