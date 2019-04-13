package sk.knet.dp.endpointshell

import kotlin.String
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import javax.annotation.security.RolesAllowed

@RestController
@EnableResourceServer
class Example {
    @RolesAllowed("ROLE_ExampleLABSDD_USERDDDS")
    @PostMapping("Example/1")
    fun post1(
            @RequestParam(value = "name") name: String,
            @RequestParam(value = "surname") surname: String,
            @RequestParam(value = "date_of_birth") date_of_birth: String,
            @RequestParam(value = "street") street: String,
            @RequestParam(value = "streetnumber") streetnumber: String,
            @RequestParam(value = "postal", defaultValue = "") postal: String,
            @RequestParam(value = "city", defaultValue = "") city: String,
            @RequestParam(value = "income") income: String,
            @RequestParam(value = "loan_amount") loan_amount: String
    ) {
        print("not implemented")
    }

    @PostMapping("Example/5")
    fun post5(
            @RequestParam(value = "question_mortgage_lates") question_mortgage_lates: String,
            @RequestParam(value = "question_amount") question_amount: String,
            @RequestParam(value = "question_jobs") question_jobs: String
    ) {
        print("not implemented")
    }

    @PostMapping("Example/14")
    fun post14(@RequestParam(value = "reject_loanofficer_reason")
               reject_loanofficer_reason: String) {
        print("not implemented")
    }

    @PostMapping("Example/26")
    fun post26(@RequestParam(value = "reject_underwriter_reason")
               reject_underwriter_reason: String) {
        print("not implemented")
    }

    @PostMapping("Example/35")
    fun post35(
            @RequestParam(value = "floor") floor: String,
            @RequestParam(value = "type") type: String,
            @RequestParam(value = "years", defaultValue = "") years: String,
            @RequestParam(value = "photo", defaultValue = "") photo: String
    ) {
        print("not implemented")
    }

    @PostMapping("Example/39")
    fun post39(
            @RequestParam(value = "appraisal") appraisal: String,
            @RequestParam(value = "appraised_value") appraised_value: String,
            @RequestParam(value = "approved", defaultValue = "") approved: String
    ) {
        print("not implemented")
    }


    @PostMapping("Example/48")
    fun post48(@RequestParam(value = "delete_case") delete_case: String) {
        print("not implemented")
    }

    @PostMapping("Example/72")
    fun post72(@RequestParam(value = "confirmation_insurance", defaultValue = "")
               confirmation_insurance: String) {
        print("not implemented")
    }

    @PostMapping("Example/78")
    fun post78(@RequestParam(value = "payment", defaultValue = "") payment: String) {
        print("not implemented")
    }

    @PostMapping("Example/92")
    fun post92(@RequestParam(value = "confirmation_mortgage", defaultValue = "")
               confirmation_mortgage: String) {
        print("not implemented")
    }

    @PostMapping("Example/94")
    fun post94(@RequestParam(value = "confirmation_insurance", defaultValue = "")
               confirmation_insurance: String) {
        print("not implemented")
    }

    @GetMapping("Example/5")
    fun get5() = get5Result()

    @GetMapping("Example/30")
    fun get30() = get30Result()

    @GetMapping("Example/39")
    fun get39() = get39Result()

    @GetMapping("Example/53")
    fun get53() = get53Result()

    @GetMapping("Example/59")
    fun get59() = get59Result()

    @GetMapping("Example/61")
    fun get61() = get61Result()

    @GetMapping("Example/72")
    fun get72() = get72Result()

    @GetMapping("Example/78")
    fun get78() = get78Result()

    @GetMapping("Example/96")
    fun get96() = get96Result()

    @GetMapping("Example/155")
    fun get155() = get155Result()

    class get5Result(
            name: String = "",
            surname: String = "",
            income: String = "",
            loan_amount: String = "",
            score: String = ""
    )

    class get30Result(
            name: String = "",
            surname: String = "",
            income: String = "",
            loan_amount: String = "",
            question_mortgage_lates: String = "",
            question_amount: String = "",
            question_jobs: String = "",
            score: String = ""
    )

    class get39Result(
            floor: String = "",
            type: String = "",
            years: String = "",
            photo: String = ""
    )

    class get53Result(
            name: String = "",
            surname: String = "",
            date_of_birth: String = "",
            street: String = "",
            streetnumber: String = "",
            postal: String = "",
            city: String = "",
            income: String = "",
            loan_amount: String = ""
    )

    class get59Result(confirmation_insurance: String = "", insurance: String = "")

    class get61Result(
            name: String = "",
            surname: String = "",
            date_of_birth: String = "",
            street: String = "",
            streetnumber: String = "",
            postal: String = "",
            city: String = "",
            income: String = "",
            loan_amount: String = "",
            sign: String = ""
    )

    class get72Result(insurance: String = "")

    class get78Result(loan_amount: String = "")

    class get96Result(payment: String = "")

    class get155Result(status: String = "")
}
