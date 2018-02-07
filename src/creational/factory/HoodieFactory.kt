package creational.factory

import creational.entity.Hoodie
import creational.entity.Merchandise

class HoodieFactory : Factory {
    override fun getInstance(size: Int): Merchandise {
        return Hoodie(size)
    }

    fun getInstance(size: Int, isFluffy: Boolean = true): Merchandise {
        return Hoodie(size, isFluffy)
    }
}