class SharedLoader(state: Int = 89) {
  def build(count: Int): Int = {
    var result = 0
    for (i <- 0 until count) {
      result += (state + i * 89) % 997
    }
    result
  }
}

object App extends App {
  println(new SharedLoader().build(89))
}
