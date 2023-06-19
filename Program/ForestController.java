import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelListener;
import java.awt.Point;

import javax.swing.event.MouseInputAdapter;

public class ForestController extends javax.swing.event.MouseInputAdapter
        implements java.awt.event.MouseWheelListener {

    private Point current;

    private ForestModel model;

    private Point previous;

    private ForestView view;

    /**
     * マウスのボタンをクリックしたときに動作するメソッドです。 クリックした位置からノードを割り出します
     * 
     * @param aMouseEvent
     */
    public void mouseClicked(MouseEvent aMouseEvent) {

    }

    /**
     * マウスドラッグしたときに動作するメソッドです
     * 直近の位置と現在の位置から移動量を割り出してスクロールします
     * 
     * @param aMouseEvent
     */
    public void mouseDragged(MouseEvent aMouseEvent) {

    }

    /**
     * マウスがウィンドウに入ったときに操作するメソッドです
     * 
     * @param aMouseEvent
     */
    public void mouseEntered(MouseEvent aMouseEvent) {

    }

    /**
     * マウスがウィンドウに出たときに動作するメソッドです
     * 
     * @param aMouseEvent
     */
    public void mouseMoved(MouseEvent aMouseEvent) {

    }

    /**
     * マウスのボタンが押されたときに動作するメソッドです
     * 
     * @param aMouseEvent
     */
    public void mousePressed(MouseEvent aMouseEvent) {

    }

    /**
     * マウスのボタンが離されたときに操作するメソッドです
     * 
     * @param aMouseEvent
     */
    public void mouseReleased(MouseEvent aMouseEvent) {

    }

    /**
     * マウスのホイールが回されたときに動作するメソッドです
     * 
     * @param aMouseEvent
     */
    public void mouseWheelMoved(MouseEvent aMouseEvent) {

    }

    /**
     * マウスがウィンドウに出たときに動作するメソッドです
     * 
     * @param aMouseEvent
     */
    public void mouseExited(MouseEvent aMouseEvent) {

    }

    /**
     * モデルを設定するメソッドです
     * 
     * @param aModel
     */
    public void setModel(ForestModel aModel) {

    }

    /**
     * ビューをセットするメソッドです
     * 
     * @param aView
     */
    public void setView(ForestView aView) {

    }

    /**
     * 自分自身を文字列に変換するメソッドです
     */
    public String toString() {
        return null;
    }

}
