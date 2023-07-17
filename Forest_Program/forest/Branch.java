package forest;

import java.awt.Graphics;

public class Branch {

  /**
   * ブランチ（枝）の始点となるノードを記憶するフィールド
   */
  private Node end;

  /**
   * ブランチ（枝）の終点となるノードを記憶するフィールド
   */
  private Node start;

  /**
   * このクラスのインスタンスを生成するコンストラクタ
   * @param from
   * @param to
   */
  public Branch(Node from, Node to){
    super();
    start = from;
    end = to;
  }


  /**
   * ブランチ（枝）を描画するメソッド
   * @param aGraphics
   */
  public void draw(Graphics aGraphics){
    return;

  }

  /**
   * ブランチ（枝）の終点となるノードを応答するメソッド
   * @return
   */
  public Node end(){
    return end;
  }

  /**
   * ブランチ（枝）の始点となるノードを応答するメソッド
   * @return
   */
  public Node start(){
    return start;
  }

  public String toString(){
  }
}
