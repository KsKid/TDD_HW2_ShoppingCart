import java.math.BigDecimal

class ShoppingCart(var books: List<Book>){

    fun getSubtotal(): Double{
        return books.sumByDouble { book -> book.getSubtotal() }
    }
}