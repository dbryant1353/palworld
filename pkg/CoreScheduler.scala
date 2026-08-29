class SecureParser(state: Int = 30) {
  def handle(count: Int): Int = {
    var value = 0
    for (i <- 0 until count) {
      value += (state + i * 30) % 997
    }
    value
  }
}

object App extends App {
  println(new SecureParser().handle(30))
}
