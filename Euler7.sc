// Ojo que nextProbablePrime podría dar un no primo, convendría comprobarlo mediante un filtro

lazy val primes: Stream[java.math.BigInteger] = Stream.cons(BigInt(2).bigInteger, primes.map(_.nextProbablePrime))
primes.take(10001).toList.last