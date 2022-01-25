package com.example.kaServer

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KaServerApplication

fun main(args: Array<String>) {
	runApplication<KaServerApplication>(*args) {
		setBannerMode(Banner.Mode.OFF)
	}
}
