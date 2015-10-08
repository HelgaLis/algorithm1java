
	public class Entry{
	public static void main(String[] args) {
	/*	UF qf = new UF();
		//2-4 3-8 9-8 5-0 8-1 7-8
		qf.merge(2, 4);
		qf.merge(3, 8);
		qf.merge(9, 8);
		qf.merge(5, 0);
		qf.merge(8, 1);

		qf.merge(7, 8);
		qf.print();*/
		//5-3 5-2 0-8 4-2 6-1 3-7 6-0 8-2 3-9 
      QU	qu = new QU(10);
      qu.union(5, 3);
      qu.union(5, 2);
      qu.union(0, 8);
      qu.union(4, 2);
      qu.union(6, 1);
      qu.union(3, 7);
      qu.union(6, 0);
      qu.union(8, 2);
      qu.union(3, 9);
     qu.print();  
	}
	}