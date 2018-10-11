
public class FenwickTree {
	int value;
	int leftSize;
	FenwickTree left = new FenwickTree();
	FenwickTree right = new FenwickTree();
	void increment() {

	}
	void prefixSum() {

	}
	public FenwickTree() {

	}
	FenwickTree(int value){

		this.value = value;
	}
	public FenwickTree(int leftSize, FenwickTree left, FenwickTree right) {
		this.leftSize = leftSize;
		this.left = left;
		this.right = right;
	}
	public FenwickTree(int value, int leftSize, FenwickTree left, FenwickTree right) {
		this.value = value;
		this.leftSize = leftSize;
		this.left = left;
		this.right = right;
	}
	int size(FenwickTree no) {
		if(no.left == null) {
			return 1;
		}else {
			return no.leftSize + size(no.right);
		}
	}
	void increment(int i, int delta) {

		if (i < leftSize) {
			increment(i,no.left);
		}else {
			increment(i,no.right);
		}
	}
	public String toString() {
		//acho que ta errado
		return "Valor "+ this.value + "/n" + this.leftSize + "/n" + left.toString() + right.toString();

	}
	static FenwickTree allZeros(int n){
		if (n==0) return null;
		if (n==1) return new FenwickTree(0);
		int m = n/2;
		return new FenwickTree(0, n-m, allZeros(n-m), allZeros(m));
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getLeftSize() {
		return leftSize;
	}
	public void setLeftSize(int leftSize) {
		this.leftSize = leftSize;
	}
	public FenwickTree getLeft() {
		return left;
	}
	public void setLeft(FenwickTree left) {
		this.left = left;
	}
	public FenwickTree getRight() {
		return right;
	}
	public void setRight(FenwickTree right) {
		this.right = right;
	}

}