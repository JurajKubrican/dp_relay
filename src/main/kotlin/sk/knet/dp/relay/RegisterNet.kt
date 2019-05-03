package sk.knet.dp.relay

import io.swagger.annotations.ApiParam
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile


@RestController
class RegisterNet {

    @ResponseBody
    @PostMapping("/")
    final fun registerClient(
            @ApiParam(example = """<?xml version="1.0" encoding="UTF-8"?>
<document xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:noNamespaceSchemaLocation="./users_schema.xsd">
    <user name="admin" password="verySecureAdminPass">
        <role id="client"/>
        <role id="bureau_agent"/>
        <role id="loan_officer"/>
        <role id="underwriter"/>
        <role id="property_appraiser"/>
        <role id="account_clerk"/>
    </user>
    <user name="user1" password="verySecureUser1Pass">
        <role id="bureau_agent"/>
        <role id="underwriter"/>
        <role id="account_clerk"/>
    </user>
    <user name="user2" password="verySecureUser2Pass">
        <role id="client"/>
        <role id="loan_officer"/>
        <role id="property_appraiser"/>
    </user>
</document>
""")
            @RequestParam(value = "model")
            modelFile: MultipartFile,
            @RequestParam(value = "users")
            usersFile: MultipartFile,
            @RequestParam(value = "netId")
            netId: String): String {



        return "Done"

    }

    @ResponseBody
    @DeleteMapping("/")
    final fun deleteClient(
            @ApiParam(name="netId", example = "netID123")
            @RequestParam(value = "netId") netId: String): String {


        return "Done"

    }

    @ResponseBody
    @GetMapping("/")
    final fun getClient(): List<String>? {
        return emptyList()
    }



}

