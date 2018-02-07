package structural.entity

data class EconomClassFile(private val path: String) : FileInterface {

    override fun getPath(): String {
        return path
    }

    private var file: File? = null
    override fun getContents(): String {
        if (file == null) {
            file = File(getPath())
        }
        return file!!.getContents() + " FROM PROXY"
    }
}