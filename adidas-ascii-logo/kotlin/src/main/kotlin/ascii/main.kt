
package ascii


fun main(args: Array<String>) {

    arrayOf(2,3,5,7,9,16,21).forEach {
        print(createAdidasAsciiLogo(it))
        print("\nadidas (width $it)")
        print("\n-------------------------------------------------------------")
        print("\n${createAdidasAsciiLogo(it)}\n\n")
    }

}