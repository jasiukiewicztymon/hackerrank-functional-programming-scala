def f(delim:Int, arr:List[Int]):List[Int] = {
    arr.flatMap(a => if (a < delim) {Some(a)} else {None})
}
