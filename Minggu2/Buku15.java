public class Buku15 {
        String judul, pengarang;
        int harga, stok, halaman;

        void tampilinformasi(){
            System.out.println("Judul: "+ judul);
            System.out.println("pengaran: "+ pengarang);
            System.out.println("Jumlah Halaman: "+ halaman);
            System.out.println("Sisa Stok: "+ stok);
            System.out.println("Harga: "+ harga);
        }

        void terjual(int jml){
            if (stok > 0) {
            stok -= jml;
            }
        }
        void restock(int jml){
            stok += jml;
        }
        void gantiharga(int hrg){
            harga = hrg;
        }
    }