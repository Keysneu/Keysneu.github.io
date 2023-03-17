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
		System.out.println("请输入您想存入的金额");
		double m0=in.nextDouble();
		money+=m0;
	}
	void get(){
		System.out.println("请输入您想取出的金额");
		double m0=in.nextDouble();
		money-=m0;
	}
	void print(){
		System.out.println("姓名"+name+"账号"+ID+"存款"+money);

	}
	void change(Cust st[]){
		System.out.println("请输入您想转账的对象");
		int tmp=in.nextInt();
		int i=0;
		for(i=0;i<st.length;i++){
			if(tmp==st[i].ID){
				System.out.println("请输入您想转账的金额");
				double m=in.nextDouble();
				this.money-=m;
				st[i].money+=m;
			}
		}
		if(i==st.length){
			System.out.println("找不到此账号");
		}

	}
	int menu(Cust st[]){
		System.out.println("**存钱\t1**");
		System.out.println("**取钱\t2**");
		System.out.println("**查询\t3**");
		System.out.println("**转账\t4**");
		System.out.println("**退出\t0**");
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
		System.out.println("请输入您的id");
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
			System.out.println("没有此用户");
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
		System.out.println("请输入你想查询的用户id");
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
			System.out.println("没有此用户");
		}
	}
	void countAmount(Cust st[]){
		double ammount;
		for(int i=0,i<4,i++){
			ammount+=st[i].money;
		}
		System.out.println("总金额"+ammount);
	}
	void addCust(Cust st[]){

	}
	void delectCust(Cust st[]){

	}
	void Sort(Cust st[]){

	}
}