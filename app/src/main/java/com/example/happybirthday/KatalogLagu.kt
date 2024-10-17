package com.example.happybirthday

fun main() {
    // Membuat instance lagu
    val lagu1 = music("Sempurna", "Band Indie", 2020, 850)
    val lagu2 = music("Malam Yang Sunyi", "Penyanyi Solo", 2018, 1500)

    // Memanggil metode deskripsiLagu
    println("Informasi Lagu 1:")
    lagu1.deskripsiLagu()

    println("\nInformasi Lagu 2:")
    lagu2.deskripsiLagu()
}

class music(
    val judul: String,
    val artis: String,
    val tahunPublikasi: Int,
    val jumlahPemutaran: Int
) {
    // Properti untuk mengecek apakah lagu populer menggunakan if-else
    fun cekPopuler(): Boolean {
        return if (jumlahPemutaran >= 1000) {
            true
        } else {
            false
        }
    }

    fun deskripsiLagu() {
        println("Judul: $judul")
        println("Artis: $artis")
        println("Tahun Publikasi: $tahunPublikasi")

        when {
            cekPopuler() -> println("Status: Lagu populer")
            else -> println("Status: Lagu tidak populer")
        }
    }
}