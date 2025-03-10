import jdk.jfr.DataAmount

class MilkTovar(name : String, price : Int, weight_type : String, type : String, amount : Int, var date : String)  : Tovar(name, price, weight_type, type, amount)
{
    override fun Info()
    {
        println("Название товара: $name\nЦена за 1 шт: $price\nИзмеряется в $weight_type\nВид товара: $type\nКоличество: $amount\nДата изготовления: $date")
    }

    override fun Gone_bad()
    {
        println("Молоко прокисло")
    }
}