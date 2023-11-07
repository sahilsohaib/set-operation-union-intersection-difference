object SetOperations {
  def main(args: Array[String]): Unit = {
    val set1 = Set(1, 2, 3, 4, 5)
    val set2 = Set(4, 5, 6, 7, 8)

    println("Set 1: " + set1.mkString(", "))
    println("Set 2: " + set2.mkString(", "))

    val choice = getUserChoice()

    val result = choice match {
      case "1" => set1.union(set2) // Union
      case "2" => set1.intersect(set2) // Intersection
      case "3" => set1.diff(set2) // Difference
      case _ => Set.empty[Int]
    }

    println("Result: " + result.mkString(", "))
  }

  def getUserChoice(): String = {
    println("\nSet Operations:")
    println("1. Union")
    println("2. Intersection")
    println("3. Difference")

    print("Select an operation (1/2/3): ")
    scala.io.StdIn.readLine()
  }
}
