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

        // Membuat empat objek member
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
        // Menguji construktor dengan data tidak valid
        System.out.println("\n=== UJI CONSTRUCTOR ===");

        Member member5 = new Member(
            "", "12345", "", "Gold"
        );

        // Menyimpan seluruh objek dalam array
        Member[] daftarMember = {
            member1, member2, member3, member4, member5
        };

        // Menguji penolakan nomor telepon yang tidak valid
        System.out.println("=== UJI VALIDASI TELEPON ===");

        String teleponSebelum = member1.getNoTelepon();
        member1.setNoTelepon("12345");

        System.out.println(
            "Nomor sebelum pengujian : " + teleponSebelum
        );
        System.out.println(
            "Nomor setelah pengujian: " +
            member1.getNoTelepon()
        );
        
        if (teleponSebelum.equals(member1.getNoTelepon())) {
            System.out.println("BERHASIL: nomor lama tetap dipertahankan.");
        } else {
            System.out.println("GAGAL: nomor telepon berubah.");
        }

        // Memastikan nomor lama tetap dipertahankan
        System.out.println(
            "Nomor member1 setelah pengujian: "
            + member1.getNoTelepon()
        );

        // Menguji penolakan nama kosong
        member2.setNama("   ");

        //Menguji penolakan tanggal kosong
        System.out.println("\n=== UJI VALIDASI TANGGAL ===");

        String tanggalSebelum = member3.getTanggalDaftar();
        member3.setTanggalDaftar("");

        System.out.println(
            "Tanggal setelah pengujian: "
            + member3.getTanggalDaftar()
        );

        if (tanggalSebelum.equals(member3.getTanggalDaftar())) {
            System.out.println(
                "BERHASIL: tanggal lama tetap dipertahankan."
            );    
        } else {
            System.out.println("GAGAL: tanggal berubah.");
        }

        //Menguji penolakan paket tidak valid
        System.out.println("\n=== UJI VALIDASI PAKET ===");
        String paketSebelum = member4.getJenisPaket();
        member4.setJenisPaket("Gold");

        System.out.println(
            "Paket setelah pengujian: " + member4.getJenisPaket()
        );

        if (paketSebelum.equals(member4.getJenisPaket())) {
            System.out.println(
                "BERHASIL: paket lama tetap dipertahankan."
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