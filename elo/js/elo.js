const k = 10; //controls sensitivity of changes
const deno = 400;//controls how severley differences of elo are weighted in expected

export function expected(ratingA, ratingB) {
  const exp = (ratingA - ratingB) / deno;
  return 1 / (1 + Math.pow(10, exp));
}

export function deltaElo(outcome, expected) {
  return k * (outcome - expected);
}

