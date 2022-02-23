object Solution {
    def main(args: Array[String]) {
        var str:String = scala.io.StdIn.readLine() 
        var out:String = ""
        var count:Int = 0
        for (i <- 0 until str.length() - 1) {
            if (str.charAt(i) == str.charAt(i + 1)) { 
                count += 1
            }
            else {
                out += str.charAt(i)
                if (count != 0)
                    out += (count + 1).toString
                count = 0
            }
        }
        out += str.charAt(str.length() - 1)
        if (count != 0)
            out += (count + 1).toString
        println(out)
    }
}
