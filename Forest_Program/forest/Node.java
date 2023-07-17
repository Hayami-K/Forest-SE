package forest;

import java.awt.Component;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;

import javax.swing.SwingUtilities;

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

}
