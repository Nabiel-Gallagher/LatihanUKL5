# Program Menghitung Nilai Siswa

Program untuk menginput dan menampilkan nilai beberapa siswa dalam beberapa mata pelajaran,
lalu menghitung rata-rata nilai masing-masing siswa.

---

## 💡 Fitur
- Input jumlah siswa & mapel menggunakan User Input
- Array 2 dimensi `double[][]`
  - Menyimpan nilai tiap siswa dan tiap mata pelajaran
- Perulangan bersarang
  - Memproses input dan output untuk setiap siswa dan setiap mapel
- Menampilkan tabel nilai semua siswa
- Menghitung rata-rata per siswa
  - Menggunakan perulangan dan operasi aritmetika sederhana

---

## 🧮 Alur Logika Program

```bash
Mulai
↓
Input jumlah siswa
↓
Input jumlah mata pelajaran
↓
Buat array nilaiSiswa[jumlahSiswa][jumlahMapel]
↓
Untuk setiap siswa:
    Untuk setiap mapel:
        Input nilai
↓
Tampilkan semua nilai siswa
↓
Hitung dan tampilkan rata-rata tiap siswa
↓
Selesai
```
---

## 🖥️ Contoh Output 

```bash
==============================
    Menghitung Nilai Siswa    
==============================
Masukkan Jumlah Siswa: 2
Masukkan Jumlah Mata Pelajaran: 3

Siswa ke-1:
Masukkan nilai mapel ke-1: 80
Masukkan nilai mapel ke-2: 75
Masukkan nilai mapel ke-3: 90

Siswa ke-2:
Masukkan nilai mapel ke-1: 70
Masukkan nilai mapel ke-2: 85
Masukkan nilai mapel ke-3: 65

==============================
     Data Nilai Semua Siswa   
==============================
Siswa ke-1: 80.0 75.0 90.0 
Siswa ke-2: 70.0 85.0 65.0 

==============================
     Rata-rata Nilai Siswa    
==============================
Rata-rata siswa ke-1: 81.66666666666667
Rata-rata siswa ke-2: 73.33333333333333
```
---

## 🏷️ Informasi Tambahan

📁 **Nama File:** `SulitSoal1.java`

🧑‍🎓 **Dibuat oleh:** Deniza Nabiel Akbar Al Fatih

🏫 **Kelas / Absen:** X RPL 5 / 13

💼 **Tugas:** Soal 1 Level Sulit ( Latihan Soal UKL )

📅 **Tanggal**: 3 November 2025
