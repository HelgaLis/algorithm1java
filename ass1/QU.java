
public class QU {
	private int[] id;
	public QU(int size){
		id = new int[size];
		for(int i = 0; i<id.length; i++){
			id[i] = i;
			System.out.printf("%s ", id[i]);
		}
		System.out.println();
	}
	public int getParent(int x){
		return id[x];
	}
	public int isRoot(int x)
	{
		int node=x, parent=getParent(node);
		while(node!=parent){
			node=parent;
			parent = getParent(node);
		}
		return parent;
	}
	public int findRoot(int x){
		int pid=id[x] ;
		if(id[pid]!=x)
		{
			pid = id[x];
			findRoot(pid);
		}
		return x;
	}
	public void checkConnection(int p, int q){
		int rootP = isRoot(p), rootQ=isRoot(q);
		if(rootP!=rootQ)
			id[rootP]=id[rootQ];
	}
	
	public void union(int p, int q){
		checkConnection(p, q);
			
//		System.out.printf("%s - %s ", p,q);
//		System.out.println();
//		for (int i : id) {
//			System.out.printf("%s ", i);
//		}
//		System.out.println();
	}
	public void print(){
		for (int i : id) {
			System.out.printf("%s ", i);
		}
	}

}
