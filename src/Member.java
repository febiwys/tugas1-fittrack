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
    private boolean sudahBayar;

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
        this.sudahBayar = false;

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

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        if (nama != null && !nama.trim().isEmpty()) {
            this.nama = nama.trim();
        } else {
            System.out.println("Nama tidak boleh kosong!");
        }
    }

    public String getNoTelepon() {
        return noTelepon;
    }

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

    public String getTanggalDaftar() {
        return tanggalDaftar;
    }

    public void setTanggalDaftar(String tanggalDaftar) {
        if (tanggalDaftar != null && !tanggalDaftar.trim().isEmpty()) {
            this.tanggalDaftar = tanggalDaftar.trim();
        } else {
            System.out.println("Tanggal daftar tidak boleh kosong!");
        }
    }

    public String getJenisPaket() {
        return jenisPaket;
    }

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

    /**
     * Memeriksa status pembayaran member.
     *
     * @return true jika sudah membayar
     */
    public boolean isSudahBayar() {
        return sudahBayar;
    }

    /**
     * Mengatur status pembayaran member.
     *
     * @param sudahBayar true jika sudah membayar
     */
    public void setSudahBayar(boolean sudahBayar) {
        this.sudahBayar = sudahBayar;
    }

    /**
     * Menampilkan seluruh data member dalam bentuk teks.
     *
     * @return data member
     */
    @Override
    public String toString() {
        return "Nama: " + nama
                + ", Nomor Telepon: " + noTelepon
                + ", Tanggal Daftar: " + tanggalDaftar
                + ", Jenis Paket: " + jenisPaket
                + ", Status Pembayaran: "
                + (sudahBayar ? "LUNAS" : "BELUM LUNAS");
    }
}