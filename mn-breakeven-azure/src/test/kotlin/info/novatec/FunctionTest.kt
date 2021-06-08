package info.novatec;

import com.microsoft.azure.functions.HttpMethod
import com.microsoft.azure.functions.HttpStatus
import io.micronaut.azure.function.http.HttpRequestMessageBuilder.AzureHttpResponseMessage
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class FunctionTest {

    @Test
    @Throws(java.lang.Exception::class)
    fun testBreakEven() {
        MyHttpFunction().use { function ->
            val response: AzureHttpResponseMessage = function.request(HttpMethod.GET, "/breakeven")
                    .invoke()
            assertEquals(HttpStatus.OK, response.status)
            assertEquals("42", response.bodyAsString)
        }
    }

}