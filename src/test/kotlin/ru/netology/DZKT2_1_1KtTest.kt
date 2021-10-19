package ru.netology

import ccc
import org.junit.Test

class DZKT2_1_1KtTest {

    @Test
    fun ccc_MastercardNoCommission() {
        val card1 = "Mastercard"
        val amount = 74999
        val transfer = 0

        val result = ccc(
            card1 = card1,
            amount = amount,
            transfer = transfer,
        )
        assertEguals(74999, result)
    }

    private fun assertEguals(amount: Int, result: Int) {

    }

    @Test
    fun ccc_MastercardCommission() {
        val card1 = "Mastercard"
        val amount = 150000
        val transfer = 0

        val result = ccc(
            card1 = card1,
            amount = amount,
            transfer = transfer,
        )
        assertEguals(150000, result)
    }

    @Test
    fun ccc_MastercardExceeding_the_limit() {
        val card1 = "Mastercard"
        val amount = 150001
        val transfer = 0

        val result = ccc(
            card1 = card1,
            amount = amount,
            transfer = transfer,
        )
        assertEguals(150001, result)
    }

    @Test
    fun ccc_MaestroNoCommission() {
        val card1 = "Maestro"
        val amount = 74999
        val transfer = 0

        val result = ccc(
            card1 = card1,
            amount = amount,
            transfer = transfer,
        )
        assertEguals(74999, result)
    }

    @Test
    fun ccc_MaestroCommission() {
        val card1 = "Maestro"
        val amount = 150000
        val transfer = 0

        val result = ccc(
            card1 = card1,
            amount = amount,
            transfer = transfer,
        )
        assertEguals(150000, result)
    }

    @Test
    fun ccc_MaestroExceeding_the_limit() {
        val card1 = "Maestro"
        val amount = 150001
        val transfer = 0

        val result = ccc(
            card1 = card1,
            amount = amount,
            transfer = transfer,
        )
        assertEguals(150001, result)
    }

    @Test
    fun ccc_VisaNoCommission() {
        val card1 = "Visa"
        val amount = 74999
        val transfer = 0

        val result = ccc(
            card1 = card1,
            amount = amount,
            transfer = transfer,
        )
        assertEguals(74999, result)
    }

    @Test
    fun ccc_VisaCommission() {
        val card1 = "Visa"
        val amount = 150000
        val transfer = 0

        val result = ccc(
            card1 = card1,
            amount = amount,
            transfer = transfer,
        )
        assertEguals(150000, result)
    }

    @Test
    fun ccc_VisaExceeding_the_limit() {
        val card1 = "Visa"
        val amount = 150001
        val transfer = 0

        val result = ccc(
            card1 = card1,
            amount = amount,
            transfer = transfer,
        )
        assertEguals(150001, result)
    }

    @Test
    fun ccc_MirNoCommission() {
        val card1 = "Мир"
        val amount = 74999
        val transfer = 0

        val result = ccc(
            card1 = card1,
            amount = amount,
            transfer = transfer,
        )
        assertEguals(74999, result)
    }

    @Test
    fun ccc_MirCommission() {
        val card1 = "Мир"
        val amount = 150000
        val transfer = 0

        val result = ccc(
            card1 = card1,
            amount = amount,
            transfer = transfer,
        )
        assertEguals(150000, result)
    }

    @Test
    fun ccc_MirExceeding_the_limit() {
        val card1 = "Мир"
        val amount = 150001
        val transfer = 0

        val result = ccc(
            card1 = card1,
            amount = amount,
            transfer = transfer,
        )
        assertEguals(150001, result)
    }

    @Test
    fun ccc_VK_PayNoCommission() {
        val card1 = "VK Pay"
        val amount = 14999
        val transfer = 0

        val result = ccc(
            card1 = card1,
            amount = amount,
            transfer = transfer,
        )
        assertEguals(14999, result)
    }

    @Test
    fun ccc_VK_PayExceeding_the_limit() {
        val card1 = "VK Pay"
        val amount = 15001
        val transfer=0

        val result = ccc(
            card1 = card1,
            amount = amount,
            transfer = transfer,
        )
        assertEguals(15001, result)
    }

    @Test
    fun ccc_MastercardExceeding_the_limit2() {
        val card1 = "Mastercard"
        val amount = 75000
        val transfer = 150000

        val result = ccc(
            card1 = card1,
            amount = amount,
            transfer = transfer,
        )
        assertEguals(0, result)
    }

}