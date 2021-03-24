package info.novatec;

import com.microsoft.azure.functions.HttpMethod
import com.microsoft.azure.functions.annotation.AuthorizationLevel
import com.microsoft.azure.functions.annotation.FunctionName
import com.microsoft.azure.functions.annotation.HttpTrigger
import io.micronaut.azure.function.AzureFunction
import kotlin.math.ceil

/**
 * Azure Functions with HTTP Trigger.
 */
class Function : AzureFunction() {
    @FunctionName("breakeven")
    fun breakeven(
            @HttpTrigger(
                    name = "name",
                    methods = [HttpMethod.POST],
                    authLevel = AuthorizationLevel.ANONYMOUS)
            price: Double, unitCosts: Double, fixedCosts: Double): Int {
        return ceil(fixedCosts / (price - unitCosts)).toInt()
    }

    @FunctionName("hello")
    fun hello(
            @HttpTrigger(
                    name = "name",
                    methods = [HttpMethod.GET],
                    authLevel = AuthorizationLevel.ANONYMOUS)
            name: String): String {
        return "Hello $name"
    }
}
