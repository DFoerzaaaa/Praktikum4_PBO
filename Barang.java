package com.polban.jtk.inventory;

public class Barang {
    private String kode_barang;
    private String nama_barang;
    private int stok;

    // Constructor
    public Barang(String kode, String nama, int stk) {
        this.kode_barang = kode;
        this.nama_barang = nama;
        this.stok = stk;
    }

    // Getter for nama_barang
    public String getNamaBarang() {
        return nama_barang;
    }

    // Getter for stok
    public int getStok() {
        return stok;
    }

    // Method to add stock
    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            this.stok += jumlah;
        } else {
            System.out.println("Penambahan stok harus positif.");
        }
    }

    // Prevent other arithmetic manipulations (no subtract, multiply, etc.)
}
