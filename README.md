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

Author

Nama: Zahra Febi Maharani
NPM: 250810701100006