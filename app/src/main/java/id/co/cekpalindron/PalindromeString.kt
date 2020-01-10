internal class Palindrom {
    private fun palindrome(teks: String) {
        var poli = ""
        var maxT = teks.length
        for (i in 0 until teks.length) {
            val test1 = teks.substring(maxT - 1, maxT)
            maxT--
            poli += test1
        }
        if (teks == poli) {
            println("==== Text $teks adalah Palindrome =====")
        } else {
            println("==== Text $teks adalah Bukan Palindrome =====")
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            Palindrom().palindrome("kasur ini rusak")
        }
    }
}