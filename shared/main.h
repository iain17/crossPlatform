typedef struct DrivingLicense
{
    const char* firstName;
    const char* lastName;
}DrivingLicense;

#include <stdio.h>
#include <sys/types.h>
#include <stdbool.h>
//#include "asn/Rectangle.h"
#include <Rectangle.h>

#ifdef __cplusplus
extern "C" {
#endif
    
    const char* hello();
    DrivingLicense parseDrivingLicense();
    size_t testEncode(void *buffer, size_t buffer_size);
    bool testDecode(Rectangle_t* rectangle, void *buffer, size_t buffer_size);

#ifdef __cplusplus
}
#endif
