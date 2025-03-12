class BreadTovar(name : String, price : Int, weight_type : String, type : String, amount : Int, var isdark : Boolean)  : Tovar(name, price, weight_type, type, amount)
{
    override fun Info()
    {
        when(isdark)
        {
            true ->
                {
                println("Название товара: $name\nЦена за 1 шт: $price\nИзмеряется в $weight_type\nВид товара: $type\nКоличество: $amount\nЧёрный")
            }
            false ->
            {
                println("Название товара: $name\nЦена за 1 шт: $price\nИзмеряется в $weight_type\nВид товара: $type\nКоличество: $amount\nБелый")
            }
        }
    }
    override fun Gone_bad()
    {
        println("Хлеб зачерствел")
        price = price / 2
    }
    fun SelectWhite()
    {
        isdark = false
    }
    fun SelectBlack()
    {
        isdark = true
    }
}