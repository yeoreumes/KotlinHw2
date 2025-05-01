package com.example.hw2.functions

fun toFahrenheit(degree: Double): Double{
    var fahrenheit= degree*1.8+32
    return fahrenheit
}

fun rectanglePerimeter(length: Int, width:Int): Int{
    return 2*(length+width)
}

fun factorial(number: Int): Int{
    var result=1
    for(i in 1..number){
        result*=i
    }
    return result
}

fun letterOccurence(input:String): Int{
    var counter=0
    for(letter in input){
        if(letter=='a')
            counter++
    }
    return counter
}

fun interiorAngleSum(sides: Int): Int {
    return (sides - 2) * 180
}

fun calculateSalary(daysWorked: Int): Int {
    val hoursWorked = daysWorked * 8
    return if (hoursWorked <= 160) {
        hoursWorked * 10
    } else {
        val regularPay = 160 * 10
        val overtimePay = (hoursWorked - 160) * 20
        regularPay + overtimePay
    }
}

fun quotaPrice(quotaInGB: Int): Int {
    return if (quotaInGB <= 50) {
        100
    } else {
        val extraGB = quotaInGB - 50
        100 + extraGB * 4
    }
}



fun main(){
    //fun1
    val celcius=25.0
    println("fahrenheit:" + toFahrenheit(celcius))

    //fun2
    val length=12
    val width=6
    val perimeter= rectanglePerimeter(length,width)
    println("perimeter: $perimeter")

    //fun3
    println("factorial: "+ factorial(5))

    //fun4
    val sentence="oh my god look that face"
     println("number of a:" + letterOccurence(sentence))

    //fun5
    println("Interior angle sum of hexagon: ${interiorAngleSum(6)} degrees")

    //fun6
    println("Salary for 22 work days: ${calculateSalary(22)} TL")

    //fun7
    println("Price for 55 GB quota: ${quotaPrice(55)} TL")


}