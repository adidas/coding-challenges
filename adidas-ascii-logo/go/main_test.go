package main

import (
	"fmt"
	"strings"
	"testing"
)

type Pair struct {
	pass    bool
	message string
}

func trim(str string) string {
	return strings.TrimSpace(str)
}

func checkExpectations(result string, expected string) Pair {
	if expected != result {
		return Pair{false, fmt.Sprintf("Unexpected output %s, the expected is %s", result, expected)}
	}
	return Pair{true, ""}
}

func TestWidth2(t *testing.T) {
	expected := `    @@
  @@ @@
@@ @@ @@`
	result := createAdidasAsciiLogo(2)
	testResult := checkExpectations(result, expected)
	if !testResult.pass {
		t.Error(testResult.message)
	}
}

func TestWidth3(t *testing.T) {
	expected := `      @@@
       @@@
   @@@  @@@
    @@@  @@@
@@@  @@@  @@@
 @@@  @@@  @@@`
	result := createAdidasAsciiLogo(3)
	testResult := checkExpectations(result, expected)
	if !testResult.pass {
		t.Error(testResult.message)
	}
}

func TestWidth5(t *testing.T) {
	expected := `          @@@@@
           @@@@@
     @@@@@  @@@@@
      @@@@@  @@@@@
@@@@@  @@@@@  @@@@@
 @@@@@  @@@@@  @@@@@`

	result := createAdidasAsciiLogo(5)
	testResult := checkExpectations(result, expected)
	if !testResult.pass {
		t.Error(testResult.message)
	}
}

func TestWidth7(t *testing.T) {
	expected := `              @@@@@@@
               @@@@@@@
                @@@@@@@
       @@@@@@@   @@@@@@@
        @@@@@@@   @@@@@@@
         @@@@@@@   @@@@@@@
@@@@@@@   @@@@@@@   @@@@@@@
 @@@@@@@   @@@@@@@   @@@@@@@
  @@@@@@@   @@@@@@@   @@@@@@@`

	result := createAdidasAsciiLogo(7)
	testResult := checkExpectations(result, expected)
	if !testResult.pass {
		t.Error(testResult.message)
	}
}

func TestWidth9(t *testing.T) {
	expected := `                  @@@@@@@@@
                   @@@@@@@@@
                    @@@@@@@@@
         @@@@@@@@@   @@@@@@@@@
          @@@@@@@@@   @@@@@@@@@
           @@@@@@@@@   @@@@@@@@@
@@@@@@@@@   @@@@@@@@@   @@@@@@@@@
 @@@@@@@@@   @@@@@@@@@   @@@@@@@@@
  @@@@@@@@@   @@@@@@@@@   @@@@@@@@@`

	result := createAdidasAsciiLogo(9)
	testResult := checkExpectations(result, expected)
	if !testResult.pass {
		t.Error(testResult.message)
	}
}

func TestWidth16(t *testing.T) {
	expected := `                                @@@@@@@@@@@@@@@@
                                 @@@@@@@@@@@@@@@@
                                  @@@@@@@@@@@@@@@@
                                   @@@@@@@@@@@@@@@@
                @@@@@@@@@@@@@@@@    @@@@@@@@@@@@@@@@
                 @@@@@@@@@@@@@@@@    @@@@@@@@@@@@@@@@
                  @@@@@@@@@@@@@@@@    @@@@@@@@@@@@@@@@
                   @@@@@@@@@@@@@@@@    @@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@    @@@@@@@@@@@@@@@@    @@@@@@@@@@@@@@@@
 @@@@@@@@@@@@@@@@    @@@@@@@@@@@@@@@@    @@@@@@@@@@@@@@@@
  @@@@@@@@@@@@@@@@    @@@@@@@@@@@@@@@@    @@@@@@@@@@@@@@@@
   @@@@@@@@@@@@@@@@    @@@@@@@@@@@@@@@@    @@@@@@@@@@@@@@@@`

	result := createAdidasAsciiLogo(16)
	testResult := checkExpectations(result, expected)
	if !testResult.pass {
		t.Error(testResult.message)
	}
}

func TestWidth21(t *testing.T) {
	expected := `                                          @@@@@@@@@@@@@@@@@@@@@
                                           @@@@@@@@@@@@@@@@@@@@@
                                            @@@@@@@@@@@@@@@@@@@@@
                                             @@@@@@@@@@@@@@@@@@@@@
                                              @@@@@@@@@@@@@@@@@@@@@
                     @@@@@@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@@@@
                      @@@@@@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@@@@
                       @@@@@@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@@@@
                        @@@@@@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@@@@
                         @@@@@@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@@@@
 @@@@@@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@@@@
  @@@@@@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@@@@
   @@@@@@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@@@@
    @@@@@@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@@@@`

	result := createAdidasAsciiLogo(21)
	testResult := checkExpectations(result, expected)
	if !testResult.pass {
		t.Error(testResult.message)
	}
}
