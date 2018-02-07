import structural.entity.File
import structural.entity.EconomClassFile

const val homeDirectory = "files/"

fun runStructural() {
    val path1 = homeDirectory + "video"
    val path2 = homeDirectory + "regular"
    val videoFileProxy = EconomClassFile(path1)
    val file = File(path2)
    val videoFile = File(path1)

    println(videoFileProxy.getPath())
    println(videoFileProxy.getContents())

    println()

    println(file.getPath())
    println(file.getContents())

    println()

    println(videoFile.getPath())
    println(videoFile.getContents())
}