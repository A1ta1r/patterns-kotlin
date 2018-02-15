package factory_method

interface Factory {
    fun getInstance(size: Int): Merchandise
}