package code.name.monkey.toolbelt;

import android.os.RemoteException;
import android.util.Log;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject2;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;
import java.util.Random;

@RunWith(AndroidJUnit4.class)
public class UiAutomatorTest {
    private UiDevice mDevice;
    private int step = 0;
    private static final String APP_NAME = "RoyalJourney";
    private static final String appPackageName = "com.android.chrome";
    private static final int TIMEOUT = 5000;
    private int startX = 0;
    private int startY = 0;
    private int endX = 0;
    private int endY = 0;
    private static final int SWIPE_DURATION = 2000; // Duration of the swipe in milliseconds
    private static final int SWIPE_STEPS = 5; // Number of steps to perform the swipe
    private Random random;
    private int mWight;
    private int mHeight;

    @Before
    public void setUp() {
        random = new Random();
        mWight = mDevice.getDisplayWidth();
        mHeight = mDevice.getDisplayHeight();
        try {
            mDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
            mDevice.wakeUp();
        } catch (Exception e) {
            Log.d("MinhOke", "Exception: " + e.getMessage());
        }
    }


    @Test
    public void mainTest() {
//        wakeUpDevices();
        try {
//            mDevice.pressHome();
//            mDevice.executeShellCommand("am start -n com.android.chrome/com.google.android.apps.chrome.Main");
//            mDevice.wait(Until.hasObject(By.pkg(appPackageName).depth(0)), TIMEOUT);
//            // nhấn vào search box
//            UiObject2 uiObject2 = mDevice.findObject(By.res("com.android.chrome:id/search_box_text"));
//            if (uiObject2 != null) {
//                uiObject2.click();
//                sleep(500);
//            }
//            // set text lên search box
//            uiObject2 = mDevice.findObject(By.res("com.android.chrome:id/url_bar"));
//            uiObject2.setText("amazon tool belt");
//            sleep(500);
//            mDevice.pressKeyCode(KeyEvent.KEYCODE_ENTER);
//
//            sleep(500);
//            uiObject2 = mDevice.findObject(By.desc("Amazon.com https://www.amazon.com › tool-belt Tool Belt"));
//            if (uiObject2 != null) {
//                uiObject2.click();
//            } else {
//                boolean found = false;
//                while (!found) {
//                    mDevice.swipe(startX, startY, endX, endY, 500);
//                    uiObject2 = mDevice.findObject(By.desc("Amazon.com https://www.amazon.com › tool-belt Tool Belt"));
//                    if (uiObject2 != null) {
//                        uiObject2.click();
//                        found = true;
//                    }
//                }
//            }
//            sleep(500);
//
//            /// đoạn này bắt đầu phải fake thao tác người dùng
//
//            uiObject2 = mDevice.findObject(By.text("VEVOR 13 Pockets Tool Belt, Adjusts from 29 Inches to 54 Inches, Leather Heavy Duty Tool Pouch Bag with Dual Hammer Loops, Tool Bag for Electrician, Carpenter, Handyman, Construction, Framer, Brown"));
//            if (uiObject2 != null) {
//                uiObject2.click();
//            } else {
//                boolean found = false;
//                while (!found) {
//                    mDevice.swipe(startX, startY, endX, endY, 500);
//                    uiObject2 = mDevice.findObject(By.text("VEVOR 13 Pockets Tool Belt, Adjusts from 29 Inches to 54 Inches, Leather Heavy Duty Tool Pouch Bag with Dual Hammer Loops, Tool Bag for Electrician, Carpenter, Handyman, Construction, Framer, Brown"));
//                    if (uiObject2 != null) {
//                        uiObject2.click();
//                        found = true;
//                    }
//                }
//            }
//            sleep();
            int displayWidth = mDevice.getDisplayWidth();
            int displayHeight = mDevice.getDisplayHeight();

            // Calculate the start and end points of the swipe
            int startX = displayWidth / 2;
            int startY = (int) (displayHeight * 0.75); // Start at 75% of the screen height
            int endX = startX;
            int endY = (int) (displayHeight * 0.25); // End at 25% of the screen height

//            // Perform the swipe action
//            mDevice.swipe(673, 1727, 993, 897, SWIPE_STEPS);
//            sleep(SWIPE_DURATION);
//            mDevice.click(768, 1335);
//
//            mDevice.swipe(673, 1727, 993, 897, SWIPE_STEPS);
//            sleep(SWIPE_DURATION);
//            mDevice.click(768, 1335);
//
//            // onScroll sequences
//            performSwipe(244, 1216, 254, 1265);
//            performSwipe(244, 1216, 272, 1305);
//            performSwipe(244, 1216, 290, 1360);
//            performSwipe(244, 1216, 302, 1415);
//            performSwipe(244, 1216, 311, 1477);
//            performSwipe(244, 1216, 323, 1548);
//            performSwipe(244, 1216, 341, 1621);
//            performSwipe(244, 1216, 352, 1687);
//            performSwipe(244, 1216, 366, 1755);
//            performSwipe(244, 1216, 368, 1809);
//
//            // onFling
//            performSwipe(244, 1216, 368, 1809); // Assuming fling is a fast swipe
//
//            // Second onDown
//            mDevice.click(523, 1796);
//
//            // onSingleTapUp
//            mDevice.click(519, 1792);

            scripRightHand();

            // Wait for the swipe to complete
//            mDevice.click(startX, startY);
        } catch (Exception e) {
            Log.e("Minhoke", "Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void scripRightHand() {
        Log.e("Minhoke", "Hight: " + mDevice.getDisplayHeight());
        Log.e("Minhoke", "wight: " + mDevice.getDisplayWidth());
        // vuốt nhanh sang trái đ
        performSwipe(618, 1521, 846, 996, 5, 1000); // vuốt lên nhanh phải
        mDevice.click(752, 1059);
        sleep(1000);
//        performSwipe(606, 1609, 819, 1052, 20, 1000); //vuốt lên chậm phải
        performSwipe(827, 1083, 754, 1400, 200, 500); //vuốt xống chậm phải
        performSwipe(827, 1083, 754, 1500, 300, 0); //vuốt xống chậm phải


        performSwipe(606, 1767, 857, 1091, 20, 1200); // vuốt  xuống chậm phải

    }

    private void performLongPress(int x, int y) {
        mDevice.swipe(x, y, x, y, SWIPE_STEPS); // Simulate long press by swiping to the same point
        sleep(SWIPE_DURATION);
    }

    private void performShowPress(int x, int y) {
        mDevice.swipe(x, y, x, y, SWIPE_STEPS); // Simulate show press by swiping to the same point
        sleep(SWIPE_DURATION); // Shorter duration than long press
    }

    private void performSwipe(double startX, double startY, double endX, double endY, int swipeSteps, int swipeDuration) {
        mDevice.swipe((int) startX, (int) startY, (int) endX, (int) endY, swipeSteps);
        sleep(swipeDuration);
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

    private int getRandomInRange(int min, int max) {
        return min + (max - min) * random.nextInt();
    }

    public static void main(String[] args) {
        UiAutomatorTest uiAutomatorTest = new UiAutomatorTest();
        System.out.println("total : " + uiAutomatorTest.getRandomInRange(uiAutomatorTest));
    }

}
