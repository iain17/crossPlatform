#include "main.h"

const char* hello() {
    return "Hi there :-)";
}

DrivingLicense parseDrivingLicense() {
    DrivingLicense license;
    license.firstName = "Iain";
    license.lastName = "Munro";
    return license;
}

bool testDecode(Rectangle_t* rectangle, void *buffer, size_t buffer_size) {
    Rectangle_t* rectangle2 = 0;
    asn_dec_rval_t rval = ber_decode(0, &asn_DEF_Rectangle, (void **)&rectangle2, buffer, buffer_size);
    *rectangle = *rectangle2;
    delete rectangle2;
    return rval.code == RC_OK;
}

size_t testEncode(void *buffer, size_t buffer_size) {
    Rectangle_t rectangle;
    rectangle.height = 42; /* any random value */
    rectangle.width = 23; /* any random value */
    asn_enc_rval_t rval;
    rval = der_encode_to_buffer(&asn_DEF_Rectangle, &rectangle, buffer, buffer_size);
    return rval.encoded;
}
