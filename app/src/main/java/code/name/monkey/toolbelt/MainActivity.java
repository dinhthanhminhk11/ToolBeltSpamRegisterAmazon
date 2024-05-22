package code.name.monkey.toolbelt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener {
    private CustomRecyclerView listItem;
    private GestureDetector gestureDetector;
    private long swipeStartTime;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gestureDetector = new GestureDetector(this, this);
        listItem = findViewById(R.id.list_item);

        List<FakeData> data = new ArrayList<>();

        for (int i = 0; i < 200; i++) {
            data.add(new FakeData(
                    "Sản phẩm " + i,
                    "Mô tả sản phẩm " + i,
                    "https://example.com/image1.jpg"
            ));
        }

        FakeDataAdapter fakeDataAdapter = new FakeDataAdapter(data);

        listItem.setLayoutManager(new LinearLayoutManager(this));
        listItem.setAdapter(fakeDataAdapter);
        listItem.setGestureDetector(gestureDetector);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onDown(MotionEvent e) {
        Log.e("MinhFunc", "mDevice.click((int) "+ e.getX() +", (int)"+ e.getY()+");");
        Log.i("Gesture", "onDown: x=" + e.getX() + ", y=" + e.getY());

        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        Log.i("Gesture", "onShowPress: x=" + e.getX() + ", y=" + e.getY());

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        Log.e("MinhFunc", "mDevice.click((int) "  + e.getX() +", (int)"+ e.getY()+");");
        Log.i("Gesture", "onSingleTapUp: x=" + e.getX() + ", y=" + e.getY());

        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        Log.e("MinhFunc", "performSwipe(" + e1.getX() + ", " + e1.getY() + ", " + e2.getX() + ", " + e2.getY() + ");");
        Log.i("Gesture", "onScroll: start x=" + e1.getX() + ", start y=" + e1.getY() +
                ", end x=" + e2.getX() + ", end y=" + e2.getY() +
                ", distanceX=" + distanceX + ", distanceY=" + distanceY);

        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        Log.i("Gesture", "onLongPress: x=" + e.getX() + ", y=" + e.getY());
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        long swipeEndTime = System.currentTimeMillis(); // Lưu thời điểm kết thúc vuốt
        long swipeDuration = swipeEndTime - swipeStartTime; // Tính thời gian của sự kiện vuốt
        Log.i("Gesture", "onFling: start x=" + e1.getX() + ", start y=" + e1.getY() +
                ", end x=" + e2.getX() + ", end y=" + e2.getY() +
                ", velocityX=" + velocityX + ", velocityY=" + velocityY +
                ", swipe duration=" + swipeDuration + "ms");
        return true;
    }
}