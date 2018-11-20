import { createAdidasAsciiLogo } from './src/adidas-ascii-logo';

[ 2, 3, 4, 9, 16 ].forEach((width) => {
  process.stdout.write(`\nadidas (width ${ width })`);
  process.stdout.write('\n-------------------------------------------------------------');
  process.stdout.write(`\n${ createAdidasAsciiLogo(width) }\n\n`);
});
