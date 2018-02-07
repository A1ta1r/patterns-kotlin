package creational.factory

import creational.entity.Merchandise
import creational.entity.Shirt

class ShirtFactory : Factory {
    override fun getInstance(size: Int): Merchandise {
        return Shirt(size)
    }
}