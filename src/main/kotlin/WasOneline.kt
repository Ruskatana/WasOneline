import java.util.*


fun main() {
    while (true) {
        println("Сколько секунд назад, Вы были онлайн? ")
        val nomber = Scanner(System.`in`)
        var amount: Int = nomber.nextInt()
        println(agoToText(amount) + changeMinuts(amount) + changeHours(amount))

    }
}


fun agoToText(amount: Int): String {
    return when {
        amount in 0..60 -> "был(а) только что"
        amount in 86401..172800 -> "был(а) в сети вчера "
        amount in 172801..259200 -> "был(а) в сети позавчера"
        amount >= 259201 -> "был(а) в сети давно"
        else -> ""
    }
}

fun changeMinuts(amount: Int): String =
    when {
        amount in 300..1200 -> "был(а) в сети " + (amount / 60) + " минут назад "
        amount in 61..3599 && amount / 60 % 10 == 1 -> "был(а) в сети " + (amount / 60) + " минуту назад "
        amount in 61..3599 && amount / 60 % 10 == 2 -> "был(а) в сети " + (amount / 60) + " минуты назад "
        amount in 61..3599 && amount / 60 % 10 == 3 -> "был(а) в сети " + (amount / 60) + " минуты назад "
        amount in 61..3599 && amount / 60 % 10 == 4 -> "был(а) в сети " + (amount / 60) + " минуты назад "
        amount in 61..3599 && amount / 60 % 10 == 5 -> "был(а) в сети " + (amount / 60) + " минут назад "
        amount in 61..3599 && amount / 60 % 10 == 6 -> "был(а) в сети " + (amount / 60) + " минут назад "
        amount in 61..3599 && amount / 60 % 10 == 7 -> "был(а) в сети " + (amount / 60) + " минут назад "
        amount in 61..3599 && amount / 60 % 10 == 8 -> "был(а) в сети " + (amount / 60) + " минут назад "
        amount in 61..3599 && amount / 60 % 10 == 9 -> "был(а) в сети " + (amount / 60) + " минут назад "
        amount in 61..3599 && amount / 60 % 10 == 0 -> "был(а) в сети " + (amount / 60) + " минут назад "
        else -> ""
    }

fun changeHours(amount: Int): String =
    when {
        amount in 3600..7199 || amount in 75600..79199 -> "был(а) в сети " + (amount / 3600) + " час назад "
        amount in 7200..17999 || amount in 79200..86400 -> "был(а) в сети " + (amount / 3600) + " часа назад "
        amount in 18000..72000 -> "был(а) в сети " + (amount / 3600) + " часов назад "
        else -> ""
    }
