package proxy

data class ProxyImage(private val path: String) : Image {

    override fun getPath(): String {
        return path
    }

    private var file: RealImage? = null

    override fun getContents(): String {
        if (file == null) {
            file = RealImage(getPath())
        }
        return file!!.getContents() + " FROM PROXY"
    }
}