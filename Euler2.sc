lazy val fibo: Stream[BigInt] = BigInt(0) #:: BigInt(1) #:: fibo.zip(fibo.tail).map { n => n._1 + n._2 }
//fibo.take(10).toList
def isEven(n: BigInt) = n % 2 == 0

fibo.filter(
              isEven( _ )
     ).takeWhile(
              _ <= 4000000
     ).sum




