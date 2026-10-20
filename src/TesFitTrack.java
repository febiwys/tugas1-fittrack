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
        System.out.println("=== UJI VALIDASI ===");
        member1.setNoTelepon("12345");

        // Memastikan nomor lama tetap dipertahankan
        System.out.println(
            "Nomor member1 setelah pengujian: "
            + member1.getNoTelepon()
        );

        // Menguji penolakan nama kosong
        member2.setNama("   ");

        //Menguji penolakan tanggal kosong
        System.out.println("\n=== UJI VALIDASI TANGGAL ===");
        member3.setTanggalDaftar("");
        //Memastikan tanggal lama tetap dipertahankan
        System.out.println(
            "Tanggal member3 setelah pengujian: "
            + member3.getTanggalDaftar()
        );

        //Menguji penolakan paket yang tidak valid
        System.out.println("\n=== UJI VALIDASI PAKET ===");
        member4.setJenisPaket("Gold");

        //Memastikan paket lama tetap dipertahankan
        System.out.println(
            "Paket member4 setelah pengujian: "
            + member4.getJenisPaket()
        );

        // Mencetak seluruh member dengan perulangan for
        System.out.println("\n=== DAFTAR MEMBER FITTRACK ===");

        for (int i = 0; i < daftarMember.length; i++) {
            System.out.println(daftarMember[i]);
        }
    }
}