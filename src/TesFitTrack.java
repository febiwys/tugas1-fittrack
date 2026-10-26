/**
 * Menguji fitur sistem keanggotaan gym FitTrack.
 */
public class TesFitTrack {

    /**
     * Menjalankan pengujian data member.
     *
     * @param args argumen program
     */
    public static void main(String[] args) {

        // Membuat tiga objek member dengan paket berbeda
        Member member1 = new Member(
            "Alya Putri", "081234567890", "01-10-2026", "Basic"
        );

        Member member2 = new Member(
            "Nadia Safitri", "082345678901", "02-10-2026", "Premium"
        );

        Member member3 = new Member(
            "Zahra Aulia", "083456789012", "03-10-2026", "VIP"
        );

        // Menggunakan constructor tanpa paket
        Member member4 = new Member(
            "Dina Rahma", "084567890123", "04-10-2026"
        );

        // Menguji constructor dengan data tidak valid
        System.out.println("\n=== UJI CONSTRUCTOR ===");

        Member member5 = new Member(
            "", "12345", "", "Gold"
        );

        System.out.println("Hasil constructor dengan data tidak valid:");
        System.out.println(member5);

        // Menyimpan seluruh objek dalam array
        Member[] daftarMember = {
            member1, member2, member3, member4, member5
        };

        // Menguji penolakan nomor telepon yang mengandung huruf
        System.out.println("\n=== UJI VALIDASI TELEPON ===");

        String teleponValid = member1.getNoTelepon();
        member1.setNoTelepon("08123ABC789");

        System.out.println("Nomor sebelum: " + teleponValid);
        System.out.println(
            "Nomor sesudah: " + member1.getNoTelepon()
        );

        if (teleponValid.equals(member1.getNoTelepon())) {
            System.out.println(
                "BERHASIL: nomor yang mengandung huruf ditolak."
            );
        } else {
            System.out.println("GAGAL: nomor telepon berubah.");
        }

        // Menguji nomor telepon yang terlalu pendek
        String teleponSebelum = member1.getNoTelepon();
        member1.setNoTelepon("12345");

        System.out.println("\nNomor sebelum: " + teleponSebelum);
        System.out.println(
            "Nomor sesudah: " + member1.getNoTelepon()
        );

        if (teleponSebelum.equals(member1.getNoTelepon())) {
            System.out.println(
                "BERHASIL: nomor lama tetap dipertahankan."
            );
        } else {
            System.out.println("GAGAL: nomor telepon berubah.");
        }

        // Menguji penolakan nama kosong
        System.out.println("\n=== UJI VALIDASI NAMA ===");

        String namaSebelum = member2.getNama();
        member2.setNama("   ");

        System.out.println("Nama sebelum: " + namaSebelum);
        System.out.println(
            "Nama sesudah: " + member2.getNama()
        );

        if (namaSebelum.equals(member2.getNama())) {
            System.out.println(
                "BERHASIL: nama lama tetap dipertahankan."
            );
        } else {
            System.out.println("GAGAL: nama berubah.");
        }

        // Menguji penolakan tanggal kosong
        System.out.println("\n=== UJI VALIDASI TANGGAL ===");

        String tanggalSebelum = member3.getTanggalDaftar();
        member3.setTanggalDaftar("");

        System.out.println("Tanggal sebelum: " + tanggalSebelum);
        System.out.println(
            "Tanggal sesudah: " + member3.getTanggalDaftar()
        );

        if (tanggalSebelum.equals(member3.getTanggalDaftar())) {
            System.out.println(
                "BERHASIL: tanggal lama tetap dipertahankan."
            );
        } else {
            System.out.println("GAGAL: tanggal berubah.");
        }

        // Menguji penolakan paket yang tidak valid
        System.out.println("\n=== UJI VALIDASI PAKET ===");

        String paketSebelum = member4.getJenisPaket();
        member4.setJenisPaket("Gold");

        System.out.println("Paket sebelum: " + paketSebelum);
        System.out.println(
            "Paket sesudah: " + member4.getJenisPaket()
        );

        if (paketSebelum.equals(member4.getJenisPaket())) {
            System.out.println(
                "BERHASIL: paket tidak valid ditolak."
            );
        } else {
            System.out.println("GAGAL: paket berubah.");
        }

        // Menguji paket dengan huruf kecil
        String paketSebelumKedua = member4.getJenisPaket();
        member4.setJenisPaket("premium");

        System.out.println("\nPaket sebelum: " + paketSebelumKedua);
        System.out.println(
            "Paket sesudah: " + member4.getJenisPaket()
        );

        if (paketSebelumKedua.equals(member4.getJenisPaket())) {
            System.out.println(
                "BERHASIL: format paket yang tidak sesuai ditolak."
            );
        } else {
            System.out.println("GAGAL: paket berubah.");
        }

        // Mencetak seluruh member dengan perulangan for
        System.out.println("\n=== DAFTAR MEMBER FITTRACK ===");

        for (int i = 0; i < daftarMember.length; i++) {
            System.out.println(daftarMember[i]);
        }
    }
}