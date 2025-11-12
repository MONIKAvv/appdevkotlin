fun main(){
    var i = 1
//    while(i <= 10){
//        println("Hello World!")
//        i++
//    }

    val num = 5
//    while(i <= 10){
//        println("$num * $i = ${num*i}")
//        i++
//    }

    var j = 10
//    do {
//        println(j)
//        j--
//    }while (j >= 1)

    for (k in 1..100) {

        if(k%2==0){
//            print(k)
        }
    }
//range operator uses
//    for (l in 100 downTo  1 step 2) println(l)

    for(i in 1..20){
        if(i == 2 || i ==9)continue
        else println("iphone $i ")
        if(i == 18) break
    }

}