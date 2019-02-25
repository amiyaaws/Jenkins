public class emp {

	int eid;
	String ename;
	float esal;
	emp (int eid,String ename,float esal)
	{
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
		
	}
	void disp()
	{
		System.out.println("empid="+eid);
		System.out.println("ename="+ename);
		System.out.println("esal="+esal);
	}	
		public static void main(String[] args)
		{
	emp e1=new emp(111 , "Amiya" , 1000);
	e1.disp();
	emp e2=new emp(222,"Lipu",2000);
	e2.disp();
        emp e3=new emp(333,"Lipu Jena",5000);
        e3.disp();
			}

}
