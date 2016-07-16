package qtx.compass;

import qtx.compass.GlobalData;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.GeomagneticField;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.TextView;



import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


/**
 * This class extends the SensorsActivity and is designed tie the CompassView
 * and Sensors together.
 *
 * @author Justin Wetherell <phishman3579@gmail.com>
 */
public class MainActivity extends Activity {

    private static final String TAG = "AndroidCompassActivity";

    private static WakeLock wakeLock = null;

    private static TextView text = null;
    private static View compassView = null;

    /**
     * {@inheritDoc}
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate()");

        setContentView(R.layout.activity_main);

    }
    public void getCompass(View view) {
        Intent intent = new Intent(this, CompassActivity.class);
        startActivity(intent);

    }
}
