package info.novatec;
import com.microsoft.azure.functions.*
import com.microsoft.azure.functions.annotation.*
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
