import java.util.*

class WhenCase1 {
    companion object{
        @JvmStatic fun main(args : Array<String>){
            var a : Int
            var read = Scanner(System.`in`)
            a = read.nextInt()


            when(a){
                1 -> print("one")
                2 -> print("this is second case")
                3 -> {
                    println("multiple case invok")
                    println("in 3 case")
                }
                4,5,6 -> {
                    println("i m in 4,5,6 case")
                    println("multiple cases")
                }
                in 7..10  -> println("using range in 7 to 10 cases")
            }
        }
    }
}