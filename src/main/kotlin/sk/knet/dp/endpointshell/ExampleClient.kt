package sk.knet.dp.endpointshell

import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@EnableResourceServer
class GeneratedExample {
    @PostMapping("Vacuum/Transition1POST")
    fun Transition1POST(
            @RequestParam(value = "name") name: String,
            @RequestParam(value = "surname") surname: String,
            @RequestParam(value = "date_of_birth") date_of_birth: String,
            @RequestParam(value = "street") street: String,
            @RequestParam(value = "streetnumber") streetnumber: String,
            @RequestParam(value = "postal", defaultValue = "") postal: String,
            @RequestParam(value = "city", defaultValue = "") city: String,
            @RequestParam(value = "income") income: String,
            @RequestParam(value = "loan_amount") loan_amount: String
    ) = "Helloworld"

    @PostMapping("Vacuum/Transition5POST")
    fun Transition5POST(
            @RequestParam(value = "question_mortgage_lates") question_mortgage_lates: String,
            @RequestParam(value = "question_amount") question_amount: String,
            @RequestParam(value = "question_jobs") question_jobs: String
    ) = "Helloworld"

    @PostMapping("Vacuum/Transition14POST")
    fun Transition14POST(@RequestParam(value = "reject_loanofficer_reason")
                         reject_loanofficer_reason: String) = "Helloworld"

    @PostMapping("Vacuum/Transition26POST")
    fun Transition26POST(@RequestParam(value = "reject_underwriter_reason")
                         reject_underwriter_reason: String) = "Helloworld"

    @PostMapping("Vacuum/Transition35POST")
    fun Transition35POST(
            @RequestParam(value = "floor") floor: String,
            @RequestParam(value = "type") type: String,
            @RequestParam(value = "years", defaultValue = "") years: String,
            @RequestParam(value = "photo", defaultValue = "") photo: String
    ) = "Helloworld"

    @PostMapping("Vacuum/Transition39POST")
    fun Transition39POST(
            @RequestParam(value = "appraisal") appraisal: String,
            @RequestParam(value = "appraised_value") appraised_value: String,
            @RequestParam(value = "approved", defaultValue = "") approved: String
    ) = "Helloworld"

    @PostMapping("Vacuum/Transition48POST")
    fun Transition48POST(@RequestParam(value = "delete_case") delete_case: String) = "Helloworld"

    @PostMapping("Vacuum/Transition72POST")
    fun Transition72POST(@RequestParam(value = "confirmation_insurance", defaultValue = "")
                         confirmation_insurance: String) = "Helloworld"

    @PostMapping("Vacuum/Transition78POST")
    fun Transition78POST(@RequestParam(value = "payment", defaultValue = "") payment: String) =
            "Helloworld"

    @PostMapping("Vacuum/Transition92POST")
    fun Transition92POST(@RequestParam(value = "confirmation_mortgage", defaultValue = "")
                         confirmation_mortgage: String) = "Helloworld"

    @PostMapping("Vacuum/Transition94POST")
    fun Transition94POST(@RequestParam(value = "confirmation_insurance", defaultValue = "")
                         confirmation_insurance: String) = "Helloworld"

    @GetMapping("Vacuum/Transition5GET")
    fun Transition5GET() = Transition5GETResult()

    @GetMapping("Vacuum/Transition30GET")
    fun Transition30GET() = Transition30GETResult()

    @GetMapping("Vacuum/Transition39GET")
    fun transition39GET() = Transition39GETResult()


    @GetMapping("Vacuum/Transition53GET")
    fun Transition53GET() = Transition53GETResult()

    @GetMapping("Vacuum/Transition59GET")
    fun Transition59GET() = Transition59GETResult()

    @GetMapping("Vacuum/Transition61GET")
    fun Transition61GET() = Transition61GETResult()

    @GetMapping("Vacuum/Transition72GET")
    fun Transition72GET() = Transition72GETResult()

    @GetMapping("Vacuum/Transition78GET")
    fun Transition78GET() = Transition78GETResult()

    @GetMapping("Vacuum/Transition96GET")
    fun Transition96GET() = Transition96GETResult()

    @GetMapping("Vacuum/Transition155GET")
    fun Transition155GET() = Transition155GETResult()

    class Transition5GETResult(
            name: String = "",
            surname: String = "",
            income: String = "",
            loan_amount: String = "",
            score: String = ""
    )

    class Transition30GETResult(
            name: String = "",
            surname: String = "",
            income: String = "",
            loan_amount: String = "",
            question_mortgage_lates: String = "",
            question_amount: String = "",
            question_jobs: String = "",
            score: String = ""
    )

    class Transition39GETResult(
            floor: String = "",
            type: String = "",
            years: String = "",
            photo: String = ""
    )

    class Transition53GETResult(
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

    class Transition59GETResult(confirmation_insurance: String = "", insurance: String = "")

    class Transition61GETResult(
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

    class Transition72GETResult(insurance: String = "")

    class Transition78GETResult(loan_amount: String = "")

    class Transition96GETResult(payment: String = "")

    class Transition155GETResult(status: String = "")
}
