object EulerProblems {
  def problem1(): Int = {
    (1 to 999).filter(i => i % 3 == 0 || i % 5 == 0).sum
  }


  def fib(n: Int): Int = {
    if (n == 0) 0
    else if (n == 1) 1
    else fib(n-1) + fib(n-2)
  }
  def problem2(): Int = {
    0
  }
}
