package forest;

import java.io.File;
import java.util.ArrayList;

public class ForestModel {
  private Forest forest;

  public ForestModel(File aFile){

  }

  /**
   * アニメーションを行うメソッド
   */
  public void animate(){

  }

  /**
   * 樹状整列を行うメソッド
   */
  public void arrange(){

  }

  /**
   * 樹状整列それ自身を応答するメソッド
   * @return 樹状整列それ自身
   */
  public Forest forest(){
    return this.forest;
  }

  /**
   * 樹状整列データファイルから樹状整列それ自身を生成するメソッド
   * @param aFile 樹状整列データファイル
   */
  protected void read(File aFile){

  }

  /**
   * 樹状整列の根元（ルート）になるノードを探し出して応答するメソッド
   * @return ルートノード、ただし、見つからないときはnull
   */
  public Node root(){

  }

  /**
   * 樹状整列の根元（ルート）になるノードたちを探し出して応答するメソッド
   * @return ルートノードたち、ただし、見つからないときは空リスト
   */
  public ArrayList<Node> roots(){
    return this.forest().rootNodes();
  }
}
