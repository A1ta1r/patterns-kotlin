import strategy.Formatter
import strategy.LowerCaseStrategy
import strategy.UpperCaseStrategy

fun runStrategy() {
    val s1 = "A Test String Numero Uno"
    val s2 = "2nd Test StriNG"

    println(s1)
    println(s2)

    val upperFormat = UpperCaseStrategy()
    val lowerFormat = LowerCaseStrategy()

    var formatter = Formatter(lowerFormat)

    println("\nStrategy 1:")
    println(formatter.handle(s1))
    println(formatter.handle(s2))

    formatter = Formatter(upperFormat)

    println("\nStrategy 2:")
    println(formatter.handle(s1))
    println(formatter.handle(s2))
}