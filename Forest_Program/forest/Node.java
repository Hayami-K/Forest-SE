package forest;

import java.awt.Component;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;

import javax.swing.SwingUtilities;

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
	 * このクラスのインスタンスを生成するコンストラクタ
	 * @param aString ノード名：ラベル文字列
	 */
	public Node(String aString){

	}

	/**
	 * ノード（節）を描画するメソッド
	 * @param aGraphics グラフィクス（描画コンテクスト）
	 */
	public void draw(Graphics aGraphics){

	}

	/**
	 * ノード（節）の描画領域を応答するメソッド
	 * @return ノード（節）の描画領域（Rectangleのインスタンス）
	 */
	@Override
	public Rectangle getBounds(){
		return null;
	}


	/**
	 * ノード（節）の大きさを応答するメソッド
	 * @return ノード（節）の大きさ（幅と高さ）
	 */
	public Point getExtent(){
		return this.extent;
	}

	/**
	 * ノード（節）の位置を応答するメソッド
	 * @return ノード（節）の位置（座標）
	 */
	public Point getLocation(){
		return this.location;
	}

	/**
	 * ノード（節）の名前を応答するメソッド
	 * @return ノード名（ラベル文字列）
	 */
	@Override
	public String getName(){
		return this.name;
	}


	/**
	 * ノード（節）の状態を応答するメソッド
	 * @return ノードの状態
	 */
	public Integer getStatus(){
		return this.status;
	}

	/**
	 * ノード（節）の大きさを設定するメソッド
	 * @param aPoint ノードの大きさ（幅と高さ）
	 */
	public void setExtent(Point aPoint){
		this.extent = aPoint;
		return;
	}

	/**
	 * ノード（節）の位置を設定するメソッド
	 * @param aPoint ノードの位置（座標）
	 */
	@Override
	public void setLocation(Point aPoint){
		this.location = aPoint;
		return;
	}

	/**
	 * ノード（節）の名前を設定するメソッド
	 * @param aString ノードの名前（ラベル）
	 */
	public void setName(String aString){
		this.name = aString;
		return;
	}
	
	/**
	 * ノード（節）の状態を設定するメソッド
	 * @param anInteger ノードの状態
	 */
	public void setStatus(Integer anInteger){
		this.status = anInteger;
		return;
	}

	/**
	 * 文字列の高さを応答するメソッド
	 * @param string 文字列
	 * @return 文字列の高さ
	 */
	protected int stringHeight(String string){
		return null;
	}


	/**
	 * 文字列の幅を応答するメソッド
	 * @param string 文字列
	 * @return 文字列の幅
	 */
	protected int stringWidth(String string){
		return null;
	}


	/**
	 * 自分自身を文字列に変換するメソッド
	 * @return 自分自身を表す文字列
	 */
	public String toString(){
		return null;
	}
}
