import kotlin.math.*
import kotlin.random.Random

//Задание 1
fun main(){
    var k = readLine()!!.toInt()
    if (k %10==7 || k/10 == 7)
        println("входит число 7")
    else
        println("не входит число 7")
}
//Задание 2
fun main() {
    var k = readLine()!!.toInt()
    var l = k %100
    if (k/100==4 ||k%10==4 || l/10==4 && k/100==6 ||k%10==6 || l/10==6)
        println("есть 4 и 6")
    else
        println("нет 4 и 6")
}

// Задание 3
fun main(){
    var k = readLine()!!.toInt()
    var a = readLine()!!.toInt()
    var b = readLine()!!.toInt()
    if (k !in a..b )
        println ("Число не принадлежит интервалу от $a до $b")
    else
        println("Число принадлежит интервалу от $a до $b")
}

// Задание 4
fun main (){
    var k = readLine()!!.toInt()
    var t = 10.0
    var j = (t.pow(6)).toInt()
    var l=""

    if (k%10==1 )
        l=" рубль"
    if (k%10>= 2 && k%10<=4)
        l=" рубля"
    if (k%10>= 5 && k%10<=9 || k%10==0 || k>=11 && k<=14)
        l=" рублей"

    
    if (k in 1..j)
        println("Ваша сумма покупки $k$l")
    else
        println("Введите положительное число до 1 млн :/")


}

// Задание 5
fun  main() {
    println("Введите возраст")
    var voz = readLine()!!.toInt()
    println("Введите ФИО")
    var fio = readLine()!!.toString()
    println("Введите пол м/ж")
    var pol1 = readLine()!!.toString()
    var pol = ""
    pol = when (pol1) {
        "м" -> "Уважаемый"
        "ж" -> "Уважаемая"
        else -> ""
    }
    var cel = ""
    var b: Int = Random.nextInt(1, 3)
    cel = when (b) {
        1 -> "Пусть в жизни будут только удача, мир и радость, чтобы каждый новый день был праздником! И пусть мечты обязательно станут реальностью!"
        2 -> "Уважаемый клиент! От лица нашей компании, хотим поздравить вас с днем рождения! Желаем реализации всех целей и исполнения мечт. Семейного благополучия и денежного благосостояния. Будьте счастливы!"
        3 -> "Сердечно поздравляем и желаем наполнить свою жизнь только важными и нужными составляющими. Пускай сбудется все то, что входит в Ваши планы. Пускай реализуются все Ваши мечты. С днем рождения!"
        else -> ""
    }
    if (voz >= 18) {
        if (voz % 5 == 0) {
            println("$pol $fio. Поздравляю вас с $voz-летним Юбилеем. $cel ")
        } else {
            println("$pol $fio. Поздравляю вас с $voz-летием!. $cel ")

        }
    }else {
            println("Клиенту нет 18, вас могут оштрафовать ☠️")}

    }




