package ru.netology

import commission
import org.junit.Test
import org.junit.Assert.*

class DZKT2_1_1KtTest {


    @Test
    fun commission_MastercardNoCommission() {
        val card1 = "Mastercard"
        val amount = 74999
        val transfer = 0

        val result = commission(
            card1 = card1,
            amount = amount,
            transfer = transfer,
        )
        assertEquals(74999,result)
    }



    @Test
    fun commission_MastercardCommission() {
        val card1 = "Mastercard"
        val amount = 150000
        val transfer = 0

        val result = commission(
            card1 = card1,
            amount = amount,
            transfer = transfer,
        )
        assertEquals(150000,result)
    }

    @Test
    fun commission_MastercardExceeding_the_limit() {
        val card1 = "Mastercard"
        val amount = 150001
        val transfer = 0

        val result = commission(
            card1 = card1,
            amount = amount,
            transfer = transfer,
        )
        assertEquals(0,result)
    }

    @Test
    fun commission_MaestroNoCommission() {
        val card1 = "Maestro"
        val amount = 74999
        val transfer = 0

        val result = commission(
            card1 = card1,
            amount = amount,
            transfer = transfer,
        )
        assertEquals(74999,result)
    }

    @Test
    fun commission_MaestroCommission() {
        val card1 = "Maestro"
        val amount = 150000
        val transfer = 0

        val result = commission(
            card1 = card1,
            amount = amount,
            transfer = transfer,
        )
        assertEquals(92000,result)
    }

    @Test
    fun commission_MaestroExceeding_the_limit() {
        val card1 = "Maestro"
        val amount = 150001
        val transfer = 0

        val result = commission(
            card1 = card1,
            amount = amount,
            transfer = transfer,
        )
        assertEquals(0,result)
    }

    @Test
    fun commission_VisaNoCommission() {
        val card1 = "Visa"
        val amount = 74999
        val transfer = 0

        val result = commission(
            card1 = card1,
            amount = amount,
            transfer = transfer,
        )
        assertEquals(74999,result)
    }

    @Test
    fun commission_VisaCommission() {
        val card1 = "Visa"
        val amount = 150000
        val transfer = 0

        val result = commission(
            card1 = card1,
            amount = amount,
            transfer = transfer,
        )
        assertEquals(150000,result)
    }

    @Test
    fun commission_VisaExceeding_the_limit() {
        val card1 = "Visa"
        val amount = 150001
        val transfer = 0

        val result = commission(
            card1 = card1,
            amount = amount,
            transfer = transfer,
        )
        assertEquals(0,result)
    }

    @Test
    fun commission_MirNoCommission() {
        val card1 = "Мир"
        val amount = 74999
        val transfer = 0

        val result = commission(
            card1 = card1,
            amount = amount,
            transfer = transfer,
        )
        assertEquals(74999,result)
    }

    @Test
    fun commission_MirCommission() {
        val card1 = "Мир"
        val amount = 150000
        val transfer = 0

        val result = commission(
            card1 = card1,
            amount = amount,
            transfer = transfer,
        )
        assertEquals(150000,result)
    }

    @Test
    fun commission_MirExceeding_the_limit() {
        val card1 = "Мир"
        val amount = 150001
        val transfer = 0

        val result = commission(
            card1 = card1,
            amount = amount,
            transfer = transfer,
        )
        assertEquals(0,result)
    }

    @Test
    fun commission_VK_PayNoCommission() {
        val card1 = "VK Pay"
        val amount = 14999
        val transfer = 0

        val result = commission(
            card1 = card1,
            amount = amount,
            transfer = transfer,
        )
        assertEquals(14999,result)
    }

    @Test
    fun commission_VK_PayExceeding_the_limit() {
        val card1 = "VK Pay"
        val amount = 15001
        val transfer = 0

        val result = commission(
            card1 = card1,
            amount = amount,
            transfer = transfer,
        )
        assertEquals(0,result)
    }

    @Test
    fun commission_MastercardExceeding_the_limit2() {
        val card1 = "Mastercard"
        val amount = 75000
        val transfer = 150000

        val result = commission(
            card1 = card1,
            amount = amount,
            transfer = transfer,
        )
        assertEquals(0,result)
    }

}