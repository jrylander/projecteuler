import org.scalatest.{Matchers, FlatSpec}

class EulerProblemsSpec extends FlatSpec with Matchers {
  behavior of "Euler Problems"

  it should "Find the sum of all the multiples of 3 or 5 below 1000" in {
    EulerProblems.problem1() should be (233168)
  }
}
