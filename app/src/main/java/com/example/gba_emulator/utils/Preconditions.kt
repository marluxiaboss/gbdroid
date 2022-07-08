package com.example.gba_emulator.utils

fun checkBits8(v: Int): Int {
    if (v >= 0 && v <= 0xFF) {
        return v
    } else {
        throw IllegalArgumentException()
    }
}

fun checkBits16(v: Int): Int {
    if (v >= 0 && v <= 0xFFFF) {
        return v
    } else {
        throw IllegalArgumentException()
    }
}