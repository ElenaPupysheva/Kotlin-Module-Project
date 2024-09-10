import java.util.Scanner

fun showNotes(notes: MutableList<Note>) {
    val menu = Choice()
    menu.addMenuItem("Хотите прочитать заметку?", { readNote(notes) })
    menu.addMenuItem("Назад", { })

    if (notes.isEmpty()) {
        println("Нет заметок.")
        return
    }else{
        menu.execute()
            }
}
