fun main()
{
    try
    {
        var train = Train(123, "Воронеж", 3, "18:00", "12:00")
        var cargo_train = CargoTrain(123, "Воронеж", 4, "22:00", "15:00", 500)
        var pass_train = PassengerTrain(123, "Москва", 2, "20:00", "10:00", 100)
        println("1 - Поезд\n2 - Грузовой поезд\n3 - Пассажирский Поезд")
        print("Выберите поезд: ")
        when (readln().toInt()) {
            1 -> {
                train.Info()
                do {
                    println("1 - Отложить прибытие\n2 - Показать время прибытия\n3 - Отложить день прибытия\n4 - Поезд повреждён\n5 - Информация о поезде")
                    print("Выберите действие: ")
                    when (readln().toInt()) {
                        1 -> {
                            train.Delay_arrival()
                        }
                        2 -> {
                            train.Arrival()
                        }
                        3 ->
                        {
                            train.Delay_days()
                        }
                        4 ->
                        {
                            train.Accident()
                        }
                        5 ->
                        {
                            train.Info()
                        }
                        else ->
                        {
                            println("Неверно выбрана функция")
                        }
                    }
                } while (true)
            }
            2 -> {
                cargo_train.Info()
                do {
                    println("1 - Отложить прибытие\n2 - Показать время прибытия\n3 - Отложить день прибытия\n4 - Поезд повреждён\n5 - Информация о поезде\n6 - Прибавить груз")
                    print("Выберите действие: ")
                    when (readln().toInt()) {
                        1 -> {
                            cargo_train.Delay_arrival()
                        }
                        2 -> {
                            cargo_train.Arrival()
                        }
                        3 ->
                        {
                            cargo_train.Delay_days()
                        }
                        4 ->
                        {
                            cargo_train.Accident()
                        }
                        5 ->
                        {
                            cargo_train.Info()
                        }
                        6 ->
                        {
                            cargo_train.Add_cargo()
                        }
                        else ->
                        {
                            println("Неверно выбрана функция")
                        }
                    }
                } while (true)
            }
            3 -> {
                pass_train.Info()
                do {
                    println("1 - Отложить прибытие\n2 - Показать время прибытия\n3 - Отложить день прибытия\n4 - Поезд повреждён\n5 - Информация о поезде\n6 - Прибавить пассажиров")
                    print("Выберите действие: ")
                    when (readln().toInt()) {
                        1 -> {
                            pass_train.Delay_arrival()
                        }
                        2 -> {
                            pass_train.Arrival()
                        }
                        3 ->
                        {
                            pass_train.Delay_days()
                        }
                        4 ->
                        {
                            pass_train.Accident()
                        }
                        5 ->
                        {
                            pass_train.Info()
                        }
                        6 ->
                        {
                            pass_train.Add_pasengers()
                        }
                        else ->
                        {
                            println("Неверно выбрана функция")
                        }
                    }
                } while (true)
            }
            else ->
            {
                println("Неверно выбрано число")
            }
        }
    }
    catch (e:Exception)
    {
        println("Неверный формат данных")
    }
}