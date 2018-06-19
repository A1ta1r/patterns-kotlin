import strategy.Formatter
import strategy.SnakeCaseStrategy
import strategy.CamelCaseStrategy

fun runStrategy() {
    val s1 = "A Test String Numero Uno"
    val s2 = "2nd Test StriNG"

    println(s1)
    println(s2)

    val camel = CamelCaseStrategy()
    val snake = SnakeCaseStrategy()

    var formatter = Formatter(snake)

    println("\nStrategy 1: Snake case formatting")
    println(formatter.format(s1))
    println(formatter.format(s2))

    formatter = Formatter(camel)

    println("\nStrategy 2: Camel case formatting")
    println(formatter.format(s1))
    println(formatter.format(s2))
}