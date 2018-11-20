# adidas ASCII logo: JavaScript

Implementation to resolve the [adidas ASCII logo challenge][adidas-ascii-logo] with JavaScript ES6+.

## Requirements and dependencies

[NodeJS/NPM][nodejs] are required to work with the repository.

## Installation and running

Install the dependendies:

```
npm install
```

### Testing

To be sure that the altorithm is correct, there are several tests to validate the requirements are met.

The test run with [Jest][jest] which is installed with the package [build-tools-jest][build-tools-jest]. The tests can run with watchers too.

```
npm run test
npm run test -- --watch
```

You can also check the code coverage in the console output and in the folder `test/results/unit/coverage`.

### Code linting

The [adidas coding guidelines][coding-guidelines] are checked using [ESLint][eslint] which comes with [build-tools-javascript][build-tools-javascript].

```
npm run lint
```

_Note:_ the source files are skipped due to the fact that the code optimizations could not satisfy the adidas coding guidelines.

## Running examples

The `index.js` prints the adidas logo using the implemented `createAdidasAsciiLogo()` function with different width parameters:

```
npm run start
```

[adidas-ascii-logo]: ../README.md
[build-tools-javascript]: https://www.npmjs.com/package/build-tools-javascript
[build-tools-jest]: https://www.npmjs.com/package/build-tools-jest
[coding-guidelines]: https://github.com/adidas/adidas-contribution-guidelines/wiki/JavaScript-coding-guidelines
[eslint]: https://eslint.org/
[jest]: https://jestjs.io/en/
[nodejs]: https://nodejs.org/
