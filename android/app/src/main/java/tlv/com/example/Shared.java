package tlv.com.example;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.NativeLong;
import com.sun.jna.Structure;

import java.nio.ByteBuffer;
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

    public static class Rectangle extends Structure implements Structure.ByReference{
        public NativeLong width;
        public NativeLong height;

        @Override
        protected List getFieldOrder() {
            return Arrays.asList("width", "height");
        }
    }

    Shared INSTANCE = (Shared) Native.loadLibrary("shared-lib", Shared.class);

    String hello();
    DrivingLicense parseDrivingLicense();
    int testEncode(ByteBuffer bb, int size);
    boolean testDecode(Rectangle rectangle, ByteBuffer bb, int size);
}