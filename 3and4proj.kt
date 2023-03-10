fun main(){


    fun task1(){
        var a = readLine()!!.toInt()
        var b = readLine()!!.toInt()
    var max1 =0
    var min1=0
        if(a<b){

            for (i in a..b ){
                println(i*i*i)}}
        else{
            for (i in a downTo  b ){
                println(i*i*i)}}


    }
 //   task1()


    fun task2(){
        var fib1=0
        var fib2=1
        var fib=0
        var d=readLine()!!.toInt()
        for (i in 0..d){
             fib=fib1+fib2
        fib1=fib2
        fib2=fib
        println(fib2)
        }

    }
// task2()

    fun task3(){
    var a= readLine()!!.toInt()
        var b=0
        while (a != 0) {
            val c = a % 10
            b = b * 10 + c
            a /= 10

        }
        println(b)
    }
//    task3()
    fun task4(){
        var a= readLine()!!.toString().split("")
    var b = readLine()!!.toString()
    a -=listOf("$b")
    println(a.joinToString(separator = ""))

    }

//   task4()

    fun task5(){
        var a = readLine()!!.toInt()
        var d = 0
    while(a!=1){
        if (a%2==0){
             d= a/2
        }
        else{
             d = (a*3+1)/2
        }
        a=d
        println(d)
    }
    }
//task5()
    fun task6(){
        var s = readLine()!!.toInt()
        var n = readLine()!!.toInt()


        for (a in 0..9) {
            for (b in 0..9) {
                for (c in 0..9) {
                    if (a + b + c == s){
                        println("$a $b $c")}
                }
            }
        }
    }
//task6()

fun task7(){


    var a= 1
    while (a==1){

        println("Введите 1 число и нажмите Enter")
    var x = readLine()!!.toInt()
        println("Введите знак и нажмите Enter")
    var z =readLine()!!.toString()
        println("Введите 2 число и нажмите Enter")
    var y = readLine()!!.toInt()
        fun podelim(){
            if (y!=0)
                println (x/y)
            else
                println("На ноль не делим!! (╯°□°）╯︵ ┻━┻")
        }
    when (z){
        "*" -> println(x*y)
        "/" -> podelim()
        "+" -> println(x+y)
        "-" -> println(x-y)
        else -> println("Вводи норм знаки, ( ◥◣_◢◤ )")

    }
        println("Введите 1, чтобы продолжить, либо 0, чтобы завершить программу")
        a= readLine()!!.toInt()
    }

}
//task7()
}
//-> можно вставить функцию, также можно поставить while (a!=))


