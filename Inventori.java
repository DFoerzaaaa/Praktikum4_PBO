package com.polban.jtk.inventory;

public class Inventori {
    Barang[] barangs;

    // Method to initialize barang
    void initBarang() {
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new com.polban.jtk.inventory.Barang("002", "Celana", 20);
    }

    // Method to show barang details
    void showBarang() {
        System.out.println(barangs[0].getNamaBarang() + "(" +
                barangs[0].getStok() + ")");
        System.out.println(barangs[1].getNamaBarang() + "(" +
                barangs[1].getStok() + ")");
    }

    // Method for stock procurement
    void pengadaan() {
        initBarang();
        barangs[0].tambahStok(20); // Only allows addition
        // Uncommenting the following would not be possible anymore:
        // barangs[0].stok -= 30; // Not allowed
        // barangs[0].stok *= 30; // Not allowed

        showBarang();
    }

    // Main method
    public static void main(String[] args) {
        Inventori beli = new Inventori();
        beli.pengadaan();
    }
}
