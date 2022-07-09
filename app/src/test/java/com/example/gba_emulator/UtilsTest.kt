package com.example.gba_emulator

import com.example.gba_emulator.utils.checkBits16
import com.example.gba_emulator.utils.checkBits8
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test
import java.lang.IllegalArgumentException
import kotlin.test.assertFailsWith

class UtilsTest {

    @Test
    fun check8bits_is_correct(){
        val i = 0xF
        assertThat(checkBits8(i), `is`(i))
    }

    @Test
    fun check8bits_throws_exception(){
        val i = 0xFFF
        assertFailsWith<IllegalArgumentException>{
            checkBits8(i)
        }
    }

    @Test
    fun check16bits_is_correct(){
        val i = 0xFFF
        assertThat(checkBits16(i), `is`(i))
    }

    @Test
    fun check16bits_throws_exception(){
        val i = 0xFFFFF
        assertFailsWith<IllegalArgumentException>{
            checkBits16(i)
        }
    }
}