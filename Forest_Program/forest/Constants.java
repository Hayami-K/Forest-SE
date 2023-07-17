package forest;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;

public class Constants {
  /**
   * ノードを描く際のラベルの背景色
   */
  public static final Color BackgroundColor = Color.white;

  /**
   * ノードを描く際のラベルのフォント
   */
  public static final Font Degaultfont = new Font("Monospaced", Font.PLAIN, 12);;

  /**
   * ノードを描く際のラベルの文字色
   */
  public static final Color ForegroundColor = Color.black;

  /**
   * ノード群を樹状に整列させる際にノード同士の間隔
   */
  public static final Point Interval = new Point(25, 2);

  /**
   * ノードにおいてラベルを描く際の枠縁から余裕（マージン）を表す
   */
  public static final Point Marginnew = new Point(2, 1);

  /**
   * 樹状整列アニメーションのチックタック：時間間隔：スピード
   */
  public static final Integer SleepTick = 100;

  /**
   * 樹状整列データファイル中のタグ「ブランチ」
   */
  public static final String TagOfBranches = "branches:";
  
  /**
   * 樹状整列データファイル中のタグ「ノード」
   */
  public static final String TagOfNodes = "nodes:";

  /**
   * 樹状整列データファイル中のタグ「ツリー」
   */
  public static final String TagOfTrees = "trees:";

  /**
   * ノード群を深さ優先にたどる際の状態「未定」
   */
  public static final Integer UnKnown = -1;

  /**
   * ノード群を深さ優先にたどる際の状態「未訪問」
   */
  public static final Integer UnVisited = 0;

  /**
   * ノード群を深さ優先にたどる際の状態「訪問済」
   */
  public static final Integer Visited = 1;
}
