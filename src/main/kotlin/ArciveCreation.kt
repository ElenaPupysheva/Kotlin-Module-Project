
import java.util.Scanner
fun archiveCreation(archives: MutableList<Archive>) {
    val scanner = Scanner(System.`in`)

    println("Создаем архив, введите имя архива:")
    val nameArchive = scanner.nextLine()
    if (nameArchive.isBlank()) {
        println("Архив не может быть без имени.Создайте заново")
        return
    }
    val archive = Archive(nameArchive)
    archives.add(archive)
    println("Архив ${nameArchive} создан.")

}
