#include <string>
#include <stdlib.h>

extern "C"
int randomNumber(int bound) {
    srand(time(NULL));
    return rand() % bound;
}