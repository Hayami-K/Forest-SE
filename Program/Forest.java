import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;

public class Forest extends Object {

	private Rectangle bounds;

	private ArrayList<Branch> branches;

	private ArrayList<Node> nodes;

	public void addBranch(Branch aBranch) {

	}

	public void addNode(Node aNode) {

	}

	public void arrange() {

	}

	protected Point arrange(Node aNode, Point aPoint, ForestModel aModel) {
		return null;
	}

	public Rectangle bounds() {
		return null;
	}

	public void draw(Graphics aGraphics) {

	}

	public void flushBounds() {

	}

	protected void propagate(ForestModel aModel) {

	}

	public java.util.ArrayList<Node> rootNodes() {
		return null;
	}

	protected java.util.ArrayList<Node> sortNodes(java.util.ArrayList<Node> nodeCollection) {
		return null;
	}

	public java.util.ArrayList<Node> subNodes(Node aNode) {
		return null;
	}

	public java.util.ArrayList<Node> superNodes(Node aNode) {
		return null;
	}

	public String toString() {
		return null;
	}

	public Node whichOfNodes(Point aPoint) {
		return null;
	}

}
