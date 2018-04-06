package tlv.com.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            String test = Shared.INSTANCE.hello();
            System.out.println("Hello is: " + test);

            Shared.DrivingLicense license = Shared.INSTANCE.parseDrivingLicense();
            System.out.println("First name on license is: " + license.firstName);
        } catch (UnsatisfiedLinkError e) {
            System.out.println("Exception" + e);
        }

    }
}
