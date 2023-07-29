package forest;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;

import mvc.View;
import condition.Condition;

/**
 * 樹状整列におけるMVCのビュー（V）を担うクラス
 */
@SuppressWarnings("serial")
public class ForestView extends View
{
	/**
	 * このクラスのインスタンスを生成するコンストラクタです。
	 * @param aModel モデル（Modelのインスタンス）
	 */
	public ForestView(ForestModel aModel)
	{
		super(aModel, new ForestController());

		return;
	}

	/**
	 * このパネル（ビュー）の描画が必要になったときに動作するメソッドです。
	 * @param aGraphics グラフィクス（描画コンテクスト）
	 */
	@Override
	public void paintComponent(Graphics aGraphics)
	{
		// 自分（ビュー：パネルのサブクラス）の幅と高さを取得する。
		Integer width = this.getWidth();
		Integer height = this.getHeight();

		// 自分の内部を背景色で塗りつぶす。
		aGraphics.setColor(Constants.BackgroundColor);
		aGraphics.fillRect(0, 0, width, height);

		// モデルが設定されているときにモデルを描画する。
		new Condition(() -> this.model != null).ifTrue(() ->
		{
			// モデルのピクチャ（画像）がある場合には、それをグラフィクス（描画コンテクスト）に描き出す。
			BufferedImage picture = this.model.picture();
			new Condition(() -> picture != null).ifTrue(() ->
			{
				Integer x = 0 - this.scrollAmount().x;
				Integer y = 0 - this.scrollAmount().y;
				aGraphics.drawImage(picture, x, y, null);
			});
		});

		return;
	}

	/**
	 * 指定された位置（座標）にノードが存在するかを調べるメソッドです。
	 * @param aPoint 位置（ビュー座標）
	 * @return ノード、もしも見つからなかった場合には、nullを応答します。
	 */
	public Node whichOfNodes(Point aPoint)
	{
		// 引数で指定されたビュー座標からスクロール量を減じてモデル座標に変換する。
		Integer x = aPoint.x + this.scrollAmount().x;
		Integer y = aPoint.y + this.scrollAmount().y;

		// データ管理をしているモデルから樹状整列のインスタンスを取得する。
		Forest aForest = ((ForestModel)this.model).forest();

		// 樹状整列のインスタンスへモデル座標を渡して、そこにノードが存在するかを調べてもらう。
		Node aNodeOrNull = aForest.whichOfNodes(new Point(x, y));

		return aNodeOrNull;
	}
}
