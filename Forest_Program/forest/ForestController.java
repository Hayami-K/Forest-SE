package forest;

import java.awt.Point;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;


import condition.Condition;
import mvc.Controller;

public class ForestController extends mvc.Controller{
  
  /**
	 * このクラスのインスタンスを生成するコンストラクタです。
	 */
	public ForestController()
	{
		super();

		return;
	}
  /**
   * マウスのボタンをクリックしたときに動作するメソッド
   * クリックした位置からノードを割り出す
   * @param aMouseEvent
   */
  @Override
  public void mouseClicked(MouseEvent aMouseEvent){
    // イベントからクリック座標を取得し、その座標にノードがあるかを調べる。
    Point aPoint = aMouseEvent.getPoint();
		System.out.println(aPoint);
		Node aNode = ((ForestView)this.view).whichOfNodes(aPoint);

		// 当該座標にノードがあった場合（null以外）にノード名（ラベル）を書き出す。
		new Condition(() -> !(aNode == null)).ifTrue(() ->
		{
			String aString = aNode.getName();
			System.out.println(aString);
			JOptionPane.showConfirmDialog(null, aString, "情報",
			                              JOptionPane.DEFAULT_OPTION,
			                              JOptionPane.INFORMATION_MESSAGE);
		});

    return;
  }
}
