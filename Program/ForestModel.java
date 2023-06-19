public class ForestModel extends Object {

    private java.util.ArrayList<ForestView> dependents;

    private Forest forest;

    private java.awt.image.BufferedImage picture;

    /**
     * アニメーションを行うメソッドです
     */
    public void animate() {

    }

    /**
     * 依存するビューを依存物に登録します
     * 
     * @param aView
     */
    public void addDependent(ForestView aView) {

    }

    /**
     * 樹状整列を行うメソッドです
     */
    public void arrange() {

    }

    /**
     * 自分自身が変化したことを依存物たちに放送するメソッドです
     */
    public void changed() {

    }

    /**
     * 樹状整列それ自身を応答するメソッドです
     * 
     * @return
     */
    public Forest forest() {
        return null;
    }

    /**
     * 樹状整列それ自身を画像化したものを応答するメソッドです
     * 
     * @return
     */
    public java.awt.image.BufferedImage picture() {
        return null;
    }

    /**
     * 樹状整列データファイルから樹状整列それ自身を生成するメソッドです
     * 
     * @param aFile
     */
    public void read(java.io.File aFile) {

    }

    /**
     * 樹状整列の根元になるノードを探し出して応答するメソッドです
     * 
     * @return
     */
    public Node root() {
        return null;
    }

    /**
     * 自分自身を文字列に変換するメソッドです
     * 
     * @return
     */
    public java.lang.String toString() {
        return null;
    }

    /**
     * 樹状整列の根元となるノードたちを探し出して応答するメソッドです
     * 
     * @return
     */
    public java.util.ArrayList<Node> roots() {
        return null;
    }

}
