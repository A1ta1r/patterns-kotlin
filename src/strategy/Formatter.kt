package strategy

class Formatter(private val format: FormatStrategy) {
    fun format(string: String) = format.format(string)
}