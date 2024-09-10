import java.util.Scanner
fun showArchives(archives: List<Archive>, notes: MutableList<Note>){
    val menu = Choice()
    menu.addMenuItem("Открыть архив для создания заметки?", { openArchive(archives,notes) })
    menu.addMenuItem("Назад", { })

    if (archives.isNotEmpty()) {
        println("Ваши архивы:")
        archives.forEachIndexed() {index,archive ->
            println("${index}. ${archive.nameArchive}")}
        menu.execute()
    }
    else {
        println("У вас нет созданных архивов.")}
}
