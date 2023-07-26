package forest;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

import condition.Condition;
import condition.ValueHolder;

public class Forest {
  /**
   * 樹状整列したフォレスト（森）の領域（矩形）を記憶するフィールド
   */
  private Rectangle bounds;

  /**
   * ブランチ（枝）群（たち）を記憶するフィールド
   */
  private ArrayList<Branch> branches;

  /**
   * ノード（節）群（たち）を記憶するフィールド
   */
  private ArrayList<Node> nodes;

  /**
   * このクラスのインスタンスを生成するコンストラクタ
   */
  public Forest(){
    super();

    this.bounds = null;
    this.branches = new ArrayList<Branch>();
    this.nodes = new ArrayList<Node>();
    return;
  }

  /**
   * ブランチ（枝）を追加するメソッド
   * @param aBranch ブランチ（枝）
   */
  public void addBranch(Branch aBranch){
    this.branches.add(aBranch);
    this.flushBounds();
    return;
  }

  /**
   * ノード（節）を追加するメソッド
   * @param aNode ノード（節）
   */
  public void addNode(Node aNode){
    this.nodes.add(aNode);
    this.flushBounds();
    return;
  }

  /**
   * 樹状整列するトップ（一番上位）のメソッド
   */
  public void arrange(){
    this.arrange(null);
    return;
  }

  /**
   * 樹状整列するセカンドレベル（二番階層）のメソッド
   * @param aModel モデル
   */
  public void arrange(Model aModel){
    Integer fontHeight = Constants.DefaultFont.getSize();
		Integer yValue = fontHeight + (Constants.Margin.y * 2) + Constants.Interval.y;

		ValueHolder<Integer> anIndex = new ValueHolder<Integer>(0);
		this.nodes.forEach((Node aNode) ->
		{
			aNode.setStatus(Constants.UnVisited);
			aNode.setLocation(new Point(0, anIndex.getAndSetDo((Integer it) -> it + 1) * yValue));
		});

		ValueHolder<Point> aPoint = new ValueHolder<Point>(new Point(0, 0));
		this.rootNodes().forEach((Node aNode) ->
		{
			aPoint.set(this.arrange(aNode, aPoint.get(), aModel));
			aPoint.set(new Point(0, aPoint.get().y + Constants.Interval.y));
		});

		this.flushBounds();

		return;
  }

  /**
   * 樹状整列する再帰レベル（N番階層）のメソッド
   * @param aNode ノード（このノードから再帰的にたどって下位のものたちも整列する）
   * @param aPoint ノードの位置（座標）
   * @param aModel モデル（nullのときはアニメーションを行わない）
   * @return 樹状整列に必要だった大きさ（幅と高さ）
   */
  public Point arrange(Node aNode, Point aPoint, Model aModel){
    
  }

  /**
   * フォレスト（木・林・森・亜格子状の森）の領域（矩形）を応答するメソッド
   * @return aGraphics フォレスト領域（矩形）
   */
  public Rectangle bounds(){
    // 領域がない時だけ計算
    new Condition(() -> this.bounds == null).ifTrue(() ->{
      this.bounds = new Rectangle(0, 0, 0, 0);
      ValueHolder<Integer> anIndex = new ValueHolder<Integer>(0);
      this.nodes.forEach((Node aNode) -> {
        this.bounds.add(aNode.getBounds());
        anIndex.getAndSetDo((Integer it) -> it + 1);
      });
    });

    return this.bounds;
  }

  /**
   * フォレスト（木・林・森・亜格子状の森）を描画するメソッド
   * @param aGraphics グラフィクス（描画コンテクスト）
   */
  public void draw(Graphics aGraphics){

    this.bounds();
    // ブランチ（枝）群（たち）を描画する。
    this.branches.forEach((Branch aBranch) -> {aBranch.draw(aGraphics);});
    // ノード（節）群（たち）を描画する。
    this.nodes.forEach((Node aNode) -> {aNode.draw(aGraphics);});
    return;
  }
  
  /**
   * フォレスト（木・林・森・亜格子状の森）の領域（矩形）を水に流す（チャラにする）メソッド
   */
  public void flushBounds(){
    this.bounds = null;
    return;
  }

  /**
   * チックタックの間、スリープし、モデルが変化した、と騒ぐ（広める：放送する）メソッド
   * @param aModel モデル
   */
  protected void propagate(Model aModel){
    new Condition(() -> !(aModel == null)).ifTrue(() -> {
      try {Tread.sleep(Constants.SleepTick);}
      catch(InterrptedException anException){ ; }
      this.flushBounds();
      aModel.changed();
    });

    return;
  }

  /**
   * フォレストの根元（ルート）となるノード群を応答するメソッド
   * @return ルートノード群
   */
  public ArrayList<Node> rootNodes(){
    List<Node> rootNodes = new ArrayList<Node>();
    this.nodes.forEach((Node aNode) -> {
      new Condition(() -> this.superNodes(aNode).size() == 0).ifTrue(() -> {rootNodes.add(aNode);});
    });
    return this.sortNodes(rootNodes);
  }

  /**
	 * 引数で指定されたノード群をノード名でソート（並び替えを）するメソッド
	 * @param nodeCollection ノード群
	 * @return ソートされたノード群
	 */
	protected List<Node> sortNodes(List<Node> nodeCollection){
    ValueHolder<Integer> i = new ValueHolder<Integer>(0);
		new Condition(() -> i.get() < (nodeCollection.size() - 1)).whileTrue(() ->
		{
			ValueHolder<Integer> j = new ValueHolder<Integer>(nodeCollection.size() - 1);
			new Condition(() -> j.get() > i.get()).whileTrue(() ->
			{
				Node current = nodeCollection.get(j.get());
				Node previous = nodeCollection.get(j.get() - 1);
				new Condition(() -> (current.getName()).compareTo(previous.getName()) < 0).ifTrue(() ->
				{
					Node temporary = current;
					nodeCollection.set(j.get(), previous);
					nodeCollection.set(j.get() - 1, temporary);
				});
				j.set(j.get() - 1);
			});
			i.set(i.get() + 1);
		});

		return nodeCollection;
  }

  /**
   * 引数で指定されたノードのサブノード群を応答するメソッド
   * @param aNode
   * @return サブノード群
   */
  public ArrayList<Node> subNodes(Node aNode){
    List<Node> subNodes = new ArrayList<Node>();
    this.branches.forEach((Branch aBranch) -> {
      new Condition(() -> aBranch.end() == aNode).ifTrue(() -> { subNodes.add(aBranch.start());});
    });

    return this.sortNodes(subNodes);
  }

  /**
   * 引数で指定されたノードのスーパーノード群を応答するメソッド
   * @param aNode ノード
   * @return スーパーノード群
   */
  public ArrayList<Node> superNodes(Node aNode){
    List<Node> superNodes = new ArrayList<Node>();
    this.branches.forEach((Branch aBranch) -> {
      new Condition(() -> aBranch.end() == aNode).ifTrue(() -> { superNodes.add(aBranch.start());});
    });

    return this.sortNodes(superNodes);
  }

  /**
   * 自分自身を文字列に変換するメソッド
   * @return 自分自身を表す文字列
   */
  public String toString(){
		Class<?> aClass = this.getClass();

		StringBuffer aBuffer = new StringBuffer();
		aBuffer.append(aClass.getName());
		aBuffer.append("[bounds=");
		aBuffer.append(this.bounds);
		aBuffer.append(", nodes=");
		aBuffer.append(this.nodes);
		aBuffer.append(", branches=");
		aBuffer.append(this.branches);
		aBuffer.append("]");

		return aBuffer.toString();
  }

  /**
   * 指定された位置（座標）にノードが存在するかを調べるメソッド
   * @param aPoint
   * @return ノード、もしも見つからなかった場合には、nullを応答します。
   */
  public Node whichOfNodes(Point aPoint){
		ValueHolder<Node> returnValue = new ValueHolder<Node>(null);
		try
		{
			this.nodes.forEach((Node aNode) ->
			{
				Rectangle aRetangle = aNode.getBounds();
				new Condition(() -> aRetangle.contains(aPoint)).ifTrue(() ->
				{
					returnValue.set(aNode);
					throw new RuntimeException();
				});
			});
		}
		catch (RuntimeException anException) { ; }

		return returnValue.get();    
  }

}
