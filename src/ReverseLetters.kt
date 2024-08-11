object ReverseLetters {
    fun reverseOnlyCharacters(s: String): String {
        var left = 0;
        var right = s.length - 1;
        val charArray = s.toCharArray()
        while (left < right) {

            if (!charArray[left].isValidChar()) {
                left++
                continue
            }

            if (!charArray[right].isValidChar()) {
                right--
                continue
            }

            val temp = charArray[left]
            charArray[left] = charArray[right]
            charArray[right] = temp

            left++
            right--

        }

        return String(charArray)
    }

    private fun Char.isValidChar() = this in 'A'..'Z' || this in 'a'..'z'


}