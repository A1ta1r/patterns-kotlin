package strategy

class Formatter(private val format: FormatStrategy) {
    fun handle(string: String) = format.format(string)
}