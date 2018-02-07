import creational.factory.CoolShirtFactory
import creational.factory.HoodieFactory
import creational.factory.ShirtFactory

fun runCreational() {
    val shirtFactory = ShirtFactory()
    val coolShirtFactory = CoolShirtFactory()
    val hoodieFactory = HoodieFactory()
    val item1 = shirtFactory.getInstance(45)
    val item2 = coolShirtFactory.getInstance(30)
    val item3 = hoodieFactory.getInstance(60)
    val item4 = coolShirtFactory.getInstance(48, true, "Red")
    val item5 = hoodieFactory.getInstance(60, false)
    arrayOf(item1, item2, item3, item4, item5).forEach { println("Item: $it") }
}