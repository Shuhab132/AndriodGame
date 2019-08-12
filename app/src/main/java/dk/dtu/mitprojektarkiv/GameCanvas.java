package dk.dtu.mitprojektarkiv;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

import android.view.View;

public class GameCanvas extends View {

    // Ball Properties

  //  private static final int ballWidth = 80;
  //  private static final int ballHeight = 80;
   // private int posX = 0;
   // private int posY = 0;
    // Other Propeties
    private Paint paint;
    private RectF ballBounds;
   // GameLogic gameLogic;
  //  int posX = gameLogic.getX();
 //   int posY = gameLogic.getY();


    // Creating Canvas
    public GameCanvas(Context context) {

        super(context);
        paint = new Paint();
        ballBounds = new RectF();
        this.setFocusable(true);
        this.requestFocus();

    }

    // Drawing on Canvas
    @Override
    protected void onDraw(Canvas canvas ){
     //   System.out.println("Getter Value X: = "+ this.posX);
    //    System.out.println("Getter Value Y: = "+ this.posY);

        //Draw Ball
        Ball nyBold = new Ball(GameSensor.posX,GameSensor.posY);
        System.out.println("X Pos : = "+ GameSensor.posX );
        System.out.println("Y Pos : = "+ GameSensor.posY );
        nyBold.drawBall(canvas,paint);

        // Updates the View every 30 millis
      /*try {
            Thread.sleep(30);
        } catch (
                InterruptedException exception) {
        }
        */
        invalidate(); // Updates Canvas

    }
    /*
    // KeyUp Event Handler
    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_D: // move right
                posX += 5;
                System.out.println("PosX Right = "+ posX);
                break;
            case KeyEvent.KEYCODE_S: // move left
                posY  +=5;
                System.out.println("PosY left = "+ posY);
                break;
            case KeyEvent.KEYCODE_A: // move down
                posX -=5;
                System.out.println("PosX down = "+ posX);
                break;
            case KeyEvent.KEYCODE_W: // move up
                posY -=5;
                System.out.println("PosY up = "+ posY);
                break;
            case KeyEvent.KEYCODE_SPACE: // Stop ball
                posX = 0;
                posY = 0;
                System.out.println(" posY and posX  " + posX + posY);
                break;
        }
        return true; // Event håndteret
    }
 */
}
