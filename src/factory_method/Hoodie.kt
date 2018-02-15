package factory_method

class Hoodie(size: Int, val isFluffy: Boolean = true) : Merchandise(size) {
    override fun toString(): String {
        return "A super cool hoodie. Size = $size and is ${if (isFluffy) "very" else "not"} fluffy"
    }
}