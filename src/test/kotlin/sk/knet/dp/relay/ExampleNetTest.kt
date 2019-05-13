package sk.knet.dp.relay

import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.restdocs.JUnitRestDocumentation
import org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.documentationConfiguration
import org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders
import org.springframework.security.test.context.support.WithMockUser
import org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.springSecurity
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.test.web.servlet.setup.DefaultMockMvcBuilder
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import org.springframework.web.context.WebApplicationContext


@RunWith(SpringRunner::class)
@WebMvcTest(ExampleNet::class)
class ExampleNetTest {

    @MockBean
    lateinit var processServerRequest: ProcessServerRequest

    @Autowired
    lateinit var context: WebApplicationContext

    private var mvc: MockMvc? = null

    @get:Rule
    val jUnitRestDocumentation = JUnitRestDocumentation()

    @Before
    fun setUp() {
        mvc = MockMvcBuilders
                .webAppContextSetup(this.context)
                .apply<DefaultMockMvcBuilder>(documentationConfiguration(this.jUnitRestDocumentation))
                .apply<DefaultMockMvcBuilder>(springSecurity())
                .build()
    }

    @Test
    @WithMockUser("wrongtestUser")
    fun finisht1wrongtestUser() {
        mvc!!.perform(RestDocumentationRequestBuilders
                .post("/resource/admin/list/"))
                .andExpect(status().isForbidden)

    }

    @Test
    @WithMockUser("testUser")
    fun finisht1missingArgument1() {

        class PostData(
                val text_field: String? = null,
                val enumeration: String? = null
        )
        mvc!!.perform(RestDocumentationRequestBuilders
                .post("/0/t1/finish", PostData(enumeration = "opt_1")))
                .andExpect(status().isBadRequest)

    }

    @Test
    @WithMockUser("testUser")
    fun finisht1correct() {

        class PostData(
                val text_field: String? = null,
                val enumeration: String? = null
        )
        mvc!!.perform(RestDocumentationRequestBuilders
                .post("/0/t1/finish", PostData(text_field = "text", enumeration = "opt_1")))
                .andExpect(status().isBadRequest)

    }


}
