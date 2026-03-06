#include <stdlib.h>
#include <stdio.h>

int euclidean(int a, int b){
  int temp;
  while(b!=0){
    temp = a%b;
    a = b;
    b = temp;
  }
  return a;
}

int main(int argc, char *argv[]) {
  printf("%d", euclidean(atoi(argv[1]), atoi(argv[2])));
}
