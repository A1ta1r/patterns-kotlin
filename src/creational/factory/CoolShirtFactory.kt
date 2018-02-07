package creational.factory

import creational.entity.CoolShirt
import creational.entity.Merchandise

class CoolShirtFactory : Factory {
    override fun getInstance(size: Int): Merchandise {
        return CoolShirt(size)
    }

    fun getInstance(size: Int, isSigned: Boolean = false, color: String = "Black & White"): Merchandise {
        return CoolShirt(size, isSigned, color)
    }
}