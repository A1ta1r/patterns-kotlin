package factory_method

class ShirtFactory : Factory {
    override fun getInstance(size: Int): Merchandise {
        return Shirt(size)
    }
}