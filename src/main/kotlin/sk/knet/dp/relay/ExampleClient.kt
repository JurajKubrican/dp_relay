//package sk.knet.dp.relay
//
//import io.swagger.annotations.ApiOperation
//import io.swagger.annotations.ApiParam
//import org.springframework.beans.factory.annotation.Autowired
//import org.springframework.http.HttpStatus.BAD_REQUEST
//import org.springframework.http.HttpStatus.OK
//import org.springframework.http.ResponseEntity
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer
//import org.springframework.web.bind.annotation.GetMapping
//import org.springframework.web.bind.annotation.PostMapping
//import org.springframework.web.bind.annotation.RequestParam
//import org.springframework.web.bind.annotation.RestController
//import org.springframework.web.multipart.MultipartFile
//import javax.annotation.security.RolesAllowed
//
//@RestController
//@EnableResourceServer
//class Janko {
//
//    @Autowired
//    lateinit var processServerRequest: ProcessServerRequest
//
//    @PostMapping("Janko/1")
//    @RolesAllowed("ROLE_JANKO_CLIENT", "ROLE_ADMIN", "ROLE_USER")
//    @ApiOperation(
//            value = "Transition1",
//            notes = "Allowed roles: [ROLE_JANKO_CLIENT]"
//    )
//    fun post1(
//            @ApiParam(value = "name", required = true, allowableValues = "janko,jurko", type = "String")
//            @RequestParam(value = "name") name: String,
//            @RequestParam(value = "surname") surname: String,
//            @RequestParam(value = "date_of_birth") date_of_birth: String,
//            @RequestParam(value = "street") street: String,
//            @RequestParam(value = "streetnumber") streetnumber: String,
//            @RequestParam(value = "postal", defaultValue = "") postal: String,
//            @RequestParam(value = "city", defaultValue = "") city: String,
//            @RequestParam(value = "income") income: String,
//            @RequestParam(value = "loan_amount") loan_amount: String
//    ): ResponseEntity<String> {
//        val errors = mutableListOf<String>()
//        if (!Regex(".*").matches(name)) {
//            errors.add("name" +
//                    "should match .*")
//        }
//        if (!Regex(".*").matches(surname)) {
//            errors.add("surname" +
//                    "should match .*")
//        }
//        if (!Regex("(\\d{4})-(\\d{2})-(\\d{2})").matches(date_of_birth)) {
//            errors.add("date_of_birth" +
//                    "should match (\\d{4})-(\\d{2})-(\\d{2})")
//        }
//        if (!Regex(".*").matches(street)) {
//            errors.add("street" +
//                    "should match .*")
//        }
//        if (!Regex(".*").matches(streetnumber)) {
//            errors.add("streetnumber" +
//                    "should match .*")
//        }
//        if (postal != "" && !Regex(".*").matches(postal)) {
//            errors.add("postal" +
//                    "should match .*")
//        }
//        if (city != "" && !Regex("").matches(city)) {
//            errors.add("city" +
//                    "should match ")
//        }
//        if (!Regex("\\d+").matches(income)) {
//            errors.add("income" +
//                    "should match \\d+")
//        }
//        if (!Regex("\\d+").matches(loan_amount)) {
//            errors.add("loan_amount" +
//                    "should match \\d+")
//        }
//        if (errors.isNotEmpty()) {
//            return ResponseEntity(errors.toString(), BAD_REQUEST)
//        }
//
//        return ResponseEntity("", OK)
//    }
//
//    @PostMapping("Janko/5")
//    @RolesAllowed("ROLE_JANKO_BUREAU_AGENT")
//    @ApiOperation(
//            value = "Transition5",
//            notes = "Allowed roles: [ROLE_JANKO_BUREAU_AGENT]"
//    )
//    fun post5(
//            @RequestParam(value = "question_mortgage_lates") question_mortgage_lates: String,
//            @RequestParam(value = "question_amount") question_amount: String,
//            @RequestParam(value = "question_jobs") question_jobs: String
//    ): ResponseEntity<String> {
//        val errors = mutableListOf<String>()
//        if (!Regex("0|1|true|false").matches(question_mortgage_lates)) {
//            errors.add("question_mortgage_lates" +
//                    "should match 0|1|true|false")
//        }
//        if (!Regex("0|1|true|false").matches(question_amount)) {
//            errors.add("question_amount" +
//                    "should match 0|1|true|false")
//        }
//        if (!Regex("0|1|true|false").matches(question_jobs)) {
//            errors.add("question_jobs" +
//                    "should match 0|1|true|false")
//        }
//        if (errors.isNotEmpty()) {
//            return ResponseEntity(errors.toString(), BAD_REQUEST)
//        }
//        return ResponseEntity("", OK)
//    }
//
//    @PostMapping("Janko/14")
//    @RolesAllowed("ROLE_USER")
//    @ApiOperation(
//            value = "Transition14",
//            notes = "Allowed roles: [ROLE_JANKO_LOAN_OFFICER]"
//    )
//    fun post14(@RequestParam(value = "reject_loanofficer_reason")
//               reject_loanofficer_reason: String): ResponseEntity<String> {
//        val errors = mutableListOf<String>()
//        if (!Regex(".*").matches(reject_loanofficer_reason)) {
//            errors.add("reject_loanofficer_reason" +
//                    "should match .*")
//        }
//        if (errors.isNotEmpty()) {
//            return ResponseEntity(errors.toString(), BAD_REQUEST)
//        }
//        return ResponseEntity("", OK)
//    }
//
//    @PostMapping("Janko/26")
//    @RolesAllowed("ROLE_JANKO_UNDERWRITER")
//    @ApiOperation(
//            value = "Transition26",
//            notes = "Allowed roles: [ROLE_JANKO_UNDERWRITER]"
//    )
//    fun post26(@RequestParam(value = "reject_underwriter_reason")
//               reject_underwriter_reason: String): ResponseEntity<String> {
//        val errors = mutableListOf<String>()
//        if (!Regex(".*").matches(reject_underwriter_reason)) {
//            errors.add("reject_underwriter_reason" +
//                    "should match .*")
//        }
//        if (errors.isNotEmpty()) {
//            return ResponseEntity(errors.toString(), BAD_REQUEST)
//        }
//        return ResponseEntity("", OK)
//    }
//
//    @PostMapping("Janko/35")
//    @RolesAllowed("ROLE_JANKO_CLIENT")
//    @ApiOperation(
//            value = "Transition35",
//            notes = "Allowed roles: [ROLE_JANKO_CLIENT]"
//    )
//    fun post35(
//            @RequestParam(value = "floor") floor: String,
//            @RequestParam(value = "type") type: String,
//            @RequestParam(value = "years", defaultValue = "") years: String,
//            @RequestParam(value = "photo", defaultValue = "") photo: MultipartFile
//    ): ResponseEntity<String> {
//        val errors = mutableListOf<String>()
//        if (!Regex("\\d+").matches(floor)) {
//            errors.add("floor" +
//                    "should match \\d+")
//        }
//        if (!Regex("House|Flat|Bungalow|Cabin").matches(type)) {
//            errors.add("type" +
//                    "should match House|Flat|Bungalow|Cabin")
//        }
//        if (years != "" && !Regex("\\d+").matches(years)) {
//            errors.add("years" +
//                    "should match \\d+")
//        }
//        if (errors.isNotEmpty()) {
//            return ResponseEntity(errors.toString(), BAD_REQUEST)
//        }
//        return ResponseEntity("", OK)
//    }
//
//    @PostMapping("Janko/39")
//    @RolesAllowed("ROLE_JANKO_PROPERTY_APPRAISER")
//    @ApiOperation(
//            value = "Transition39",
//            notes = "Allowed roles: [ROLE_JANKO_PROPERTY_APPRAISER]"
//    )
//    fun post39(
//            @RequestParam(value = "appraisal") appraisal: MultipartFile,
//            @RequestParam(value = "appraised_value") appraised_value: String,
//            @RequestParam(value = "approved", defaultValue = "") approved: String
//    ): ResponseEntity<String> {
//        val errors = mutableListOf<String>()
//        if (!Regex("\\d+").matches(appraised_value)) {
//            errors.add("appraised_value" +
//                    "should match \\d+")
//        }
//        if (approved != "" && !Regex("0|1|true|false").matches(approved)) {
//            errors.add("approved" +
//                    "should match 0|1|true|false")
//        }
//        if (errors.isNotEmpty()) {
//            return ResponseEntity(errors.toString(), BAD_REQUEST)
//        }
//        return ResponseEntity("", OK)
//    }
//
//    @PostMapping("Janko/48")
//    @RolesAllowed("ROLE_JANKO_CLIENT")
//    @ApiOperation(
//            value = "Transition48",
//            notes = "Allowed roles: [ROLE_JANKO_CLIENT]"
//    )
//    fun post48(@RequestParam(value = "delete_case") delete_case: String): ResponseEntity<String> {
//        val errors = mutableListOf<String>()
//        if (!Regex("0|1|true|false").matches(delete_case)) {
//            errors.add("delete_case" +
//                    "should match 0|1|true|false")
//        }
//        if (errors.isNotEmpty()) {
//            return ResponseEntity(errors.toString(), BAD_REQUEST)
//        }
//        return ResponseEntity("", OK)
//    }
//
//    @PostMapping("Janko/72")
//    @RolesAllowed("ROLE_JANKO_CLIENT")
//    @ApiOperation(
//            value = "Transition72",
//            notes = "Allowed roles: [ROLE_JANKO_CLIENT]"
//    )
//    fun post72(@RequestParam(value = "confirmation_insurance", defaultValue = "")
//               confirmation_insurance: MultipartFile): ResponseEntity<String> {
//        val errors = mutableListOf<String>()
//        if (errors.isNotEmpty()) {
//            return ResponseEntity(errors.toString(), BAD_REQUEST)
//        }
//        return ResponseEntity("", OK)
//    }
//
//    @PostMapping("Janko/78")
//    @RolesAllowed("ROLE_JANKO_ACCOUNT_CLERK")
//    @ApiOperation(
//            value = "Transition78",
//            notes = "Allowed roles: [ROLE_JANKO_ACCOUNT_CLERK]"
//    )
//    fun post78(@RequestParam(value = "payment", defaultValue = "") payment: MultipartFile):
//            ResponseEntity<String> {
//        val errors = mutableListOf<String>()
//        if (errors.isNotEmpty()) {
//            return ResponseEntity(errors.toString(), BAD_REQUEST)
//        }
//        return ResponseEntity("", OK)
//    }
//
//    @PostMapping("Janko/92")
//    @RolesAllowed("ROLE_JANKO_CLIENT")
//    @ApiOperation(
//            value = "Transition92",
//            notes = "Allowed roles: [ROLE_JANKO_CLIENT]"
//    )
//    fun post92(@RequestParam(value = "confirmation_mortgage", defaultValue = "")
//               confirmation_mortgage: MultipartFile): ResponseEntity<String> {
//        val errors = mutableListOf<String>()
//        if (errors.isNotEmpty()) {
//            return ResponseEntity(errors.toString(), BAD_REQUEST)
//        }
//        return ResponseEntity("", OK)
//    }
//
//    @PostMapping("Janko/94")
//    @RolesAllowed("ROLE_JANKO_CLIENT")
//    @ApiOperation(
//            value = "Transition94",
//            notes = "Allowed roles: [ROLE_JANKO_CLIENT]"
//    )
//    fun post94(@RequestParam(value = "confirmation_insurance", defaultValue = "")
//               confirmation_insurance: MultipartFile): ResponseEntity<String> {
//        val errors = mutableListOf<String>()
//        if (errors.isNotEmpty()) {
//            return ResponseEntity(errors.toString(), BAD_REQUEST)
//        }
//        return ResponseEntity("", OK)
//    }
//
//    @GetMapping("Janko/5")
//    @RolesAllowed("ROLE_JANKO_BUREAU_AGENT")
//    @ApiOperation(
//            value = "Transition5",
//            notes = "Allowed roles: [ROLE_JANKO_BUREAU_AGENT]"
//    )
//    fun get5() = get5Result()
//
//    @GetMapping("Janko/30")
//    @RolesAllowed("ROLE_JANKO_UNDERWRITER")
//    @ApiOperation(
//            value = "Transition30",
//            notes = "Allowed roles: [ROLE_JANKO_UNDERWRITER]"
//    )
//    fun get30() = get30Result()
//
//    @GetMapping("Janko/39")
//    @RolesAllowed("ROLE_JANKO_PROPERTY_APPRAISER")
//    @ApiOperation(
//            value = "Transition39",
//            notes = "Allowed roles: [ROLE_JANKO_PROPERTY_APPRAISER]"
//    )
//    fun get39() = get39Result()
//
//    @GetMapping("Janko/53")
//    @RolesAllowed("ROLE_JANKO_LOAN_OFFICER")
//    @ApiOperation(
//            value = "Transition53",
//            notes = "Allowed roles: [ROLE_JANKO_LOAN_OFFICER]"
//    )
//    fun get53() = get53Result()
//
//    @GetMapping("Janko/59")
//    @RolesAllowed("ROLE_JANKO_UNDERWRITER")
//    @ApiOperation(
//            value = "Transition59",
//            notes = "Allowed roles: [ROLE_JANKO_UNDERWRITER]"
//    )
//    fun get59() = get59Result()
//
//    @GetMapping("Janko/61")
//    @RolesAllowed("ROLE_JANKO_CLIENT")
//    @ApiOperation(
//            value = "Transition61",
//            notes = "Allowed roles: [ROLE_JANKO_CLIENT]"
//    )
//    fun get61() = get61Result()
//
//    @GetMapping("Janko/72")
//    @RolesAllowed("ROLE_JANKO_CLIENT")
//    @ApiOperation(
//            value = "Transition72",
//            notes = "Allowed roles: [ROLE_JANKO_CLIENT]"
//    )
//    fun get72() = get72Result()
//
//    @GetMapping("Janko/78")
//    @RolesAllowed("ROLE_JANKO_ACCOUNT_CLERK")
//    @ApiOperation(
//            value = "Transition78",
//            notes = "Allowed roles: [ROLE_JANKO_ACCOUNT_CLERK]"
//    )
//    fun get78() = get78Result()
//
//    @GetMapping("Janko/96")
//    @RolesAllowed("ROLE_JANKO_CLIENT")
//    @ApiOperation(
//            value = "Transition96",
//            notes = "Allowed roles: [ROLE_JANKO_CLIENT]"
//    )
//    fun get96() = get96Result()
//
//    @GetMapping("Janko/155")
//    @RolesAllowed("ROLE_JANKO_CLIENT")
//    @ApiOperation(
//            value = "Transition155",
//            notes = "Allowed roles: [ROLE_JANKO_CLIENT]"
//    )
//    fun get155() = get155Result()
//
//    class get5Result(
//            name: String = "",
//            surname: String = "",
//            income: String = "",
//            loan_amount: String = "",
//            score: String = ""
//    )
//
//    class get30Result(
//            name: String = "",
//            surname: String = "",
//            income: String = "",
//            loan_amount: String = "",
//            question_mortgage_lates: String = "",
//            question_amount: String = "",
//            question_jobs: String = "",
//            score: String = ""
//    )
//
//    class get39Result(
//            floor: String = "",
//            type: String = "",
//            years: String = "",
//            photo: String = ""
//    )
//
//    class get53Result(
//            name: String = "",
//            surname: String = "",
//            date_of_birth: String = "",
//            street: String = "",
//            streetnumber: String = "",
//            postal: String = "",
//            city: String = "",
//            income: String = "",
//            loan_amount: String = ""
//    )
//
//    class get59Result(confirmation_insurance: String = "", insurance: String = "")
//
//    class get61Result(
//            name: String = "",
//            surname: String = "",
//            date_of_birth: String = "",
//            street: String = "",
//            streetnumber: String = "",
//            postal: String = "",
//            city: String = "",
//            income: String = "",
//            loan_amount: String = "",
//            sign: String = ""
//    )
//
//    class get72Result(insurance: String = "")
//
//    class get78Result(loan_amount: String = "")
//
//    class get96Result(payment: String = "")
//
//    class get155Result(status: String = "")
//}
