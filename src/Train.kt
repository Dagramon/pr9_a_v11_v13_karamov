open class Train(var number: Int, var destination: String, var days : Int, var arrive_time : String, var stop_time : String)
{
    open fun Info()
    {
        println("Номер поезда: $number\nПункт назначения: $destination\nДней: $days\nВремя прибытия: $arrive_time\nВремя остановки: $stop_time")
    }
    open fun Delay_arrival()
    {
        print("Введите новое время прибытия в формате **:** : ")
        var time = readln().toString()
        if (time.contains(':'))
        {
            arrive_time = time
        }
        else
        {
            println("Время введено неверно")
        }
    }
    open fun Change_destination()
    {
        print("Введите новый пункт назначения: ")
        destination = readln()
    }
    open fun Delay_days()
    {
        try
        {
            print("Сколько дней прибавить? : ")
            days += readln().toInt()
        }
        catch (e:Exception)
        {
            println("Неверный формат ввода")
        }
    }
    open fun Accident()
    {
        println("Поезд попал в аварию или сломался")
        arrive_time = "Неизвестно"
        stop_time = "Неизвестно"
    }
}