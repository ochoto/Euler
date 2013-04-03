for {
  a <- 1 to 1000
  b <- 1 to 1000
  c <- 1 to 1000
  if a < b
  if b < c
  if a + b + c == 1000
  if a*a + b*b == c*c
} yield a*b*c


