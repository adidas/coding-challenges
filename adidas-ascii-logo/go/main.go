package main

import (
  "fmt"
)
func createAdidasAsciiLogo(width int) string {
  return fmt.Sprintf("%d",width)
}

func main(){

  widths := []int{2, 3, 5, 7, 9, 16, 21}

  for _, width := range widths {
    fmt.Println(fmt.Sprintf("\nadidas (width %d)",width))
    fmt.Println("\n-------------------------------------------------------------")
    fmt.Println(fmt.Sprintf("\n%s\n\n",createAdidasAsciiLogo(width)))
  }
}
