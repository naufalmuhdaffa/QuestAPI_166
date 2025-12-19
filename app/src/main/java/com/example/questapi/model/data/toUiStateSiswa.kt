package com.example.questapi.model.data

import com.example.questapi.model.DataSiswa
import com.example.questapi.model.UiStateSiswa

fun DataSiswa.toUiStateSiswa(isEntryValid: Boolean = false): UiStateSiswa = UiStateSiswa(
    detailSiswa = this.toDetailSiswa(),
    isEntryValid = isEntryValid
)