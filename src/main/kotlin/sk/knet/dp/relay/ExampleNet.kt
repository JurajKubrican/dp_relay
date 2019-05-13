package sk.knet.dp.relay

import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiParam
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus.BAD_REQUEST
import org.springframework.http.HttpStatus.OK
import org.springframework.http.ResponseEntity
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import javax.annotation.security.RolesAllowed

@Controller
@EnableResourceServer
@RequestMapping("Example")
class ExampleNet {
    @Autowired
    lateinit var processServerRequest: ProcessServerRequest

    @PostMapping("/{instanceId}/t1/finish")
    @RolesAllowed("ROLE_EXAMPLE_USER")
    @ApiOperation(
            value = "Transitiont1",
            notes = "Allowed roles: [ROLE_EXAMPLE_USER]"
    )
    fun finisht1(
            @PathVariable("instanceId") instanceId: String,
            @RequestParam(value = "text_field", defaultValue = "") @ApiParam(required = false)
            text_field: String,
            @RequestParam(value = "enumeration") @ApiParam(required = true, allowableValues = """[opt_1,
                opt_2, opt_3]""") enumeration: String
    ): ResponseEntity<String> {
        val errors = mutableListOf<String>()
        if (text_field != "" && !Regex(".*").matches(text_field)) {
            errors.add("""text_field should match .*""")
        }
        if (!Regex("opt_1|opt_2|opt_3").matches(enumeration)) {
            errors.add("""enumeration should match opt_1|opt_2|opt_3""")
        }
        if (errors.isNotEmpty()) {
            return ResponseEntity(errors.toString(), BAD_REQUEST)
        }
        processServerRequest.data("Example",
                "t1",
                instanceId,
                mapOf("text_field" to text_field, "enumeration" to enumeration))
        return ResponseEntity("", OK)
    }

    @GetMapping("/{instanceId}/t1/")
    @RolesAllowed("ROLE_EXAMPLE_USER")
    @ApiOperation(
            value = "Transitiont1",
            notes = "Allowed roles: [ROLE_EXAMPLE_USER]"
    )
    fun t1(@PathVariable("instanceId") instanceId: String): gett1Result {
        processServerRequest.get("Example",
                "t1",
                instanceId)
        return gett1Result()
    }

    @PostMapping("/{instanceId}/t1/assign")
    @RolesAllowed("ROLE_EXAMPLE_USER")
    @ApiOperation(
            value = "Transitiont1",
            notes = "Allowed roles: [ROLE_EXAMPLE_USER]"
    )
    fun assignt1(@PathVariable("instanceId") instanceId: String): ResponseEntity<String> {
        processServerRequest.assign("Example",
                "t1",
                instanceId)
        return ResponseEntity("", OK)
    }

    @PostMapping("/{instanceId}/t1/delegate")
    @RolesAllowed("ROLE_EXAMPLE_MANAGER")
    @ApiOperation(
            value = "Transitiont1",
            notes = "Allowed roles: [ROLE_EXAMPLE_MANAGER]"
    )
    fun delegatet1(@PathVariable("instanceId") instanceId: String, @RequestParam(value = "userId")
    @ApiParam(required = true) userId: String): ResponseEntity<String> {
        processServerRequest.delegate("Example",
                "t1",
                instanceId,
                userId)
        return ResponseEntity("", OK)
    }

    @PostMapping("/{instanceId}/t1/cancel")
    @RolesAllowed("ROLE_EXAMPLE_USER")
    @ApiOperation(
            value = "Transitiont1",
            notes = "Allowed roles: [ROLE_EXAMPLE_USER]"
    )
    fun cancelt1(@PathVariable("instanceId") instanceId: String, @RequestParam(value = "userId")
    @ApiParam(required = true) userId: String): ResponseEntity<String> {
        processServerRequest.cancel("Example",
                "t1",
                instanceId)
        return ResponseEntity("", OK)
    }

    class gett1Result(text_field: String = "", enumeration: String = "")
}
