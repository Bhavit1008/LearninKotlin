class Looping {
    companion object{
        @JvmStatic fun main(args:Array<String>){
            var arr = arrayOf<Int>(1,2,4,7,5,9,8,6,3)
            for(i in arr){
                println(i)
            }

            for (i in 1..10) println(i)

            var i:Int=0
            while(i<=5){
                print(" $i")
                i++
            }
        }
    }
}