package creational.entity

open class Shirt(size: Int) : Merchandise(size) {
    override fun toString(): String {
        return "A regular shirt. Size = $size"
    }
}