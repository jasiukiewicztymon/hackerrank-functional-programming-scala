object Solution extends App {
    def f(num:Int) : List[Int] = {
        List.fill[Int](num)(0);
    }
    var readInt = scala.io.StdIn.readInt();
    println(f(readInt))
}
