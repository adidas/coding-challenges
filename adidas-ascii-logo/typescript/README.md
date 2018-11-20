# adidas ASCII logo: TypeScript

Implementation to resolve the [adidas ASCII logo challenge][adidas-ascii-logo] with TypeScript.

## Requirements and dependencies

[NodeJS/NPM][nodejs] are required to work with the repository.

## Installation and running

Install the dependendies:

```
npm install
```

### Testing

To be sure that the algorithm is correct, there are several tests to validate the requirements are met.

The test run with [Jest][jest] which is installed with the package [build-tools-typescript-jest][build-tools-typescript-jest]. The tests can run with watchers too.

```
npm run test
npm run test -- --watch
```

You can also check the code coverage in the console output and in the folder `test/results/unit/coverage`.

### Code linting

The [adidas coding guidelines][coding-guidelines] are checked using [TSLint][tslint] which comes with [build-tools-typescript][build-tools-typescript].

```
npm run lint
```

_Note:_ the source files are skipped due to the fact that the code optimizations could not satisfy the adidas coding guidelines.

## Running examples

The `index.ts` prints the adidas logo using the implemented `createAdidasAsciiLogo()` function with different width parameters:

```
npm run start
```

[adidas-ascii-logo]: ../README.md
[build-tools-typescript]: https://www.npmjs.com/package/build-tools-typescript
[build-tools-typescript-jest]: https://www.npmjs.com/package/build-tools-typescript-jest
[coding-guidelines]: https://github.com/adidas/adidas-contribution-guidelines/wiki/TypeScript-coding-guidelines
[jest]: https://jestjs.io/en/
[nodejs]: https://nodejs.org/
[tslint]: https://palantir.github.io/tslint/
