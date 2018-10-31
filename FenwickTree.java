package lab3;

public class FenwickTree {

    int value;
    int leftSize;
    FenwickTree left = new FenwickTree();
    FenwickTree right = new FenwickTree();

    void increment() {

    }

    void prefixSum(int upto) {
        FenwickTree inicio = new FenwickTree();
	if(upto > qtdFolha(inicio)){
           upto = qtdFolha(inicio);
        }
        if(inicio != null){
            //acho que teria que criar um contador, e fazer o resto entre o contador e upto, aí qd desse resto 0 era pq chegou em upto
            if(fazer verificação do índice para se sair do limite upto, não to conseguindo pensar){
                return 1 + inicio.left + inicio.right;
            }else{
                return 0 + inicio.left + inicio.right;
            }else{
                return 0;
            }
        }

    }
    
    int qtdFolha(FenwickTree inicio){
	    if (inicio != null)
	    {
		if((!inicio.left) && (!inicio.right))
		    return 1 + qtdFolha(inicio.right) + qtdFolha(inicio.left);
		else
		    return 0 + qtdFolha(inicio.right) + qtdFolha(inicio.left);
	    }
	    else
		return 0;
}

    
    int between(int lo, int hi){
       
        
        FenwickTree inicio = new FenwickTree();
        int i = 0;
        while(inicio!=null && i < lo){
            inicio = inicio.left;
            i++;
        }
        
        if(hi > qtdFolha(inicio)){
           hi = qtdFolha(inicio);
        }
        
        if (inicio!= null) {
            return inicio.value + between(inicio.left,hi-1) + between(inicio.right,hi-1);
        }else{
            return 0;
        }
    }

    public FenwickTree() {

    }

    FenwickTree(int value) {

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
        if (no == null) {
            return 0;
        }
        if (no.left == null && no.right == null) {
            return 1;
        }
        return size(no.left) + size(no.right);
    }

    void increment(int i, int delta) {
        FenwickTree atual = new FenwickTree();
        if (atual == null) {
            return;
        }
        while (true) {
            if (i < leftSize) {
		atual.value = atual.value+delta;    
                increment(i, atual.left);
            } else {
		atual.value = atual.value+delta;    
                increment(i, atual.right);
            }
        }
    }

    public String toString() {
        //acho que ta errado
        //return "Valor "+ this.value + "/n" + this.leftSize + "/n" + left.toString() + right.toString();
        FenwickTree novo = new FendiwckTree();
        //if (novo != null) {
        //    novo.left.toString();
        //    System.out.print(novo.value + " ");
        //    novo.right.toString();
      //  }
	 if (novo!=null){
		Sytem.out.printl(novo.value);
		toString(novo.left);
		toString(novo.right);
        }
    }

    static FenwickTree allZeros(int n) {
        if (n == 0) {
            return null;
        }
        if (n == 1) {
            return new FenwickTree(0);
        }
        int m = n / 2;
        return new FenwickTree(0, n - m, allZeros(n - m), allZeros(m));
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

  
        public static void main(String[] args) {
            System.out.println("Construcao de FenwickTree(3) : " + new FenwickTree(3));
            System.out.println("Construcao da arvore da figura : "
                    + new FenwickTree(3, new FenwickTree(1, new FenwickTree(4),
                            new FenwickTree(1, new FenwickTree(2), new FenwickTree(5))),
                            new FenwickTree(1, new FenwickTree(3),
                                    new FenwickTree(1, new FenwickTree(6), new FenwickTree(1)))));
        }
    

}
