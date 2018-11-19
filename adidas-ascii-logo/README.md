# adidas ASCII logo

This challenge consists of implementing a function which, with the width of the stripe, returns the adidas logo using `@` character.

_Extra:_ the goal is not only to return the adidas logo, but implementing the function with the less number of characters possible.

## Requirements

It has to satisfy the next requirements:

- The function accepts a number which is the width of on of the three adidas brand logo stripes.
   - The minimun width is `2`.
   - With less than `2` of width, the function throws the exception: `Error, minimun width is 2`.
- The function returns a string with at signs, whitespaces and new line characters.
   - Allowed characters: `@`, ` `, `\n`.
- The height of smallest stripe, one one on the left side, is the rounded value of the square root of the stripe width.
- The height of the other columns is the height of the column on its left plus the size of the smallest stripe.
- The space between two stripes is the rounded value of the square root of the stripe width.
- From the bottom to the top, the first at sign of the next line starts one screen column less than the previous line.
- The upper line of the smallest stripe starts with an at sign on the first screen column, without any other character on its left.

## Implementation

This repository has several folders, each folder name is an available language to solve the challenge.

Each folder has its own instructions, a main file with the function to be implemented and all the necessary files to test the function.

## Example

```
// Width 3 (step: 1)
// ---------------------------------

      @@@
   @@@ @@@
@@@ @@@ @@@

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
