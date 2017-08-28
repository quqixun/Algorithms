/**
 * @source  Algorithms Fourth Edition
 * @title   Class of Union-find (Weighted Quick Find)
 * @Chapter 1.5 Union-find Algorithm
 */

public class UFWQU {
	private int[] parent;
	private int[] size;
	private int count;

	public UFWQU(int n) {
		count = n;
		parent = new int[n];
		size = new int[n];
		for (int i = 0; i < n; i++) {
			parent[i] = i;
			size[i] = 1;
		}
	}

	public int count() {
		return count;
	}

	private void validate(int p) {
		int n = parent.length;
		if (p < 0 || p >= n)
			throw new IllegalArgumentException("index " + p + " is not between 0 and " + (n - 1));
	}

	public boolean connected(int p, int q) {
		validate(p);
		validate(q);
		return find(p) == find(q);
	}

	public int find(int p) {
		validate(p);
		while (p != parent[p])
			p = parent[p];
		return p;
	}

	public void union(int p, int q) {
		validate(p);
		validate(q);

		int rootP = find(p);
		int rootQ = find(q);
		if (rootP == rootQ) return;

		if (size[rootP] < size[rootQ]) {
			parent[rootP] = rootQ;
			size[rootQ] += size[rootP];
		}
		else {
			parent[rootQ] = rootP;
			size[rootP] += size[rootQ];
		}

		count--;
	}

	public static void main(String[] args) {
		int n = StdIn.readInt();
		UFWQU uf = new UFWQU(n);
		while (!StdIn.isEmpty()) {
			int p = StdIn.readInt();
			int q = StdIn.readInt();
			if (uf.connected(p, q)) continue;
			uf.union(p, q);
			StdOut.println(p + " " + q);
		}
		StdOut.println(uf.count() + " components");
	}
}
