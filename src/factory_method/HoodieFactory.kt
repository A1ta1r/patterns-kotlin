package factory_method

class HoodieFactory : Factory {
    override fun getInstance(size: Int): Merchandise {
        return Hoodie(size)
    }

    fun getInstance(size: Int, isFluffy: Boolean = true): Merchandise {
        return Hoodie(size, isFluffy)
    }
}