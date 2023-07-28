import java.awt.Component;
import java.awt.Point;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Node extends Component {

    private Point extent;

    private Point location;

    private String name;

    private Integer status;

    /**
     * ノードを描画するメソッドです
     * 
     * @param aGraphics
     */
    public void draw(Graphics aGraphics) {
        
    }

    /**
     * ノードの描画領域を応答するメソッドです
     * 
     * @return
     */
    public Rectangle getBounds() {
        return null;
    }

    /**
     * ノードの大きさを応答するメソッドです
     * 
     * @return
     */
    public Point getExtent() {
        return null;
    }

    /**
     * ノードの位置を応答するメソッドです
     * 
     * @return
     */
    public Point getLocation() {
        return null;
    }

    /**
     * ノードの名前を応答するメソッドです
     * 
     * @return
     */
    public String getName() {
        return null;
    }

    /**
     * ノードの状態を応答するメソッドです
     * 
     * @return
     */
    public Integer getStatus() {
        return null;
    }

    /**
     * ノードの大きさを設定するメソッドです
     * 
     * @param aPoint
     */
    public void setExtent(Point aPoint) {

    }

    /**
     * ノードの位置を設定するメソッドです
     * 
     * @param aPoint
     *
     */
    public void setLocation(Point aPoint) {

    }

    /**
     * ノードの名前を設定するメソッドです
<<<<<<< HEAD
     * 
=======
>>>>>>> ce598c700880ff52169668895f8e907de238649f
     * @param aString
     *
     */
    public void setName(String aString) {

    }

    /**
     * ノードの状態を設定するメソッドです
<<<<<<< HEAD
     * 
=======
>>>>>>> ce598c700880ff52169668895f8e907de238649f
     * @param anInteger
     */
    public void setStatus(Integer anInteger) {

    }

    /**
     * 文字列の高さを応答するメソッドです
<<<<<<< HEAD
     * 
=======
>>>>>>> ce598c700880ff52169668895f8e907de238649f
     * @param string
     * @return
     */
    protected int stringHeight(String string) {
        return 0;
    }

    /**
     * 文字列の幅を応答するメソッドです
<<<<<<< HEAD
     * 
=======
>>>>>>> ce598c700880ff52169668895f8e907de238649f
     * @param string
     * @return
     */
    protected int stringWidth(String string) {
        return 0;
    }

    /**
     * 自分自身を文字列に変換するメソッドです
     * 
     * @return
     */
    public String toString() {
        return null;
    }

}
