package org.ebong2.bookcha

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.context.annotation.Bean
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.web.client.RestTemplate


@SpringBootApplication
@EnableJpaRepositories
@EnableFeignClients
@EnableDiscoveryClient
class BookchaApplication {
	fun main(args: Array<String>) {
		runApplication<BookchaApplication>(*args)
	}

	@Bean
	fun restTemplate(builder: RestTemplateBuilder): RestTemplate? {
		return builder.build()
	}
}
