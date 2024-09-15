// Impor kelas dari JAR
import com.polban.jtk.sales.Product;
import com.polban.jtk.sales.Sales;

public class MainProgram {
    public static void main(String[] args) {
        // Membuat objek produk
        Product product1 = new Product("Laptop", 15000000.0, 10);

        // Membuat objek sales untuk mengelola produk
        Sales sales1 = new Sales(product1);

        // Menampilkan informasi awal produk
        System.out.println("Nama Produk: " + product1.getProductName());
        System.out.println("Harga Produk: " + product1.getPrice());
        System.out.println("Stok Produk: " + product1.getStock());

        // Melakukan penjualan 3 unit
        sales1.sellProduct(3);

        // Menambahkan stok sebanyak 5 unit
        sales1.restockProduct(5);

        // Memperbarui harga produk
        sales1.updateProductPrice(14000000.0);

        // Melakukan penjualan yang gagal karena stok tidak cukup
        sales1.sellProduct(12);
    }
}
