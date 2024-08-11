fun checkInclusion(s1: String, s2: String): Boolean {

    val map = mutableMapOf<Char, Int>()

    for (char in s1.toCharArray()) {
        map[char] = map.getOrDefault(char, 0) + 1
    }

    var count = 0
    var prev: Char? = null

    for (char in s2.toCharArray()) {
        if (!map.contains(char)) {
            count = 0
        } else {
            val currentValue = map.getValue(char)
            if (currentValue == 0 && prev == char) {
                count = 1
            } else if (currentValue == 0) {
                continue
            } else {
                map[char] = currentValue - 1
                count++
            }
        }

        if (count == s1.length) {
            return true
        }
        prev = char
    }

    return false
}