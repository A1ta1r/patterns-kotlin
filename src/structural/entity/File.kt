package structural.entity

data class File(private val path: String) : FileInterface {

    override fun getPath(): String {
        return path
    }

    override fun getContents(): String {
        return getPath().hashCode().toString(2)
    }
}