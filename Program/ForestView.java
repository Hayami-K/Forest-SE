import javax.swing.JPanel;
import java.awt.Point;
import java.awt.Graphics;

public class ForestView extends JPanel {

    private ForestController controller;

    private ForestModel model;

    private Point offset;

    /**
     * このパネルの描画が必要になったときに動作するメソッドです
     * 
     * @aGraphics
     */
    public void paintComponent(Graphics aGraphics) {

    }

    /**
     * 相対スクロールを行うメソッドです
     * 
     * @param aPoint
     */
    public void scrollBy(Point aPoint) {

    }

    /**
     * 絶対スクロールを行うメソッドです
     * 
     * @param aPoint
     */
    public void scrollTo(Point aPoint) {

    }

    /**
     * 自分自身を文字列に変換するメソッドです
     */
    public String toString() {
        return null;
    }

    /**
     * 依存物として依存するものからの放送を受けたときに動作するメソッドです
     * その際には再描画します
     */
    public void update() {

    }

    /**
     * 指定された位置にノードが存在するかを調べるメソッドです
     * 
     * @param aPoint
     * @return
     */
    public Node whichOfNodes(Point aPoint) {
        return null;
    }

}
