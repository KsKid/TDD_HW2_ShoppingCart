import java.math.BigDecimal

class Book(val name: String = "", val quantity: Int = 0, val salePrice: Double = 0.0){

    fun getSubtotal(): Double{
        return BigDecimal(quantity).multiply(BigDecimal(salePrice)).toDouble()
    }
}