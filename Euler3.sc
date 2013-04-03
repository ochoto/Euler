def divides(d : BigInt, n : BigInt) = {
  (n % d) == 0
}

def ld(n : BigInt) : BigInt = {

  @scala.annotation.tailrec
  def ldtr(k : BigInt, n : BigInt) : BigInt = {
    if (divides(k, n)) k
    else if ((k*k) > n) n
    else ldtr((k+1), n)
  }

  ldtr(2, n)
}

def factors(n : BigInt) : List[BigInt] = {

  @scala.annotation.tailrec
  def factorstr(xs: List[BigInt], n: BigInt): List[BigInt] = {
    if (n == 1)
      xs
    else {
      val p = ld(n)
      factorstr(xs :+ p, n / p)
    }
  }

  factorstr(Nil, n)
}
def isPrime(n: BigInt) = ld(n) == n
val f = factors(BigInt("600851475143"))
val maxPrime = f.filter(isPrime(_)).last



val maxMultiple = (1 to 20).foldLeft(BigInt(1)){ (accu,elem) => accu * elem }
val minMultiple = factors(maxMultiple).toSet.foldLeft(BigInt(1)){ (accu,elem) => accu * elem }
//val m = factors(minMultiple)

def isDivisibleByRange(n: BigInt, r: Range) = {
  r.forall(n % _ == 0)
}

//println("calculando!")
//val result = (minMultiple to Int.MaxValue).filter(isDivisibleByRange(_, 1 to 20)).head
//println(result)

//Range.BigInt("1","2432902008176640000",1)

/*
def longRange(from: Long, to: Long) = new Iterator[Long] {
  private var i = from
  def hasNext = i < to
  def next = {val r = i; i += 1; r}
}
val result = longRange(minMultiple.toLong, maxMultiple.toLong).filter(isDivisibleByRange(_, 1 to 20)).head
*/

