import java.util.Scanner

fun openArchive (archives: List<Archive>,notes: MutableList<Note>){

    println("Выберите архив для добавления заметки:")
    archives.forEachIndexed { index, archive ->
        println("${index}. ${archive.nameArchive}")
    }
    val scanner = Scanner(System.`in`)
    val archiveIndex = scanner.nextInt()

    if (archiveIndex in archives.indices) openNote(notes) else println("Неизвестная команда, попробуйте еще раз...")

}
