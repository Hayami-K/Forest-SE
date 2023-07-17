package forest;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;

import mvc.View;
import condition.Condition;

@SuppressWarnings("serial")
public class ForestView extends mvc.View{
  /**
   * このクラスのインスタンスを生成するコンストラクタ
   * @param aModel モデル（Modelのインスタンス）
   */
  public ForestView(ForestModel aModel){
    super(aModel, new ForestController());
    return;
  }

  /**
   * このパネル（ビュー）の描画が必要になったときに動作するメソッド
   * @param aGraphics グラフィクス（描画コンテクスト）
   */
  @Override
  public void paintComponent(Graphics aGraphics){

  }

  /**
   * 指定された位置（座標）にノードが存在するかを調べるメソッド
   * @param aPoint 位置（ビュー座標）
   * @return ノード、もしも見つからなかった場合には、nullを応答
   */
  public Node whichOfNodes(Point aPoint){

  }


}
