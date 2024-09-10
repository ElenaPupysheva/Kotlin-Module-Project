import java.util.Scanner

fun openNote(notes: MutableList<Note>) {

    val menu = Choice()
    menu.addMenuItem("Создать заметку", { createNote(notes) })
    menu.addMenuItem("Посмотреть/Выбрать созданную заметку", { showNotes(notes) })
    menu.addMenuItem("Назад", { })

    menu.execute()

}