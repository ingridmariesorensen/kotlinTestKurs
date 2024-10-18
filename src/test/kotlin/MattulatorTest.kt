import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails

class MattulatorTest {
    private val mattulator = Mattulator()

    @Test
    fun adder_test_1_pluss_1() {
        val test = mattulator.Adder(1.0, 1.0)
        assertEquals(test, 2.0)
    }

    @Test
    fun adder_test_multiple_numbers() {
        val test = mattulator.Adder(-1.0, 1.0)
        assertEquals(test, 0.0)
    }

    @Test
    fun adder_test_zero(){
        val test = mattulator.Adder(1.0, 0.0)
        assertEquals(test, 1.0)
    }

    @Test
    fun sub_test_1_and_1() {
        val test = mattulator.Subtraher(1.0, 1.0)
        assertEquals(test, 0.0)
    }

    @Test
    fun sub_test_1_and__1() {
        val test = mattulator.Subtraher(1.0, -1.0)
        assertEquals(test, 2.0)
    }

    @Test
    fun sub_test__1_and_1() {
        val test = mattulator.Subtraher(-1.0, 1.0)
        assertEquals(actual = test, expected = -2.0)
    }

    @Test
    fun divide_test_1_and_1() {
        val test = mattulator.Divider(1.0, 1.0)
        assertEquals(actual = test, expected = 1.0)
    }

    @Test
    fun divide_test_10_divide_5() {
        val test = mattulator.Divider(10.0, 5.0)
        assertEquals(actual = test, expected = 2.0)
    }

    @Test
    fun divide_test_10_divide_10() {
        val test = mattulator.Divider(0.0, 10.0)
        assertEquals(actual = test, expected = 0.0)
    }





}