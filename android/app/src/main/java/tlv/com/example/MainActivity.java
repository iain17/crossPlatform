package tlv.com.example;

import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.nio.ByteBuffer;

public class MainActivity extends AppCompatActivity {

    public static String byteArrayToHex(byte[] a) {
        StringBuilder sb = new StringBuilder(a.length * 2);
        for(byte b: a)
            sb.append(String.format("%02x", b));
        return sb.toString();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            String test = Shared.INSTANCE.hello();
            Log.d("Experiment", "Hello is: " + test);

            Shared.DrivingLicense license = Shared.INSTANCE.parseDrivingLicense();
            Log.d("Experiment", "First name on license is: " + license.firstName);

            int size = 128;
            ByteBuffer data = ByteBuffer.allocate(size);
            data.position(0);
            size = Shared.INSTANCE.testEncode(data, size);
            Log.d("Experiment",byteArrayToHex(data.array()));

            Shared.Rectangle rectangle = new Shared.Rectangle();
            Shared.INSTANCE.testDecode(rectangle, data, size);

            Log.d("Experiment", String.format("rectangle width: %d, height: %d", rectangle.width.intValue(), rectangle.height.intValue()));

            Log.d("Experiment", "done");
        } catch (UnsatisfiedLinkError e) {
            System.out.println("Exception" + e);
        }

    }
}
