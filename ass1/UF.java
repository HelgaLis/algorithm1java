import java.util.Arrays;

public class UF{
	
	UF(){
		id = new int[10];
		for(int i = 0; i<id.length;i++)
		{	id[i] = i;
			System.out.print(i+" ");
		}
		System.out.println();
	}
	private int id[];
	private boolean find(int p, int q){
		return (id[p]==id[q])?true:false;
	}
	private void findQ(int q,int p){
		for (int i = 0; i < id.length; i++) {
			if(id[i]==p)
				id[i]=q;
		}
	}
	public void merge(int p, int q){
		if(!find(p, q)){
			int qid = id[q];
			id[p] =qid;
			findQ(qid,p);
		}
	}
	public void print(){
		for (int i : id) {
			System.out.print(i+" ");
		}
	}
	//2-4 3-8 9-8 5-0 8-1 7-8
}
