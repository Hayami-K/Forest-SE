package forest;

import java.awt.Component;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;

import javax.swing.SwingUtilities;

/**
 * 樹状整列におけるノード（節）を担うクラス
 */
@SuppressWarnings("serial")
public class Node extends Component
{
	/**
	 * ノード名：ラベル文字列を記憶するフィールドです。
	 */
	private String name;

	/**
	 * ノードの場所（位置：座標）を記憶するフィールドです。
	 */
	private Point location;

	/**
	 * ノードの大きさ（幅と高さ）を記憶するフィールドです。
	 */
	private Point extent;

	/**
	 * 樹状整列する際のノードの状態を記憶するフィールドです。
	 */
	private Integer status;

	/**
	 * このクラスのインスタンスを生成するコンストラクタです。
	 * @param aString ノード名：ラベル文字列
	 */
	public Node(String aString)
	{
		super();

		this.setName(aString);
		this.setLocation(new Point(0, 0));

		// ノード名のラベル文字列のフォントフォント情報から幅と高さを計算する。
		Integer width = this.stringWidth(this.name) + (Constants.Margin.x * 2);
		Integer height = this.stringHeight(this.name) + (Constants.Margin.y * 2);
		this.setExtent(new Point(width, height));

		// 樹状整列のノードのステータス（状態）を未定として初期化する。
		this.setStatus(Constants.UnKnown);

		return;
	}

	/**
	 * ノード（節）を描画するメソッドです。
	 * @param aGraphics グラフィクス（描画コンテクスト）
	 */
	public void draw(Graphics aGraphics)
	{
		Graphics2D aGraphics2D = (Graphics2D)aGraphics;
		aGraphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		aGraphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

		// ノード（節）の枠縁を描き出す。
		aGraphics.setColor(Constants.ForegroundColor);
		aGraphics.drawRect(this.location.x, this.location.y, this.extent.x - 1, this.extent.y - 1);

		// ノード（節）の名前（ラベル）を描き出すための座標を計算する。
		String aString = this.getName();
		Point aPoint = (this.getBounds()).getLocation();
		aPoint.translate(Constants.Margin.x, this.extent.y - Constants.Margin.y - 2);

		// ノード（節）の名前（ラベル）を描き出す。
		aGraphics.setFont(Constants.DefaultFont);
		aGraphics.drawString(aString, aPoint.x, aPoint.y) ;

		return;
	}

	/**
	 * ノード（節）の描画領域を応答するメソッドです。
	 * @return ノード（節）の描画領域（Rectangleのインスタンス）
	 */
	@Override
	public Rectangle getBounds()
	{
		Rectangle aRectangle = new Rectangle(this.location.x, this.location.y, this.extent.x, this.extent.y);

		return aRectangle;
	}

	/**
	 * ノード（節）の大きさを応答するメソッドです。
	 * @return ノード（節）の大きさ（幅と高さ）
	 */
	public Point getExtent()
	{
		return this.extent;
	}

	/**
	 * ノード（節）の位置を応答するメソッドです。
	 * @return ノード（節）の位置（座標）
	 */
	@Override
	public Point getLocation()
	{
		return this.location;
	}

	/**
	 * ノード（節）の名前を応答するメソッドです。
	 * @return ノード名（ラベル文字列）
	 */
	@Override
	public String getName()
	{
		return this.name;
	}

	/**
	 * ノード（節）の状態を応答するメソッドです。
	 * @return ノードの状態
	 */
	public Integer getStatus()
	{
		return this.status;
	}

	/**
	 * ノード（節）の大きさを設定するメソッドです。
	 * @param aPoint ノードの大きさ（幅と高さ）
	 */
	public void setExtent(Point aPoint)
	{
		this.extent = aPoint;

		return;
	}

	/**
	 * ノード（節）の位置を設定するメソッドです。
	 * @param aPoint ノードの位置（座標）
	 */
	@Override
	public void setLocation(Point aPoint)
	{
		this.location = aPoint;

		return;
	}

	/**
	 * ノード（節）の名前を設定するメソッドです。
	 * @param aString ノードの名前（ラベル）
	 */
	@Override
	public void setName(String aString)
	{
		this.name = aString;

		return;
	}

	/**
	 * ノード（節）の状態を設定するメソッドです。
	 * @param anInteger ノードの状態
	 */
	public void setStatus(Integer anInteger)
	{
		this.status = anInteger;

		return;
	}

	/**
	 * 文字列の高さを応答するメソッドです。
	 * @param string 文字列
	 * @return 文字列の高さ
	 */
	protected int stringHeight(String string)
	{
		return Constants.DefaultFont.getSize();
	}

	/**
	 * 文字列の幅を応答するメソッドです。
	 * @param string 文字列
	 * @return 文字列の幅
	 */
	protected int stringWidth(String string)
	{
		FontMetrics fontMetrics = this.getFontMetrics(Constants.DefaultFont);

		return SwingUtilities.computeStringWidth(fontMetrics, string);
	}

	/**
	 * 自分自身を文字列に変換するメソッドです。
	 * @return 自分自身を表す文字列
	 */
	@Override
	public String toString()
	{
		Class<?> aClass = this.getClass();

		StringBuffer aBuffer = new StringBuffer();
		aBuffer.append(aClass.getName());
		aBuffer.append("[");
		aBuffer.append(this.name);
		aBuffer.append("]");

		return aBuffer.toString();
	}
}
