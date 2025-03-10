fun main()
{
    try
    {
        var tovar = Tovar("Товар", 100, "кг", "Обычный", 1)
        var milk = MilkTovar("Молоко", 50, "л", "Молочный", 1, "10.03.2025")
        var bread = BreadTovar("Хлеб", 60, "кг", "Выпечка", 1, false)
        println("1 - Товар\n2 - Молоко\n3 - Хлеб")
        print("Выберите товар: ")
        when(readln().toInt())
        {
            1 ->
            {
                do {
                    tovar.Info()
                    println("-------------------------------------------------------------------------------------")
                    println("1 - Понизить измерение веса товара\n2 - Товар испортился\n3 - Скидка\n4 - Информация")
                    println("-------------------------------------------------------------------------------------")
                    print("Выберите функцию: ")
                    when (readln().toInt())
                    {
                        1 -> {
                            tovar.LowerWeightType()
                        }
                        2 -> {
                            tovar.Gone_bad()
                        }
                        3 -> {
                            tovar.Lower_Price()
                        }
                        4 -> {
                            tovar.Info()
                        }
                        else ->
                        {
                            println("Неверно выбрано действие")
                        }
                    }
                    print("Введите количество: ")
                    tovar.amount = readln().toInt()
                    tovar.GetPrice()
                } while (true)
            }
            2 ->
            {
                do {
                    milk.Info()
                    println("-------------------------------------------------------------------------------------")
                    println("1 - Понизить измерение веса товара\n2 - Товар испортился\n3 - Скидка\n4 - Информация")
                    println("-------------------------------------------------------------------------------------")
                    print("Выберите функцию: ")
                    when (readln().toInt())
                    {
                        1 -> {
                            milk.LowerWeightType()
                        }
                        2 -> {
                            milk.Gone_bad()
                        }
                        3 -> {
                            milk.Lower_Price()
                        }
                        4 -> {
                            milk.Info()
                        }
                        else ->
                        {
                            println("Неверно выбрано действие")
                        }
                    }
                    print("Введите количество: ")
                    milk.amount = readln().toInt()
                    milk.GetPrice()
                } while (true)
            }
            3 ->
            {
                do {
                    bread.Info()
                    println("-------------------------------------------------------------------------------------")
                    println("1 - Белый\n2 - Чёрный\n3 - Понизить имерение веса товара\n4 - Товар испортился\n5 - Скидка\n6 - Информация")
                    println("-------------------------------------------------------------------------------------")
                    print("Выберите функцию: ")
                    when (readln().toInt()) {
                        1 -> {
                            bread.SelectWhite()
                        }

                        2 -> {
                            bread.SelectBlack()
                        }
                        3 -> {
                            bread.LowerWeightType()
                        }
                        4 -> {
                            bread.Gone_bad()
                        }
                        5 -> {
                            bread.Lower_Price()
                        }
                        6 ->
                        {
                            bread.Info()
                        }
                        else ->
                        {
                            println("Неверно выбрано действие")
                        }
                    }
                    print("Введите количество: ")
                    bread.amount = readln().toInt()
                    bread.GetPrice()
                } while (true)
            }
        }
    }
    catch (e:Exception)
    {
        println("Неверный формат ввода")
    }
}