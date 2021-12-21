object Solution extends App {
    def f(n: Int) {
        var i = 0;
        for (i <- 1 to n) {
            println("Hello World");
        }
    }

  var n = scala.io.StdIn.readInt
  f(n)
}
