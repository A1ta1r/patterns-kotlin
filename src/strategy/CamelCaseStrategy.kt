package strategy

class CamelCaseStrategy : FormatStrategy {
    override fun format(s: String): String {
        var res = firstLetterToLower(s)
        res = spacesToUpper(res)
        res = underscoresToUpper(res)
        return res
    }

    private fun firstLetterToLower(s: String): String {
        return s[0].toLowerCase()+ s.drop(1)
    }

    private fun spacesToUpper(s: String): String {
        var res = ""
        var nextUpper = false
        for (c: Char in s) {
            if (c != ' ') {
                res += if (nextUpper) {
                    c.toUpperCase()
                } else {
                    c
                }
                nextUpper = false
            } else {
                nextUpper = true
            }
        }
        return res
    }

    private fun underscoresToUpper(s: String): String {
        var res = ""
        var nextUpper = false
        for (c: Char in s) {
            if (c != '_') {
                res += if (nextUpper) {
                    c.toUpperCase()
                } else {
                    c
                }
            } else {
                nextUpper = true
            }
        }
        return res
    }
}