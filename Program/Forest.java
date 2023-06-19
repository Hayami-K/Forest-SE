import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;

public class Forest extends Object {

    private Rectangle bounds;

    private ArrayList<Branch> branches;

    private ArrayList<Node> nodes;

    /**
     * ブランチを追加するメソッドです
     * 
     * @param aBranch
     */
    public void addBranch(Branch aBranch) {

    }

    /**
     * ノードを追加するメソッドです
     * 
     * @param aNode
     */
    public void addNode(Node aNode) {

    }

    /**
     *
     * 樹状整列する最上位のメソッドです
     *
     */
    public void arrange() {

    }

    /**
     * 樹状整列するN番階層のメソッドです
     * 
     * @param aNode
     * @param aPoint
     * @param aModel
     * @return
     */
    protected Point arrange(Node aNode, Point aPoint, ForestModel aModel) {
        return null;
    }

    /**
     * フォレストの領域を応答するメソッドです
     * 
     * @return
     */
    public Rectangle bounds() {
        return null;
    }

    /**
     * フォレストを描画するメソッドです
     * 
     * @param aGraphics
     */
    public void draw(Graphics aGraphics) {

    }

    /**
     * フォレストの領域を水に流すメソッドです
     */
    public void flushBounds() {

    }

    /**
     * チックタックの間、スリープし、モデルが変化したと知らせるメソッドです
     * 
     * @param aModel
     */
    protected void propagate(ForestModel aModel) {

    }

    /**
     * フォレストの根元となるノード群を応答するメソッドです
     * 
     * @return
     */
    public java.util.ArrayList<Node> rootNodes() {
        return null;
    }

    /**
     * 引数で指定されたノード群をノード名でソートするメソッドです
     * 
     * @param nodeCollection
     * @return
     */
    protected java.util.ArrayList<Node> sortNodes(java.util.ArrayList<Node> nodeCollection) {
        return null;
    }

    /**
     * 引数で指定されたノードのサブノード群を応答するメソッドです
     * 
     * @param aNode
     * @return
     */
    public java.util.ArrayList<Node> subNodes(Node aNode) {
        return null;
    }

    /**
     * 引数で指定されたノードのスーパーノード群を応答するメソッドです
     * 
     * @param aNode
     * @return
     */
    public java.util.ArrayList<Node> superNodes(Node aNode) {
        return null;
    }

    /**
     * 自分自身を文字列に変換するメソッドです
     */
    public String toString() {
        return null;
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
