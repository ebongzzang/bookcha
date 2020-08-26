package org.ebong2.bookcha

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories
class BookchaApplication
fun main(args: Array<String>) {
	runApplication<BookchaApplication>(*args)
}
