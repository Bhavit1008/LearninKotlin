import java.util.*

class IfElse {
    companion object{
        @JvmStatic fun main(args:Array<String>){

            println(findGreater())
            userInput(5)
        }


        fun userInput(arg1:Int):Int{
            var res:Int =0
            var read  = Scanner(System.`in`)
            var `class`:Int =110
            print(`class`)
            return res
        }


        fun findGreater():Int
        {
            var res:Int
            var a :Int = 0
            var b :Int = 0
            var read = Scanner(System.`in`)
            println("enter the value of 'a' : ")
            a = read.nextInt()
            println("enter the value of 'b' : ")
            b = read.nextInt()
            res = if(a > b)
            {
                println("a = $a is greater than b = $b")
                a
            }
            else if(b > a){
                println("b = $b is greater than a = $a")
                b
            }
            else{
                println("a = $a is equal to b = $b")
                b
            }
            return res
        }
    }



}