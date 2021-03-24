package info.novatec
import io.micronaut.core.annotation.Introspected
import io.micronaut.function.aws.MicronautRequestHandler
import java.util.UUID

@Introspected
class BreakEvenRequestHandler : MicronautRequestHandler<BreakEvenRequest?, BreakEvenResponse?>() {

    override fun execute(request: BreakEvenRequest?): BreakEvenResponse? {
        return if (request != null) {
            val response = BreakEvenResponse()
            response.breakEvenPoint = kotlin.math.ceil(request.fixedCosts / (request.price - request.unitCosts)).toInt()
            return response
        } else {
            null
        }
    }
}