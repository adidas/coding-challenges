# adidas ASCII logo

This challenge consists of implementing a function which, given the width of a stripe, returns the adidas three stripes logo using `@` character.

- Will you be able to find an ingenious solution?
- Will you be able to create a comprehensible algorithm with the least number of statements possible?

Check the [steps][steps] to work with this repository and start the challenge.

## Requirements

It has to satisfy the next requirements:

- The function accepts a number which is the width of each stripe in the adidas brand logo.
   - The minimum width is `2`.
   - With less than `2` of width, the function throws the exception: `Error, minimum width is 2`.
- The function returns a string with "at" (`@`), whitespace (` `) and new line (`\n`) characters.
- The height of smallest stripe, the one on the left side, is the rounded value of the square root of the stripe width.
- The height of the other stripes is the height of the stripe on its left plus the size of the smallest stripe.
- The space between two stripes is the rounded value of the square root of the stripe width.
- From the bottom to the top, the first "at" character of the next line starts one screen column less than the previous line.
- The upper line of the smallest stripe starts with an "at" character on the first screen column, without any other character on its left.

## Implementation

This repository has several folders, each folder name is an available language to solve the challenge.

Each folder has its own instructions, a main file with the function to be implemented and all the necessary files to test the function.

## Example

```
// Width 3 (step: 2)
// ---------------------------------

      @@@
       @@@
   @@@  @@@
    @@@  @@@
@@@  @@@  @@@
 @@@  @@@  @@@

// Width 9 (step: 3)
// ---------------------------------

                  @@@@@@@@@
                   @@@@@@@@@
                    @@@@@@@@@
         @@@@@@@@@   @@@@@@@@@
          @@@@@@@@@   @@@@@@@@@
           @@@@@@@@@   @@@@@@@@@
@@@@@@@@@   @@@@@@@@@   @@@@@@@@@
 @@@@@@@@@   @@@@@@@@@   @@@@@@@@@
  @@@@@@@@@   @@@@@@@@@   @@@@@@@@@
```

[**adidas**][adidas]

[adidas]: https://adidas.com/
[steps]: ../README.md#algorithms
