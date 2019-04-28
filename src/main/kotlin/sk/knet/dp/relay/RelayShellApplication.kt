package sk.knet.dp.relay

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity

@SpringBootApplication
@EnableWebSecurity
class RelayApplication

fun main(args: Array<String>) {
    runApplication<RelayApplication>(*args)
}
