package com.mysticbyte.mastercounterapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform