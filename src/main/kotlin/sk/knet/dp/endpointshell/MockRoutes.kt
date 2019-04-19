package sk.knet.dp.endpointshell

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile


@RestController
class MockRoutes {
    @PostMapping("/register")
    fun register(
            @RequestParam(value = "model") modelFile: MultipartFile,
            @RequestParam(value = "users") usersFile: MultipartFile,
            @RequestParam(value = "clientname") clientName: String): String {
        return ""

    }
}

