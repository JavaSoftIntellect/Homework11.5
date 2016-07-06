import java.util.LinkedList;
import java.util.List;

public class Tree<T> {

	T data;
	Tree<T> parent;
	List<Tree<T>> children;

	public Tree(T data) {
		this.data = data;
		this.children = new LinkedList<Tree<T>>();
	}

	public Tree<T> addChild(T child) {
		Tree<T> childNode = new Tree<T>(child);
		childNode.parent = this;
		this.children.add(childNode);
		return childNode;
	}

	public void print(Tree<T> node, int depth) {
		for (int i = 0; i < depth; i++) {
			System.out.print("\t");
		}
		System.out.println(node.data);
		depth++;

		for (int i = 0; i < node.children.size(); i++) {
			print(node.children.get(i), depth);
		}
	}

	private int returnDepth(int i) {

		if (this.parent == null) {
			return 1;
		}
		i++;
		return 1 + this.parent.returnDepth(i);
	}

	public void itemDepth(T elem) {
		if (this.data.equals(elem)) {

			System.out.println("Found at depth " + this.returnDepth(0));
			return;
		} else
			for (int i = 0; i < this.children.size(); i++)
				this.children.get(i).itemDepth(elem);

	}
}