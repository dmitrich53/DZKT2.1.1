fun main() {
    var card1: String
    var transfer: Int


    class CardHolder(
        var num: String,
        var name: String,
        var card: String,
        var transfers_History_receiving: Int,
        var transfers_History_shipment: Int,
        var cardBalance: Int,
    ) {
        override fun toString(): String {
            return "$num $name использует карту: $card " +
                    "сумма поступлений $transfers_History_receiving р. сумма переводов $transfers_History_shipment  р." +
                    "Баланс $cardBalance р."
        }

    }
    println("Активисты банковской деятельности сегодня:")
    val bankers = arrayOf(
        CardHolder(
            "1. ", "Антон", "Mastercard", 0, 0, 1_000_000
        ),
        CardHolder(
            "2. ", "Леон", "Maestro",
            0, 0, 1_000_000
        ),
        CardHolder(
            "3. ", "Семён", "Visa",
            0, 0, 1_000_000
        ),
        CardHolder(
            "4. ", "Леон", "Мир",
            0, 0, 1_000_000
        ),
        CardHolder(
            "5. ", "Анна", "VK Pay",
            0, 0, 1_000_000
        ),
    )
    bankers.forEach { println(it) }

    while (true) {
        println("Кто будет осуществлять перевод?")
        val x = readLine()?.toInt()?.minus(1)
        if (x != null) {
            println("Перевод делает  " + bankers[x])
            println("Введите сумму")
            val amount: Int = readLine()?.toInt() ?: 0
            card1 = bankers[x].card
            transfer = bankers[x].transfers_History_shipment
            val t: Int = commission(card1, amount, transfer)
            if (t != 0) {
                bankers[x].cardBalance = bankers[x].cardBalance - t
                bankers[x].transfers_History_shipment =
                    bankers[x].transfers_History_shipment + t
            }
            println("Итог операции  " + bankers[x])
            println("Продолжаем? Нажмите ENTER")
        }
        if (readLine() == "q") break
    }
}

fun commission(card1: String, amount: Int, transfer: Int): Int {
    return when (card1) {
        "VK Pay" -> if (amount + transfer > 15000) {
            println("Превышен лимит на " + (amount + transfer - 15000) + "р");0
        } else {
            println("Без комиссии."); amount
        }

        else -> when (amount + transfer) {
            in 0 until 75000 -> {
                println("Без комиссии.");amount
            }
            in 75000..150000 -> {
                when (card1) {
                    "Mastercard", "Maestro" -> {
                        println("Сумма комиссии " + ((amount / 1000 * 6 + 20) * 100) + " копеек."); amount
                    }
                    else -> {
                        println(
                            "Сумма комиссии " + if ((amount / 10000 * 75 + 20) * 100 < 35) 35 else {
                                (amount / 10000 * 75 + 20) * 100
                            } + " копеек."
                        ); amount
                    }
                }
            }
            else -> {
                println("Вы превысили суточный лимит.");0
            }
        }

    }
}