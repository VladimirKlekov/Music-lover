const val DISCOUNT_UP_TO_10000_RUB = 100 //100 рублей от суммы покупки
const val DISCOUNT_OVER_10000_RUB = 5 // 5 % от суммы покупки
const val ADDITIONAL_DISCOUNT = 1 // 1 % от суммы от суммы покупки после других скидок


fun main() {
    println("Добро пожаловать в интернет магазин Меломан")
    println(" ")
    println("Уважаемый покупатель!!! При совершении покупки вам могут быть предоставлены следующие скидки: ")
    println("1.При покупке от 1001 до 10000 предоставляется скидка $DISCOUNT_UP_TO_10000_RUB рублей")
    println("2.При покупке от 10001 рубля и выше предоставляется скидка $DISCOUNT_OVER_10000_RUB процентов")
    println("3.Постоянным клиентам предоставляется дополнительная скида $ADDITIONAL_DISCOUNT процент")
    println(" ")
    while (true){
    println("Для совершения покупки войдите в личный кабинет: ")
    println("1. Постоянный покупатель ")
    println("2. Разовая покупка ")

    val login: Int = readln().toInt()

    println("Введите сумму покупки:")
    val input: Int = readln().toInt()

    if (input > 1000 && input < 10001 ) {
        val result = input - DISCOUNT_UP_TO_10000_RUB
        println("Покупка на сумму $result рублей совершена. Скидка составляет: $DISCOUNT_UP_TO_10000_RUB рублей")
    }else if (input>10000 && login != 1){
        val discount = input / 100 * DISCOUNT_OVER_10000_RUB
        val result = input - discount
        println("Покупка на сумму $result рублей совершена. Скидка составляет: $discount рублей")
    }else if (input>10000 && login == 1){
        val discount = input / 100 * DISCOUNT_OVER_10000_RUB
        val addDiscount = (input - discount) / 100
        val result = input - discount - addDiscount
        println("Покупка на сумму $result рублей совершена. Скидка составляет: " + (discount + addDiscount) + " рублей")
    }else {
        println("Сумма покупки составит: $input")
    }
    }
}
