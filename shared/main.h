typedef struct DrivingLicense
{
    const char* firstName;
    const char* lastName;
}DrivingLicense;

#ifdef __cplusplus
extern "C" {
#endif
    
    const char* hello();
    DrivingLicense parseDrivingLicense();

#ifdef __cplusplus
}
#endif
