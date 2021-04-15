package info.novatec;

import io.micronaut.http.MediaType.APPLICATION_JSON
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Produces
import kotlin.math.ceil

class BreakEvenController {

    @Controller("/breakeven")
    class PetController {

        @Get
        @Produces(APPLICATION_JSON)
        fun returnSampleValue(): Int {
            return 42
        }

        @Post(processes = [APPLICATION_JSON])
        fun breakeven(price: Double, fixedCosts: Double, unitCosts: Double): Int {
            return ceil(fixedCosts / (price - unitCosts)).toInt()
        }
    }
}