import java.math.BigInteger

lazy val primes: Stream[BigInteger] = Stream.cons(BigInt(2).bigInteger, primes.map(_.nextProbablePrime))
val top = BigInt(2000000).bigInteger

primes.takeWhile(-1 == _.compareTo(top)).reduce(_.add(_))



