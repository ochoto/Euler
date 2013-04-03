def isPalindrome(n: Int) = {
  val s = n.toString
  s.reverse == s
}

val test = isPalindrome(91 * 99)

val result = (for {
  a <- 999 until 99 by -1
  b <- 999 until 99 by -1
  if(isPalindrome(a*b))
} yield (a*b,a,b) ).max









