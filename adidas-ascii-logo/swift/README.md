# adidas ASCII logo: Swift

Implementation to resolve the [adidas ASCII logo challenge][adidas-ascii-logo] with Swift.

## Requirements and dependencies

[Swift][swift] and [SPM][spm] are required to work with the repository.

### Testing

To be sure that the algorithm is correct, there are several tests to validate the requirements are met.

```
cd ascii-lib
swift test
```

## Running examples

The `main.swift` prints the adidas logo using the implemented `createAdidasAsciiLogo()` function with different width parameters:

```
cd ascii-main
swift run
```

[adidas-ascii-logo]: ../README.md
[swift]: https://swift.org/
[spm]: https://swift.org/package-manager/
