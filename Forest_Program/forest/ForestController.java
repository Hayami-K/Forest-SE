package forest;

import java.awt.Point;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

import condition.Condition;
import mvc.Controller;

/**
 * 樹状整列におけるMVCのコントローラ（C）を担うクラスになります。
 * 作者：青木淳（AOKI Atsushi）
 * 修正日（作成日）：2022-07-08（2008-11-11）
 */
public class ForestController extends Controller
{
	/**
	 * このクラスのインスタンスを生成するコンストラクタです。
	 */
	public ForestController()
	{
		super();

		return;
	}

	/**
	 * マウスのボタンをクリックしたときに動作するメソッドです。
	 * クリックした位置からノードを割り出します。
	 * @param aMouseEvent マウスイベント
	 */
	@Override
	public void mouseClicked(MouseEvent aMouseEvent)
	{
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
