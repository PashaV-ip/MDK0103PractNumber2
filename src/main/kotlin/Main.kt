fun main(args: Array<String>) {
//Задание 1
    val age1 = 42.0 //Был Int стал Double
    val age2 = 21.0 //Был Int стал Double
//Задание 2

    val avg1 = (age1+age2)/2
    println(avg1)
    //Результат был не точный из-за неправельного типа, значение было без дробной части
//Задание 3
    //Так как был тип Int он отбрасывал дробную часть и результат был не точный. Преобразовали в Double и всё стало номрально
//Задание 4

    val firstName:String = "Павел"
    val lastName:String = "Ваньшев"
    println("$lastName $firstName")
// Задание 5

    val fullName:String = "$lastName $firstName"
    println(fullName)
//Задание 6

    val myDetails:String = "Привет, меня зовут $fullName"
// Задание 7

    val date:Triple<Int, Int, Int> = Triple(10, 10, 2022)
// Задание 8

    val (month, day, year) = date
// Задание 9

    var (monthTask9_10, _, yearTask9_10) = date
// Задание 10

    monthTask9_10 = 7
    val editTriple = Pair(monthTask9_10, yearTask9_10)
    println(editTriple)
}