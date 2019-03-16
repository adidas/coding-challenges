const createAdidasAsciiLogo = require('../../src/adidas-ascii-logo');

/**
 * Trims the given value.
 * @param {string} value - Value to be trimmed
 * @returns {string} Trimmed value.
 */
function trim(value) {
  return value.replace(/^\n|\s+$/g, '');
}

describe('adidas ASCII logo', () => {
  it('should throw and exception if the width is less than `2`', () => {
    expect(() => createAdidasAsciiLogo(1)).toThrowError('Error, minimum width is 2');
  });

  it('should return the adidas logo given a stripe width of `2`', () => {
    expect(createAdidasAsciiLogo(2)).toEqual(trim(`
    @@
  @@ @@
@@ @@ @@
    `));
  });

  it('should return the adidas logo given a stripe width of `3`', () => {
    expect(createAdidasAsciiLogo(3)).toEqual(trim(`
      @@@
       @@@
   @@@  @@@
    @@@  @@@
@@@  @@@  @@@
 @@@  @@@  @@@
    `));
  });

  it('should return the adidas logo given a stripe width of `5`', () => {
    expect(createAdidasAsciiLogo(5)).toEqual(trim(`
          @@@@@
           @@@@@
     @@@@@  @@@@@
      @@@@@  @@@@@
@@@@@  @@@@@  @@@@@
 @@@@@  @@@@@  @@@@@
    `));
  });

  it('should return the adidas logo given a stripe width of `7`', () => {
    expect(createAdidasAsciiLogo(7)).toEqual(trim(`
              @@@@@@@
               @@@@@@@
                @@@@@@@
       @@@@@@@   @@@@@@@
        @@@@@@@   @@@@@@@
         @@@@@@@   @@@@@@@
@@@@@@@   @@@@@@@   @@@@@@@
 @@@@@@@   @@@@@@@   @@@@@@@
  @@@@@@@   @@@@@@@   @@@@@@@
    `));
  });

  it('should return the adidas logo given a stripe width of `9`', () => {
    expect(createAdidasAsciiLogo(9)).toEqual(trim(`
                  @@@@@@@@@
                   @@@@@@@@@
                    @@@@@@@@@
         @@@@@@@@@   @@@@@@@@@
          @@@@@@@@@   @@@@@@@@@
           @@@@@@@@@   @@@@@@@@@
@@@@@@@@@   @@@@@@@@@   @@@@@@@@@
 @@@@@@@@@   @@@@@@@@@   @@@@@@@@@
  @@@@@@@@@   @@@@@@@@@   @@@@@@@@@
    `));
  });

  it('should return the adidas logo given a stripe width of `16`', () => {
    expect(createAdidasAsciiLogo(16)).toEqual(trim(`
                                @@@@@@@@@@@@@@@@
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
   @@@@@@@@@@@@@@@@    @@@@@@@@@@@@@@@@    @@@@@@@@@@@@@@@@
    `));
  });

  it('should return the adidas logo given a stripe width of `21`', () => {
    expect(createAdidasAsciiLogo(21)).toEqual(trim(`
                                          @@@@@@@@@@@@@@@@@@@@@
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
    @@@@@@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@@@@
    `));
  });
});
