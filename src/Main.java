
public class Main {

	public static void main(String[] args) {
		Tree<String> root = new Tree<String>("a");

		Tree<String> b = root.addChild("b");
		Tree<String> e = b.addChild("e");
		Tree<String> f = b.addChild("f");
		Tree<String> g = f.addChild("g");
		Tree<String> h = f.addChild("h");

		Tree<String> c = root.addChild("c");

		Tree<String> d = root.addChild("d");
		Tree<String> i = d.addChild("i");
		Tree<String> j = d.addChild("j");
		root.itemDepth("h");
	}
}