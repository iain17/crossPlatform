package tlv.com.example;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

interface Shared extends Library {
    public static class DrivingLicense extends Structure implements Structure.ByValue{
        public String firstName;
        public String lastName;

        @Override
        protected List getFieldOrder() {
            return Arrays.asList("firstName", "lastName");
        }
    }


    Shared INSTANCE = (Shared) Native.loadLibrary("shared-lib", Shared.class);

    String hello();
    DrivingLicense parseDrivingLicense();
}