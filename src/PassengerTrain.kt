class PassengerTrain(number : Int, destination: String, days : Int, arrive_time : String, stop_time : String, var passengers : Int) : Train(number, destination, days, arrive_time, stop_time)
{
    override fun Info()
    {
        println("Номер поезда: $number\nПункт назначения: $destination\nДней: $days\nВремя прибытия: $arrive_time\nВремя остановки: $stop_time\nКол-во пассажиров: $passengers")
    }
    override fun Delay_days()
    {
        try
        {
            print("Сколько дней прибавить? : ")
            var number = readln().toInt()
            days += number
            println("Придётся доплатить: " + number * 240 * passengers)
        }
        catch (e:Exception)
        {
            println("Неверный формат ввода")
        }
    }
    override fun Accident()
    {
        println("Поезд попал в аварию или сломался\nВозможны жертвы")
        arrive_time = "Неизвестно"
        stop_time = "Неизвестно"
    }
    fun Add_pasengers()
    {
        try
        {
            print("Сколько пассажиров прибавить? : ")
            var number = readln().toInt()
            passengers += number
        }
        catch (e:Exception)
        {
            println("Неверный формат ввода")
        }
    }
}