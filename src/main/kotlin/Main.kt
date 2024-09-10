fun main() {

    val archives = mutableListOf<Archive>()
    val notes = mutableListOf<Note>()
    val menu = Choice()
    menu.addMenuItem("Создать архив") { archiveCreation(archives) }
    menu.addMenuItem("Посмотреть/Выбрать созданные архивы") { showArchives(archives, notes) }
    menu.addMenuItem("Выход" ){ }

    menu.execute()
}

