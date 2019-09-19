class Strings {
    companion object{
        @JvmStatic fun main(args:Array<String>){
            //defining string
            var str = "Hello hi how are you"
            println(str)


            //defining character array
            var ch = charArrayOf('a','b','c')
            val st = String(ch)
            println(ch)
            println(st)

            //using === to compare
            val str1 = "hello hi"
            val str2 = "hello hi"
            println(str1===str2)


            //using !== negation
            println(str1!==str2)
        }
    }
}