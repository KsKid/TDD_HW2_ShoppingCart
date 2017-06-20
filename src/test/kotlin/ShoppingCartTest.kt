import org.junit.Test
import kotlin.test.assertEquals

class ShoppingCartTest {

    @Test
    fun test_第一集買了一本_其他都沒買_期望價格應為100x1_100元() {

        val books = arrayListOf(Book(name = "哈利波特第一集", quantity = 1, salePrice = 100.0))

        val target = ShoppingCart(books)

        val expected = 100.0

        val actual = target.getSubtotal()

        assertEquals(expected, actual)
    }

    @Test
    fun test_第一集買了一本_第二集也買了一本_期望價格應為100x2x0_95_190元() {

        val books = arrayListOf(
                Book(name = "哈利波特第一集", quantity = 1, salePrice = 100.0),
                Book(name = "哈利波特第二集", quantity = 1, salePrice = 100.0)
        )

        val target = ShoppingCart(books)

        val expected = 190.0

        val actual = target.getSubtotal()

        assertEquals(expected, actual)
    }

    @Test
    fun test_一二三集各買了一本_期望價格應為100x3x0_9_270元() {

        val books = arrayListOf(
                Book(name = "哈利波特第一集", quantity = 1, salePrice = 100.0),
                Book(name = "哈利波特第二集", quantity = 1, salePrice = 100.0),
                Book(name = "哈利波特第三集", quantity = 1, salePrice = 100.0)
        )

        val target = ShoppingCart(books)

        val expected = 270.0

        val actual = target.getSubtotal()

        assertEquals(expected, actual)
    }

    @Test
    fun test_一二三四集各買了一本_期望價格應為100x4x0_8_320元() {

        val books = arrayListOf(
                Book(name = "哈利波特第一集", quantity = 1, salePrice = 100.0),
                Book(name = "哈利波特第二集", quantity = 1, salePrice = 100.0),
                Book(name = "哈利波特第三集", quantity = 1, salePrice = 100.0),
                Book(name = "哈利波特第四集", quantity = 1, salePrice = 100.0)
        )

        val target = ShoppingCart(books)

        val expected = 320.0

        val actual = target.getSubtotal()

        assertEquals(expected, actual)
    }

    @Test
    fun test_一次買了整套_一二三四五集各買了一本_期望價格應為100x5x0_75_375元() {

        val books = arrayListOf(
                Book(name = "哈利波特第一集", quantity = 1, salePrice = 100.0),
                Book(name = "哈利波特第二集", quantity = 1, salePrice = 100.0),
                Book(name = "哈利波特第三集", quantity = 1, salePrice = 100.0),
                Book(name = "哈利波特第四集", quantity = 1, salePrice = 100.0),
                Book(name = "哈利波特第五集", quantity = 1, salePrice = 100.0)
        )

        val target = ShoppingCart(books)

        val expected = 375.0

        val actual = target.getSubtotal()

        assertEquals(expected, actual)
    }
}