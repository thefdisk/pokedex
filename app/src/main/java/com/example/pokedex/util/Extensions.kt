package com.example.pokedex.util

import java.util.*

/**
 * Replacement for kotlin's deprecated `capitalized()` function.
 */
fun String.capitalized(): String {
    return this.replaceFirstChar {
        if (it.isLowerCase())
            it.titlecase(Locale.getDefault())
        else it.toString()
    }
}