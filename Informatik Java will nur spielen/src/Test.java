
public class Test {

	public static void main(String[] args) {
		Vertex v1 = new Vertex(17, 4);
		Vertex v2 = new Vertex(42, 0);
		Vertex v3 = new Vertex(0, 0);
		Vertex v4 = new Vertex(42, 23);
		Vertex vv = new Vertex(0, 0);

		System.out.println("v1.x=" + v1.x);
		System.out.println("v2.x=" + v2.x);
		System.out.println("v1.y=" + v1.y);
		System.out.println("v2.y=" + v2.y);

		System.out.println(v1.toString());
	}

}