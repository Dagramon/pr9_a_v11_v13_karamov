open class Tovar(var name : String, var price : Int, var weight_type : String, var type : String, var amount : Int)
{
    open fun Info()
    {
        println("Название товара: $name\nЦена за 1 шт: $price\nИзмеряется в $weight_type\nВид товара: $type\nКоличество: $amount")
    }
    open fun GetPrice()
    {
        println("Итоговая цена: " + price * amount)
    }
    open fun LowerWeightType()
    {
        when(weight_type)
        {
            "кг" ->
            {
                weight_type = "г"
            }
            "л" ->
            {
                weight_type = "мл"
            }
            else ->
            {
                println("Нельзя понизить измерение веса товара")
            }
        }
    }
    open fun Gone_bad()
    {
        println("Товар испортился")
    }
    open fun Lower_Price()
    {
        if (price >= 5)
        {
            println("Товар подешевел")
            price -= 5
        }
    }
}