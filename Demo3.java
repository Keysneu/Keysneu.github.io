import java.util.*;
Queue<E> queue = new Queue<>();
 
 
class Cust{
	String name;
	int ID;
	int pwd;
	double money;
	Scanner in=new Scanner(System.in);
	Cust(){

	};
	void deposite(){
		System.out.println("�������������Ľ��");
		double m0=in.nextDouble();
		money+=m0;
	}
	void get(){
		System.out.println("����������ȡ���Ľ��");
		double m0=in.nextDouble();
		money-=m0;
	}
	void print(){
		System.out.println("����"+name+"�˺�"+ID+"���"+money);

	}
	void change(Cust st[]){
		System.out.println("����������ת�˵Ķ���");
		int tmp=in.nextInt();
		int i=0;
		for(i=0;i<st.length;i++){
			if(tmp==st[i].ID){
				System.out.println("����������ת�˵Ľ��");
				double m=in.nextDouble();
				this.money-=m;
				st[i].money+=m;
			}
		}
		if(i==st.length){
			System.out.println("�Ҳ������˺�");
		}

	}
	int menu(Cust st[]){
		System.out.println("**��Ǯ\t1**");
		System.out.println("**ȡǮ\t2**");
		System.out.println("**��ѯ\t3**");
		System.out.println("**ת��\t4**");
		System.out.println("**�˳�\t0**");
		int choice=in.nextInt();
		switch(choice){
		case 1:deposite();
			break;
		case 2:get();
			break;
		case 3:
			print();
			break;
		case 4:
			change(st);
			break;
		case 0:
			return 0;
		}
		return 1;
	}
}


class Demo3{
	
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		Cust st[]=new Cust[100];
		Staff sb[]=new Staff[2];
		sb[0]=new Staff(1,aa,111);
		sb[1]=new Staff(2,bb,222);
		for(int i=0;i<4;i++){
			st[i]=new Cust();
		}
		init(st[0],"a",1,111,100);
		init(st[1],"b",2,222,200);
		init(st[2],"c",3,333,300);
		init(st[3],"d",4,444,400);
		System.out.println("����������id");
		int id=in.nextInt();
		int i=0;
		for(i=0;i < st.length ; i++){
			if(id==st[i].ID){
				int tmp=1;
				while (true)
				{
					tmp=st[i].menu(st);
					if(tmp==0){
						break;
					}
				}
				break;
			}
		}
		if (i==st.length)
		{
			System.out.println("û�д��û�");
		}

	}
	static void init(Cust q,String s,int i,int p,double m){
		q.name=s;
		q.ID=i;
		q.pwd=p;
		q.money=m;
	}
}

class Kb(){
	Scanner in=new Scanner(System.in);
}
class Staff(){
	int id;
	String name;
	int pwd;
	Staff(){

	}
	Staff(int i,String n,int p)
	{
		id=i;
		name=n;
		pwd=p;
	}
	void checkCust(Cust st[]){
		System.out.println("�����������ѯ���û�id");
		int id=Kb.in.nextInt();
		int i=0;
		for(i=0;i < st.length ; i++){
			if(id==st[i].ID){
				int tmp=1;
				while (true)
				{
					tmp=st[i].print();
				}
				break;
			}
		}
		if (i==st.length)
		{
			System.out.println("û�д��û�");
		}
	}
	void countAmount(Cust st[]){
		double ammount;
		for(int i=0,i<4,i++){
			ammount+=st[i].money;
		}
		System.out.println("�ܽ��"+ammount);
	}
	void addCust(Cust st[]){

	}
	void delectCust(Cust st[]){

	}
	void Sort(Cust st[]){

	}
}