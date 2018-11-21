package main

import (
  "fmt"
)
func createAdidasAsciiLogo(width int) string {
  return fmt.Sprintf("%d",width)
}

func main(){
  fmt.Println(fmt.Sprintf("\nadidas (width %d)",2))
  fmt.Println("\n-------------------------------------------------------------")
  fmt.Println(fmt.Sprintf("\n%s\n\n",createAdidasAsciiLogo(2)))
}
