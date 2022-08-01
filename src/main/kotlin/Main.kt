import kotlin.math.PI
import kotlin.math.sin

fun main() {
    println("10-point Gauss-Legendre quadrature")

    val leftEndpoint = 0.0
    val rightEndpoint = (5.0 / 6.0) * PI
    println("Your integral equals ${quadrature(leftEndpoint, rightEndpoint, ::integrandFunction)}")
}

fun integrandFunction(input: Double): Double {
    return sin(input)
}