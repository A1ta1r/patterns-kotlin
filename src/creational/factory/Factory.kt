package creational.factory

import creational.entity.Merchandise

interface Factory {
    fun getInstance(size: Int): Merchandise
}