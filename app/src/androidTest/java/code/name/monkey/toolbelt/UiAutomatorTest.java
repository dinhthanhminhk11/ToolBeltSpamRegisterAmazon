package code.name.monkey.toolbelt;

import android.graphics.Point;
import android.graphics.Rect;
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

import java.util.ArrayList;
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
    private int displayWidth;
    private int displayHeight;

    private int capcheStartX = 0;
    private int capcheStatY = 0;
    private int safeDistance = 150;
    @Before
    public void setUp() {
        random = new Random();
        try {
            mDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
            mDevice.wakeUp();
        } catch (Exception e) {
            Log.d("MinhOke", "Exception: " + e.getMessage());
        }
        displayWidth = mDevice.getDisplayWidth();
        displayHeight = mDevice.getDisplayHeight();
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

    // kịch bản 1 vốt châm
    private void scripRightHand() {
        performSwipeUpHasSteps(300, true);
        sleep(1000);
        performSwipeUpHasSteps(200, true);
        sleep(1000);
        performSwipeUpHasSteps(250, true);
        sleep(1000);
        performSwipeUpHasSteps(300, true);
        sleep(1000);
        performSwipeUpHasSteps(200, true);
        sleep(1000);
        performSwipeUpHasSteps(250, true);
        sleep(1000);
        performSwipeDownHasSteps(250, true);
        sleep(1000);
        performSwipeDownHasSteps(230, true);
        sleep(1000);
        performSwipeUp(true, true);
        sleep(1000);
        performSwipeDown(true, true);
    }


    //
    public void performSwipeDown(boolean isFast, boolean isRightHand) {
        Point startPoint = getRandomPoint(displayWidth, displayHeight, false, isRightHand);
        Point endPoint = getRandomEndPoint(displayWidth, displayHeight, startPoint, false, isRightHand);
        int steps = isFast ? getRandomSteps(1, 15) : getRandomSteps(35, 50);
        Rect navigationBarRect = getNavigationBarRect();
        if (navigationBarRect.contains(endPoint.x, endPoint.y)) {
            endPoint.y = navigationBarRect.bottom + safeDistance;
        }
        mDevice.swipe(startPoint.x, startPoint.y, endPoint.x, endPoint.y, steps);
        if (isFast) {
            sleep(500);
            Point midPoint = getMidPoint(startPoint, endPoint);
            mDevice.click(midPoint.x, midPoint.y);
        }
    }

    public void performSwipeUp(boolean isFast, boolean isRightHand) {
        Point startPoint = getRandomPoint(displayWidth, displayHeight, true, isRightHand);
        Point endPoint = getRandomEndPoint(displayWidth, displayHeight, startPoint, true, isRightHand);
        int steps = isFast ? getRandomSteps(1, 15) : getRandomSteps(35, 50);
        Rect navigationBarRect = getNavigationBarRect();
        if (navigationBarRect.contains(startPoint.x, startPoint.y)) {
            startPoint.y = navigationBarRect.bottom + safeDistance;
        }
        mDevice.swipe(startPoint.x, startPoint.y, endPoint.x, endPoint.y, steps);
    }

    public void performSwipeUpHasSteps(int step, boolean isRightHand) {
        Point startPoint = getRandomPoint(displayWidth, displayHeight, true, isRightHand);
        Point endPoint = getRandomEndPoint(displayWidth, displayHeight, startPoint, true, isRightHand);
        Rect navigationBarRect = getNavigationBarRect();
        if (navigationBarRect.contains(startPoint.x, startPoint.y)) {
            startPoint.y = navigationBarRect.bottom + safeDistance;
        }
        mDevice.swipe(startPoint.x, startPoint.y, endPoint.x, endPoint.y, step);
    }

    public void performSwipeDownHasSteps(int step, boolean isRightHand) {
        Point startPoint = getRandomPoint(displayWidth, displayHeight, false, isRightHand);
        Point endPoint = getRandomEndPoint(displayWidth, displayHeight, startPoint, false, isRightHand);

        Rect navigationBarRect = getNavigationBarRect();
        if (navigationBarRect.contains(endPoint.x, endPoint.y)) {
            endPoint.y = navigationBarRect.bottom + safeDistance;
        }
        mDevice.swipe(startPoint.x, startPoint.y, endPoint.x, endPoint.y, step);
    }

    private Rect getNavigationBarRect() {
        Rect rect = new Rect(0, displayHeight - safeDistance, displayWidth, displayHeight);
        return rect;
    }

    private Point getMidPoint(Point startPoint, Point endPoint) {
        int midX = (startPoint.x + endPoint.x) / 2;
        int midY = (startPoint.y + endPoint.y) / 2;
        return new Point(midX, midY);
    }

    private int getRandomSteps(int min, int max) {
        return min + (int) (Math.random() * (max - min + 1));
    }

    private Point getRandomPoint(int width, int height, boolean isBottomHalf, boolean isRightHand) {
        int x = isRightHand ? (int) (width / 2 + Math.random() * (width / 2)) : (int) (Math.random() * (width / 2));
        int y = isBottomHalf ? (int) (height / 2 + Math.random() * (height / 2)) : (int) (Math.random() * (height / 2));
        return new Point(x, y);
    }

    private Point getRandomEndPoint(int width, int height, Point startPoint, boolean isSwipeUp, boolean isRightHand) {
        int x = isRightHand ? (int) (width / 2 + Math.random() * (width / 2)) : (int) (Math.random() * (width / 2));
        int maxSwipeDistance = (int) (height * 4 / 5);
        int minSwipeDistance = (int) (height / 5);
        int swipeDistance = minSwipeDistance + (int) (Math.random() * (maxSwipeDistance - minSwipeDistance));

        int y;
        if (isSwipeUp) {
            y = Math.max(startPoint.y - swipeDistance, 0);
        } else {
            y = Math.min(startPoint.y + swipeDistance, height);
        }
        return new Point(x, y);
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

    public static void main(String[] args) {
        UiAutomatorTest uiAutomatorTest = new UiAutomatorTest();
    }

}
