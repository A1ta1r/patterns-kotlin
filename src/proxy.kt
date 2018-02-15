import proxy.RealImage
import proxy.ProxyImage

const val homeDirectory = "files/"

fun runProxy() {
    val path1 = homeDirectory + "video"
    val path2 = homeDirectory + "regular"
    val videoFileProxy = ProxyImage(path1)
    val file = RealImage(path2)
    val videoFile = RealImage(path1)

    println(videoFileProxy.getPath())
    println(videoFileProxy.getContents())

    println()

    println(file.getPath())
    println(file.getContents())

    println()

    println(videoFile.getPath())
    println(videoFile.getContents())
}