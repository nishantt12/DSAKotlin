fun validate(pushed: IntArray, popped: IntArray): Boolean {

    val stack = ArrayDeque<Int>()
    var position = 0
    for (p in pushed) {
        stack.addFirst(p)
        while (!stack.isEmpty() && stack.first() == popped[position]) {
            stack.removeFirst()
            position++
        }
    }

    return stack.isEmpty()
}