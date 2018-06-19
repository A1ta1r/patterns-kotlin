package strategy

class SnakeCaseStrategy : FormatStrategy {
    override fun format(s: String): String {
        var res = firstLetterToLower(s)
        res = spacesToUnderscore(res)
        res = upperToUnderscore(res)
        return res
    }

    private fun firstLetterToLower(s: String): String {
        return s[0].toLowerCase() + s.drop(1)
    }

    private fun spacesToUnderscore(s: String): String {
        var res = ""
        for (c: Char in s) {
            res += if (c != ' ') {
                c
            } else {
                '_'
            }
        }
        return res
    }

    private fun upperToUnderscore(s: String): String {
        var res = ""
        var prevUnder = false
        for (c: Char in s) {
            if (c == '_') {
                res += c
                prevUnder = true
            } else {
                if (c.isUpperCase() && !prevUnder) {
                    res += '_'
                    res += c
                } else {
                    res += c
                    prevUnder = false
                }
            }
        }
        return res.toLowerCase()
    }
}