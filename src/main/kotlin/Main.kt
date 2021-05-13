fun main(){
fun calculate(cardType : String,allSum: Int,sum:Int){
    var comission=0.0
    when (cardType){
        "Maestro","Mastercard" -> {
            if (sum in 0..75000){
                println("Ваша комиссия 0 рублей")
            } else {
                comission =sum*0.006*100+2000
                println("Ваша комиссия $comission копеек")
            }
        }
        "Visa","Мир" -> {
            comission=sum*0.0075

            if (comission<3500){
                println("Комиссия будет 35 рублей")
            } else {
                println("Комиссия будет $comission копеек")
            }
        }
        "VK Pay" -> {
            println("У вас нет комиссии, поздравляем")
        }
    }
}
calculate("Mastercard",0,100000)




}