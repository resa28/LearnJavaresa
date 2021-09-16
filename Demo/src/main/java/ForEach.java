public class ForEach {
    public static void main (String)[] args) {
        // Membuat array
        int angka [] = {3, 1, 42, 24,12};

        // Menggunakan perulangan for each untuk menampilkan angka
        for (int x : angka) {
            System.out.println(x + " ");
        }


        List<String> daftarNama = Arrays.aslist("Resa", "Adrianto", "Oim", "Omel", "Faris");

        daftarNama.forEach(nama => {
            System.out.printf("Halo %s%n", nama);
        });

        daftarNama.forEach(Sytem.out::println);
    }
}
