function euclidean(a, b) {
  while (b !== 0) {
    [a, b] = [b, a % b];
  }
  return a;
}

console.log(euclidean(process.argv[2], process.argv[3]));
