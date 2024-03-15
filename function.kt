fun greet(name: String) {
    println("Hello, $name!")
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    greet("Alice")
    val result = add(3, 5)
    println("Addition result: $result")
}
