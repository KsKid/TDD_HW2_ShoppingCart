import java.math.BigDecimal

class ShoppingCart(var books: List<Book>){

    /**
     * 取得折扣率
     * 1. 一到五集的哈利波特，每一本都是賣100元
     * 2. 如果你從這個系列買了兩本不同的書，則會有5%的折扣
     * 3. 如果你買了三本不同的書，則會有10%的折扣
     * 4. 如果是四本不同的書，則會有20%的折扣
     * 5. 如果你一次買了整套一到五集，恭喜你將享有25%的折扣
     * 6. 需要留意的是，如果你買了四本書，其中三本不同，第四本則是重複的，那麼那三本將享有10%的折扣，但重複的那一本，則仍須100元。
     *
     */
    fun getDiscountRate(): Double{
        when (books.toSet().size){
            1 -> return 1.0
            2 -> return 0.95
            else -> return 1.0
        }
    }

    fun getSubtotal(): Double{
        return books.sumByDouble { book -> BigDecimal(book.getSubtotal()).multiply(BigDecimal(getDiscountRate())).toDouble() }
    }
}