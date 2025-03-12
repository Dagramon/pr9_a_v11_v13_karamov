import jdk.jfr.DataAmount

class MilkTovar(name : String, price : Int, weight_type : String, type : String, amount : Int, var data : String)  : Tovar(name, price, weight_type, type, amount)
{
    override fun Info()
    {
        println("Название товара: $name\nЦена за 1 шт: $price\nИзмеряется в $weight_type\nВид товара: $type\nКоличество: $amount\nДата изготовления: $data")
    }

    override fun Gone_bad()
    {
        println("Молоко прокисло")
        price = price / 2
    }
    fun Sour_data()
    {
        var day = data.substring(0, 2).toInt() + 7
        var month = data.substring(3, 5).toInt()
        var year = data.substring(6,10).toInt()
        if (day >= 31)
        {
            day -= 30
            month += 1
        }
        if (month > 12)
        {
            year += 1
            month -= 12
        }
        if (month < 10)
        {
            if (day < 10)
            {
                println("Молоко прокиснет 0$day.0$month.$year")
            }
            else
            {
                println("Молоко прокиснет $day.0$month.$year")
            }
        }
        else
        {
            if (day < 10)
            {
                println("Молоко прокиснет 0$day.$month.$year")
            }
            else
            {
                println("Молоко прокиснет $day.$month.$year")
            }
        }
    }
}