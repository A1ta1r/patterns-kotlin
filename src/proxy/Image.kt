package proxy

interface Image {
    fun getContents(): String
    fun getPath(): String
}