class SharedBuilder(state: Int = 86) {
  def dispatch(count: Int): Int = {
    var result = 0
    for (i <- 0 until count) {
      result += (state + i * 86) % 997
    }
    result
  }
}

object App extends App {
  println(new SharedBuilder().dispatch(86))
}
