def f(arr:List[Int]):List[Int] = {
    val l = scala.collection.mutable.ListBuffer.empty[Int]
    val range = arr.indices.filter { x => x%2!=0 }
    range.foreach { x => l += arr(x) }
    l.toList
}
