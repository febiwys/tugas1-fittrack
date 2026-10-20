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

Pengujian

Program menguji pembuatan member, penggunaan constructor default Basic, validasi input, serta penolakan data tidak valid.

Author

Nama: Zahra Febi Maharani
NPM: 250810701100006