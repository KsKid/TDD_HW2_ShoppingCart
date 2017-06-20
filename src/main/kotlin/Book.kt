import java.math.BigDecimal

class Book(var name: String = "", var quantity: Int = 0, var salePrice: Double = 0.0){

    fun getSubtotal(): Double{
        return BigDecimal(quantity).multiply(BigDecimal(salePrice)).toDouble()
    }
}