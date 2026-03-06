package main

import (
	"fmt"
)

func euclidean(a int, b int) int {
	for b != 0 {
		a, b = b, a%b
	}
	return a
}

func main() {
	fmt.Printf("%v", euclidean(47, 47))
}
