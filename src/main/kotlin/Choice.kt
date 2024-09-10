
import java.util.Scanner
class Choice(
    var menu : MutableList<Pair<String, () -> Unit>> = mutableListOf()
) {
    fun addMenuItem(name:String, task: () -> Unit){
        menu.add(Pair(name, task))
    }
    fun showMenu(){
        println("Выберите пункт меню:")
        menu.forEachIndexed(){index, value ->
            println("${index}. ${value.first}")
        }
    }
    fun readInput(): Int {
        println("Введите номер пункта: ")
        val scanner = Scanner(System.`in`)
        var input :Int
        while (true) {
            if (scanner.hasNextInt()){
                input = scanner.nextInt()

                if(input in 0 until menu.size){
                    return input
                } else {
                    println("Введеное число вне диапазона меню,, попробуйте еще раз")
                }
            }
            else{
                println("Введено не число, попробуйте еще раз")
                scanner.next()
            }
        }
    }

    fun execute(){

        while (true){
            showMenu()

            val choice = readInput()
            if(choice != menu.lastIndex)
            {
                val action= menu[choice]
                action.second.invoke()
            }else{
                println("Пока!")
                break
            }
            }

    }
}
