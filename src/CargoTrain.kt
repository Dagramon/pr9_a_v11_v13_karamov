class CargoTrain(number : Int, destination: String, days : Int, arrive_time : String, stop_time : String, var cargo_weight : Int) : Train(number, destination, days, arrive_time, stop_time)
{
    override fun Info()
    {
        println("Номер поезда: $number\nПункт назначения: $destination\nДней: $days\nВремя прибытия: $arrive_time\nВремя остановки: $stop_time\nВес груза: $cargo_weight")
    }
    override fun Delay_days()
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
    override fun Accident()
    {
        println("Поезд попал в аварию или сломался\nВозможна потеря груза")
        arrive_time = "Неизвестно"
        stop_time = "Неизвестно"
    }
    fun Add_cargo()
    {
        try
        {
            print("Сколько груза прибавить? грузоподьёмность поезда не более 5000 кг : ")
            var number = readln().toInt()
            if (cargo_weight + number <= 5000)
            {
                cargo_weight += number
            }
            else
            {
                println("Поезд будет перегружен, груз не добавлен")
            }
        }
        catch (e:Exception)
        {
            println("Неверный формат ввода")
        }
    }
}