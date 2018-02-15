package strategy

class LowerCaseStrategy : FormatStrategy {
    override fun format(s: String): String {
        return s.toLowerCase()
    }
}