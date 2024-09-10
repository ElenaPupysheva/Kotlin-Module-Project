import java.util.Scanner

fun readNote(notes: MutableList<Note>){

    println("Выберите заметку для чтения:")
    notes.forEachIndexed { index, note ->
        println("${index}. ${note.title}")
    }
    val scanner = Scanner(System.`in`)
    val noteIndex = scanner.nextInt()
    if (noteIndex in notes.indices)
    notes.forEachIndexed { index, note ->
        println("Заметка '${note.title}'. Текст: ${note.text}")
    }
}
