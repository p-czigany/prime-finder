package com.peterczigany.primefinderservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PrimeFinderServiceApplication

fun main(args: Array<String>) {
	runApplication<PrimeFinderServiceApplication>(*args)
}
