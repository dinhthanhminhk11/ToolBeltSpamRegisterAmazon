package code.name.monkey.toolbelt;

import android.os.RemoteException;
import android.util.Log;
import android.view.KeyEvent;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject2;
import androidx.test.uiautomator.Until;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

@RunWith(AndroidJUnit4.class)
public class UiAutomatorTest {
    private UiDevice mDevice;
    private int step = 0;
    private static final String APP_NAME = "RoyalJourney";
    private static final String appPackageName = "com.android.chrome";
    private static final int TIMEOUT = 5000;
    private int startX =0;
    private int startY = 0;
    private int endX = 0;
    private int endY = 0;

    @Before
    public void setUp() {
        try {
            mDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
            mDevice.wakeUp();
        } catch (Exception e) {
            Log.d("MinhOke", "Exception: " + e.getMessage());
        }

        startX = mDevice.getDisplayWidth() / 2;
        startY = (int) (mDevice.getDisplayHeight() * 0.8);
        endX = startX;
        endY = (int) (mDevice.getDisplayHeight() * 0.2);
    }


    @Test
    public void mainTest() {
        wakeUpDevices();
        try {
            mDevice.pressHome();
            mDevice.executeShellCommand("am start -n com.android.chrome/com.google.android.apps.chrome.Main");
            mDevice.wait(Until.hasObject(By.pkg(appPackageName).depth(0)), TIMEOUT);
            // nhấn vào search box
            UiObject2 uiObject2 = mDevice.findObject(By.res("com.android.chrome:id/search_box_text"));
            if (uiObject2 != null) {
                uiObject2.click();
                sleep(500);
            }
            // set text lên search box
            uiObject2 = mDevice.findObject(By.res("com.android.chrome:id/url_bar"));
            uiObject2.setText("amazon tool belt");
            sleep(500);
            mDevice.pressKeyCode(KeyEvent.KEYCODE_ENTER);

            sleep(500);
            uiObject2 = mDevice.findObject(By.desc("Amazon.com https://www.amazon.com › tool-belt Tool Belt"));
            if (uiObject2 != null) {
                uiObject2.click();
            } else {
                boolean found = false;
                while (!found) {
                    mDevice.swipe(startX, startY, endX, endY, 500);
                    uiObject2 = mDevice.findObject(By.desc("Amazon.com https://www.amazon.com › tool-belt Tool Belt"));
                    if (uiObject2 != null) {
                        uiObject2.click();
                        found = true;
                    }
                }
            }
            sleep(500);

            uiObject2 = mDevice.findObject(By.text("VEVOR 13 Pockets Tool Belt, Adjusts from 29 Inches to 54 Inches, Leather Heavy Duty Tool Pouch Bag with Dual Hammer Loops, Tool Bag for Electrician, Carpenter, Handyman, Construction, Framer, Brown"));
            if (uiObject2 != null) {
                uiObject2.click();
            } else {
                boolean found = false;
                while (!found) {
                    mDevice.swipe(startX, startY, endX, endY, 500);
                    uiObject2 = mDevice.findObject(By.text("VEVOR 13 Pockets Tool Belt, Adjusts from 29 Inches to 54 Inches, Leather Heavy Duty Tool Pouch Bag with Dual Hammer Loops, Tool Bag for Electrician, Carpenter, Handyman, Construction, Framer, Brown"));
                    if (uiObject2 != null) {
                        uiObject2.click();
                        found = true;
                    }
                }
            }
            sleep();
            mDevice.swipe(startX, startY, endX, endY, 500);

        } catch (Exception e) {
            Log.e("Minhoke", "Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void wakeUpDevices() {
        try {
            if (!mDevice.isScreenOn()) {
                mDevice.wakeUp();
            }
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
        mDevice.pressHome();
    }

    public void checkView() {
        Log.d("Minhoke", "processView: " + step);
        try {
            List<UiObject2> listView = mDevice.findObjects(By.enabled(true));
            Log.d("Minhoke", "----------------------View-------------------------");
            Log.d("Minhoke", "list: " + listView.size());
            for (int i = 0; i < listView.size(); i++) {
                UiObject2 view = listView.get(i);
                Log.d("Minhoke", i + " ClassName: " + view.getClassName());
                Log.d("Minhoke", i + " getResourceName: " + view.getResourceName());
                Log.d("Minhoke", i + " getText: " + view.getText());
                Log.d("Minhoke", i + " getContentDescription: " + view.getContentDescription());
                Log.d("Minhoke", i + " getVisibleBounds: " + view.getVisibleBounds());
                Log.d("Minhoke", "-----------------------------------------------\n");
            }

        } catch (Exception e) {
            Log.d("Minhoke", "Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void sleep() {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {

        }
    }

    public void sleep(long time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {

        }
    }
}
