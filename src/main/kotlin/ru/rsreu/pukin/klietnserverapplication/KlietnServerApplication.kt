package ru.rsreu.pukin.klietnserverapplication

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KlietnServerApplication

fun main(args: Array<String>) {
    runApplication<KlietnServerApplication>(*args)
}
