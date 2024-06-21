package dev.cancio.marvel_characters.service

import dev.cancio.marvel_characters.BuildConfig
import java.math.BigInteger
import java.security.MessageDigest

fun getHash(): String {
    val ts = System.currentTimeMillis().toString()
    val toBeHashed = "$ts${BuildConfig.MARVEL_PRIVATE_KEY}${BuildConfig.MARVEL_API_KEY}"
    val md = MessageDigest.getInstance("MD5")
    val digest = md.digest(toBeHashed.toByteArray())
    val hash = BigInteger(1, digest).toString(16).padStart(32, '0')
    return hash
}

fun getTs(): String {
    return System.currentTimeMillis().toString()
}