package info.novatec;

import com.microsoft.azure.functions.ExecutionContext
import com.microsoft.azure.functions.HttpMethod
import com.microsoft.azure.functions.HttpRequestMessage
import com.microsoft.azure.functions.HttpResponseMessage
import com.microsoft.azure.functions.annotation.AuthorizationLevel
import com.microsoft.azure.functions.annotation.FunctionName
import com.microsoft.azure.functions.annotation.HttpTrigger
import io.micronaut.azure.function.http.AzureHttpFunction
import java.util.*

/**
 * Azure Functions with HTTP Trigger.
 */
class MyHttpFunction : AzureHttpFunction() {
    @FunctionName("BreakEvenTrigger")
    fun invoke(
            @HttpTrigger(name = "req",
                    methods = [HttpMethod.GET, HttpMethod.POST],
                    route = "{*route}",
                    authLevel = AuthorizationLevel.ANONYMOUS)
            request: HttpRequestMessage<Optional<String>>,
            context: ExecutionContext): HttpResponseMessage {
        return super.route(request, context)
    }
}
