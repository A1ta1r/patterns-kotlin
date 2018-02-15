package strategy

class UpperCaseStrategy : FormatStrategy {
    override fun format(s: String): String {
        return s.toUpperCase()
    }
}