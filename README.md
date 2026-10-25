# tugas1-fittrack
Sistem Keanggotaan Gym Fitrack-Tugas 1 Praktikum PBO
FitTrack Gym Membership

Deskripsi

FitTrack merupakan program Java sederhana untuk mengelola data keanggotaan gym. Program ini menyimpan nama member, nomor telepon, tanggal pendaftaran, dan jenis paket keanggotaan.

Fitur

- Menyimpan data member menggunakan class "Member".
- Memvalidasi nama, nomor telepon, tanggal pendaftaran, dan jenis paket.
- Menyediakan constructor dengan empat parameter dan constructor dengan tiga parameter yang menggunakan paket Basic secara default.
- Menampilkan data member melalui method "toString()".
- Menguji data valid dan tidak valid melalui class "TesFitTrack".

Struktur Proyek

tugas1-fittrack/
├── src/
│   ├── Member.java
│   └── TesFitTrack.java
├── .gitignore
└── README.md

Persyaratan

- Java Development Kit (JDK) terpasang.
- Terminal atau editor Java, misalnya Visual Studio Code.

Cara Menjalankan

Buka terminal di folder utama proyek, kemudian jalankan:

javac -d out src/Member.java src/TesFitTrack.java
java -cp out TesFitTrack

Pengujian:
pembuatan member dengan constructor empat parameter
penggunaan constructor tiga parameter dengan paket Basic secara cdefault
penolakan nama, nomor telepon, tanggal pendaftaran, dan jenis paket yang tidak valid.
pemertahanan nilai sebelumnya ketika setter menerima data tidak valid
penampilan seluruh data member menggunakan perulangan for
program dapat dikompilasi dan dijalankan menggunakan perintah pada bagian Cara Menjalankan
Program menguji pembuatan member, penggunaan constructor default Basic, validasi input, serta penolakan data tidak valid.

Structur Kode:
Member.java: Mneyimpan data member, menyediakan constructor, getter, setter, validasi, dan reresentasi data melalui toString().
TesFitTrack.java: Menjalankan pengujian constructor, validasi data, serta menampilkan daftar member.
.gitignore: Mengecualikan file hasil kompilasi dan folder build dari Git.

Aturan Validasi:
Nama member tidak boleh kosong atau hanya berisi spasi
Nomor telepon harus diawali angka 0, memiliki minimal 10 digit, dan hanya berisi angka
Tanggal pendaftaran tidak boleh kosong
Jenis paket hanya menerima Basic, Premium, atau VIP
Jika data tidak valid, nilai sebelumnya tetap dipertahankan dan pesan penolakan ditampilkan.

Skenario Pengujian:
1. Membuat member dengan data valid untuk memastikan data tersimpan dengan benar.
2. Mmebuat member dengan data tidak valid untuk memastikan nilai default tetap dipertahankan.
3. Mengubah nomor telepon dengan format tidak valid untuk memastikan nomor lama tidak berubah
4. Mengubah tanggal pendaftaran menjadi ksoong untuk memastikan tanggal lama tetaap dipertahankan
5. Mengubah jenis paket menjadi Gold untuk memastikan paket lama tetap dipertahankan
6. Menggunakan constructor tiga parameter untuk memastikan paket Basic digunakan secara default

Programk diuji menggunakan beberapa kondisi berikut:
1. Mmebuat member dengan data valid
2. Membuat member menggunakan constructor dengan tiga parameter
3. Menguji penolakan nama kosong atau hanya berisi spasi
4. Menguji penolakan nomor telepon yang tidak valid
5. Menguji penolakan tanggal daftar kosong
6. Menguji penolakan jenis paket yang tidak tersedia
7. Memastikan data sebelumnya tetap tersimpannketika perubahan data ditolak
8. Menanpilkan seluruh data member setekah pengujian


Alur Menjalankan Program:
1. Buka folder proyek FitTrack di Visual Studio code
2. Buka terminal pada folder utama proyek
3. Kompilasi kedua file Java dengan perintah:
kavac -d out src/Mmeber.java src/TesFitTrack.java
4. Jlanakan program dengaan perintah:
java -cp out TesFitTrack
5. Periksa pesan validasi dan daftar member yang ditampilkan pada terminal

Batasan Program:
Program dijalankan melalui terminal damn belum menggunakan antarmuka grafis
Data member disimpan selama program berjalan dan belum menggunakan database
Validasi nomor tete;pn memeriksa awalan angka 0, panjang minimal 10 digit, dan karakter angka.
Validasi tanggal hanya memastikan data tidak kosong, belum memeriksa format tanggal secara khusus.

Author

Nama: Zahra Febi Maharani
NPM: 250810701100006