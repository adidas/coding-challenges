package main
import (
  "fmt"
  "testing"
)

func TestWidth2(t *testing.T) {

  expected := `
    @@
  @@ @@
@@ @@ @@
  `;
  result := createAdidasAsciiLogo(2)
  if expected != result {
    t.Error(fmt.Sprintf("Unexpected output %s, the expected is %s",result,expected))
  }
}
