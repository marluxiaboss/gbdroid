package com.example.gba_emulator.component.memory

/**
 * Class for rom of the gameboy
 * @property data: data of the rom in byte
 */
class Rom(val data: Array<Byte>) {

    /**
     * Compute size of the memory (number of bytes).
     * @return number of bytes
     */
    fun size(): Int {
        return data.size
    }

}