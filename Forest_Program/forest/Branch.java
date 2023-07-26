package forest;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;


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
    return;
  }


  /**
   * ブランチ（枝）を描画するメソッド
   * @param aGraphics
   */
  public void draw(Graphics aGraphics){
    Graphics2D aGraphics2D = (Graphics2D)aGraphics;
		aGraphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		aGraphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

		// ブランチ（枝）の始点座標を計算
		Point location = this.start.getLocation();
		Point extent = this.start.getExtent();
		Integer x1 = location.x + extent.x;
		Integer y1 = location.y + (extent.y / 2);

		// ブランチ（枝）の終点座標を計算
		location = this.end.getLocation();
		extent = this.end.getExtent();
		Integer x2 = location.x;
		Integer y2 = location.y + (extent.y / 2);

		// ブランチ（枝）の線を描画コンテクストへ描き出す
		aGraphics.setColor(Constants.ForegroundColor);
		aGraphics.drawLine(x1, y1, x2, y2);

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

  /**
	 * 自分自身を文字列に変換するメソッドです。
	 * @return 自分自身を表す文字列
	 */
  @Override
  public String toString(){
    {
      Class<?> aClass = this.getClass();
  
      StringBuffer aBuffer = new StringBuffer();
      aBuffer.append(aClass.getName());
      aBuffer.append("[");
      aBuffer.append(this.start.getName());
      aBuffer.append(", ");
      aBuffer.append(this.end.getName());
      aBuffer.append("]");
  
      return aBuffer.toString();
    }
  }
}
