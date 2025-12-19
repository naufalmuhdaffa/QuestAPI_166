package com.example.questapi.model.data

import com.example.questapi.model.DataSiswa
import com.example.questapi.model.DetailSiswa

fun DataSiswa.toDetailSiswa(): DetailSiswa = DetailSiswa(
    id = id,
    nama = nama,
    alamat = alamat,
    telpon = telpon
)