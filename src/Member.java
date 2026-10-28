/**
 * Merepresentasikan data seorang member gym FitTrack.
 * Class ini menyimpan data dan memvalidasi setiap perubahan.
 */
public class Member {

    private static final int MIN_PANJANG_TELEPON = 10;
    private static final String PAKET_DEFAULT = "Basic";
    private static final String NAMA_DEFAULT = "Belum diisi";
    private static final String TELEPON_DEFAULT = "Belum diisi";
    private static final String TANGGAL_DEFAULT = "Belum diisi";

    private String nama;
    private String noTelepon;
    private String tanggalDaftar;
    private String jenisPaket;

    /**
     * Membuat member dengan empat data.
     *
     * @param nama nama member
     * @param noTelepon nomor telepon member
     * @param tanggalDaftar tanggal pendaftaran
     * @param jenisPaket paket keanggotaan
     */
    public Member(String nama, String noTelepon,
                  String tanggalDaftar, String jenisPaket) {
        this.nama = NAMA_DEFAULT;
        this.noTelepon = TELEPON_DEFAULT;
        this.tanggalDaftar = TANGGAL_DEFAULT;
        this.jenisPaket = PAKET_DEFAULT;

        setNama(nama);
        setNoTelepon(noTelepon);
        setTanggalDaftar(tanggalDaftar);
        setJenisPaket(jenisPaket);
    }

    /**
     * Membuat member dengan paket Basic.
     *
     * @param nama nama member
     * @param noTelepon nomor telepon member
     * @param tanggalDaftar tanggal pendaftaran
     */
    public Member(String nama, String noTelepon, String tanggalDaftar) {
        this(nama, noTelepon, tanggalDaftar, PAKET_DEFAULT);
    }

    /**
     * Mengambil nama member.
     * @return nama member
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengatur nama jika tidak kosong.
     * @param nama nama baru
     */
    public void setNama(String nama) {
        if (nama != null && !nama.trim().isEmpty()) {
            this.nama = nama.trim();
        } else {
            System.out.println("Nama tidak boleh kosong!");
        }
    }

    /**
     * Mengambil nomor telepon.
     * @return nomor telepon member
     */
    public String getNoTelepon() {
        return noTelepon;
    }

    /**
     * Mengatur nomor telepon jika valid.
     * @param noTelepon nomor telepon baru
     */
    public void setNoTelepon(String noTelepon) {
        if (noTelepon != null
                && noTelepon.startsWith("0")
                && noTelepon.length() >= MIN_PANJANG_TELEPON
                && noTelepon.matches("[0-9]+")) {
            this.noTelepon = noTelepon;
        } else {
            System.out.println(
                "Nomor telepon harus diawali angka 0 dan minimal "
                + MIN_PANJANG_TELEPON + " digit angka."
            );
        }
    }

    /**
     * Mengambil tanggal pendaftaran.
     * @return tanggal pendaftaran
     */
    public String getTanggalDaftar() {
        return tanggalDaftar;
    }

    /**
     * Mengatur tanggal pendaftaran jika tidak kosong.
     * @param tanggalDaftar tanggal pendaftaran baru
     */
    public void setTanggalDaftar(String tanggalDaftar) {
        if (tanggalDaftar != null && !tanggalDaftar.trim().isEmpty()) {
            this.tanggalDaftar = tanggalDaftar.trim();
        } else {
            System.out.println("Tanggal daftar tidak boleh kosong!");
        }
    }

    /**
     * Mengambil jenis paket.
     * @return jenis paket member
     */
    public String getJenisPaket() {
        return jenisPaket;
    }

    /**
     * Mengatur paket jika sesuai pilihan.
     * @param jenisPaket paket baru
     */
    public void setJenisPaket(String jenisPaket) {
        if ("Basic".equals(jenisPaket)
                || "Premium".equals(jenisPaket)
                || "VIP".equals(jenisPaket)) {
            this.jenisPaket = jenisPaket;
        } else {
            System.out.println(
                "Jenis paket tidak valid. Pilih Basic, Premium, atau VIP."
            );
        }
    }

    /**
     * Menampilkan seluruh data member dalam bentuk teks.
     * @return data member dengan label yang jelas
     */
    @Override
    public String toString() {
        return "Nama: " + nama
                + ", Nomor Telepon: " + noTelepon
                + ", Tanggal Daftar: " + tanggalDaftar
                + ", Jenis Paket: " + jenisPaket;
    }

    /**
 * Memeriksa apakah data member sudah terisi lengkap.
 *
 * @return true jika seluruh data member terisi
 */
public boolean isDataLengkap() {
    return nama != null && !nama.trim().isEmpty()
        && noTelepon != null && !noTelepon.trim().isEmpty()
        && tanggalDaftar != null && !tanggalDaftar.trim().isEmpty()
        && jenisPaket != null && !jenisPaket.trim().isEmpty();
  }

  /**
 * Mengambil biaya berdasarkan jenis paket member.
 *
 * @return biaya paket dalam rupiah
 */
public int getBiayaPaket() {
    if ("Basic".equals(jenisPaket)) {
        return 100000;
    } else if ("Premium".equals(jenisPaket)) {
        return 200000;
    } else if ("VIP".equals(jenisPaket)) {
        return 300000;
    } else {
        return 0;
    }
}
}