package proxy

data class RealImage(private val path: String) : Image {

    init {
        loadContents()
    }

    override fun getPath(): String {
        return path
    }

    override fun getContents(): String {
        return "Displaying contents: ${getPath().hashCode().toString(2)}"
    }

    private fun loadContents(): String {
        return "Loading ${getPath()}"
    }
}