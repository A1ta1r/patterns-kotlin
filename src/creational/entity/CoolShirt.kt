package creational.entity

class CoolShirt(size: Int, val isSigned: Boolean = false, val color: String = "Black & White") : Shirt(size) {
    override fun toString(): String {
        return "A cooler shirt with size = $size, $color color ${if (isSigned) "and is signed by some guys" else "and is not signed"}"
    }
}