package gl.com.session9customview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Region;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import java.util.LinkedList;
import java.util.Queue;

public class CustomView extends View {
//    private Paint paint;
//    public CustomView(Context context) {
//        super(context);
//        paint = new Paint();
//        paint.setColor(Color.GRAY);
//    }
//
//    @Override
//    protected void onDraw(Canvas canvas) {
//        canvas.drawColor(Color.BLUE);
//        canvas.drawCircle(200, 200, 100, paint);
//
//    }
private Paint mPaint;
    private ShapeDrawable mDrawable;
    private Bitmap mBitmap;

    private static String TAG = "MyView.class";

    public CustomView(Context context) {
        super(context);

        // create the Paint and set its color
        mPaint = new Paint();
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth((float) 5.5);
        mPaint.setColor(Color.BLACK);


    }

    @Override
    protected void onDraw(Canvas mCanvas) {
//        int width = mCanvas.getWidth();
//        int height = mCanvas.getHeight();
//
//        Log.d(TAG, "onDraw is Invoked" + width + "\t" + height);
//        /**
//         *@param: cx: X- co-ordinate   cy: Y- Co-ordinate   radius: Radius of a Circle and the Color
//         */
//        mCanvas.drawCircle(300, 500, 300, mPaint);
//        mCanvas.drawCircle(700, 500, 300, mPaint);
//        mCanvas.drawCircle(500, 800, 300, mPaint);
//        mPaint.setColor(Color.rgb(255, 0, 0));
//        mPaint.setStrokeWidth(100);
//        mPaint.setStyle(Paint.Style.FILL);
//        Path outerPath = new Path();
//        outerPath.addCircle(500, 500, 300, Path.Direction.CW);
//        Path innerPath = new Path();
//        innerPath.addCircle(400, 500, 300, Path.Direction.CW);
//        mCanvas.clipPath(outerPath);
//        mCanvas.clipPath(innerPath, Region.Op.DIFFERENCE);
        Bitmap bit = CircleGeneration();
        mCanvas.drawBitmap(bit,0,0,null);

    }
    public Bitmap CircleGeneration() {

        Bitmap bitmap = Bitmap.createBitmap(getWidth(),getHeight(),Bitmap.Config.ARGB_4444);
        Canvas canvas = new Canvas(bitmap);

        int width = getWidth();
        int height = getHeight();

        int X = width/2;
        int Y = height/2;
        Y = Y - 100;
        canvas.drawColor(Color.TRANSPARENT);
        canvas.drawCircle(X-150,Y,250,mPaint);
        canvas.drawCircle(X+150,Y,250,mPaint);
        canvas.drawCircle(X,Y+260,260,mPaint);

        final Point point = new Point();
        point.x = X;
        point.y = Y - 100;

        bitmap = FloodFill(bitmap,point,Color.RED);


        return bitmap;
    }

    public Bitmap FloodFill(Bitmap bitmap,Point node,int color) {

        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int target = color;
        int a = node.x;
        int b = node.y;

        if(bitmap.getPixel(a,b) != target) {
            Queue<Point> queue = new LinkedList<Point>();
            do {
                int x = node.x;
                int y = node.y;
                while(x > 0 && bitmap.getPixel(x - 1, y) == Color.TRANSPARENT) {
                    x--;
                }
                boolean SpanUp = false;
                boolean SpanDown = false;
                while(x < width && bitmap.getPixel(x,y) == Color.TRANSPARENT) {
                    bitmap.setPixel(x,y,color);
                    if(!SpanUp && y > 0 && bitmap.getPixel(x,y-1) == Color.TRANSPARENT) {
                        queue.add(new Point(x,y-1));
                        SpanUp = true;
                    } else if (SpanUp && y > 0 && bitmap.getPixel(x,y-1) != Color.TRANSPARENT) {
                        SpanUp = false;
                    }

                    if(!SpanDown && y < height - 1 && bitmap.getPixel(x,y+1)  == Color.TRANSPARENT) {
                        queue.add(new Point(x,y+1));
                        SpanDown = true;
                    } else if (SpanDown && y < height - 1 && bitmap.getPixel(x,y+1) != Color.TRANSPARENT) {
                        SpanDown = false;
                    }
                    x++;
                }
            } while((node = queue.poll()) != null);


        }
        return bitmap;
    }
}
