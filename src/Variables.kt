class Variables {
    companion object{
        @JvmStatic fun main(args: Array<String>){
            val a1 = "bhavit"               //declaring variables
            val a2: Long = 7597917007
            myfun(a1,a2)                    //CALLING FUNCTIONS
            var g1 = "kanthalia"
            var g2:Long = 9079970210
            myfun(g1,g2)
        }
            //Defining user defined function body
        private fun myfun(g1: String, g2: Long) {
            println("My name is : $g1\nMy number is : $g2")
        }

    }
}