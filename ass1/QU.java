import java.util.Arrays;

public class QU {
	private int[] id;
	private int[] sz;
	public QU(int size){
		id = new int[size];
		sz = new int[size];
		Arrays.fill(sz, 1);
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
	public int treeSize(int x){
		return sz[x];
	}
	public void connect(int p, int q){
		if(sz[q]<sz[p]){
			sz[p]+=sz[q];
			sz[q]=0;
			id[q]=id[p];
		}
		else{
			sz[q]+=sz[p];
			sz[p]=0;
			id[p]=id[q];
		}
	}
	public void checkConnection(int p, int q){
		int rootP = isRoot(p), rootQ=isRoot(q);
		connect(rootP, rootQ);
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
