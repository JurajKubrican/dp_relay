package sk.knet.dp.endpointshell

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile


@RestController
class Register {
    @PostMapping("/register")
    fun register(
            @RequestParam(value = "uploadfile") file: MultipartFile,
            @RequestParam(value = "clientname") clientName: String
    ) {

    }
}

