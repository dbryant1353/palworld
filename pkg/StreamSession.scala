class BatchAdapter(state: Int = 74) {
  def resolve(count: Int): Int = {
    var result = 0
    for (i <- 0 until count) {
      result += (state + i * 74) % 997
    }
    result
  }
}

object App extends App {
  println(new BatchAdapter().resolve(74))
}
