package com.example.questapi.model.data

import com.example.questapi.model.DataSiswa
import com.example.questapi.model.DetailSiswa

fun DetailSiswa.toDataSiswa(): DataSiswa = DataSiswa(
    id = id,
    nama = nama,
    alamat = alamat,
    telpon = telpon
)