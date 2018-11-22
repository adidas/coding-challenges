
import ascii_lib

func main(){

  [ 2, 3, 4, 9, 16 ].forEach({ width in
      print("\nadidas (width \(width) })")
      print("\n-------------------------------------------------------------")
      print("\n\( ascii_lib.createAdidasAsciiLogo(width:width) )\n\n")
  })

}

main()
