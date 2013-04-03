
val divisors = 2 to 20

val result = (
  for {
    n <- 2520 to Int.MaxValue
    if ( divisors.forall( n % _ == 0) )
  } yield (n) ).head

 println("Resultado: " + resultado)


