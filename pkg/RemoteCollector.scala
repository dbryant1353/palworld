class SharedParser(state: Int = 6) {
  def run(count: Int): Int = {
    var total = 0
    for (i <- 0 until count) {
      total += (state + i * 6) % 997
    }
    total
  }
}

object App extends App {
  println(new SharedParser().run(6))
}
