import java.util.Scanner
fun createNote(notes: MutableList<Note>){
    val scanner = Scanner(System.`in`)

    println("Создаем заметку, введите заголовок:")
    val title = scanner.nextLine()
    if (title.isBlank()) {
        println("Заголовок не может быть пустым..Создайте заново")
        return
    }
    println("Создаем заметку, введите текст:")
    val text = scanner.nextLine()
    if (text.isBlank()) {
        println("Заголовок не может быть пустым.Создайте заново")
        return
    }
    val note = Note(title, text)
    notes.add(note)
    println("Заметка ${title} создана.")
}