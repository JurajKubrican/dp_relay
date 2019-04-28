package sk.knet.dp.relay

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity


@Configuration
@EnableGlobalMethodSecurity(
        prePostEnabled = true,
        jsr250Enabled = true)
class MethodSecurityConfig
    : GlobalMethodSecurityConfiguration()
