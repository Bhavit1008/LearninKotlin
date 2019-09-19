class Looping {
    companion object{
        @JvmStatic fun main(args:Array<String>){
            var arr = arrayOf<Int>(1,2,4,7,5,9,8,6,3)


            //definig for loop
            for(i in arr){
                println(i)
            }


            //defining for loop in range
            for (i in 1..10) println(i)

            var i:Int=0


            //defining while loop
            while(i<=5){
                print(" $i")
                i++
            }

            print("\n")

            //accessing array elements via loop using index
            var marks = arrayOf(94,75,85,95,74,85,76,84)
            for(i in marks.indices){
                print(marks[i])
            }
        }
    }
}