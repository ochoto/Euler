for {
  a <- 1 to 1000
  b <- a+1 to 1000
  c <- b+1 to 1000
  if a + b + c == 1000
  if a*a + b*b == c*c
} yield a*b*c


