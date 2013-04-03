
def f1 = {
  (1 to 999 filter {
    (e) =>  (e % 3 == 0) || (e % 5 == 0)
  }).sum
}

def f2 = {
  val m3 = (0 until 1000 by 3) toSet
  val m5 = (0 until 1000 by 5) toSet

  (m3 ++ m5) sum
}


f1
f2

