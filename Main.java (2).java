/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.io.*;
class Stock {
	String stname;
	int sid,sqty;
	int spr,stax;
	Stock(String stname,int sid,int sqty,int spr,int stax)
	{
		this.stname=stname;
		this.sid=sid;
		this.sqty=sqty;
		this.spr=spr;
		this.stax=stax;
	}
	void viewStock()
	{

		System.out.println("\t"+stname+"\t"+sid+"\t"+sqty+"\t"+spr+"\t"+stax);
		//System.out.println("------------------------------------------------------------------------");
		System.out.println();

	}

}
class bill {
	String bname;
	int bqty;
	double bpr,bt;

	bill(String bname,int bqty,double bpr,double bt)
	{
		this.bname=bname;

		this.bqty=bqty;
		this.bpr=bpr;
		this.bt=bt;
	}
	void viewbill()
	{

		System.out.println();
		System.out.println("\t"+bname+"\t"+bqty+"\t"+bpr+"\t"+bt);
		// System.out.println("------------------------------------------------------------------------");
		System.out.println();
	}

}
class cashier {
	String cashiername,pass;
	int cid;
	cashier(String cashiername, String pass,int cid )
	{
		this.cashiername=cashiername;
		this.pass=pass;
		this.cid=cid;
	}
	void viewCaheir()
	{

		System.out.println("\t"+cashiername+"\t\t"+cid);
		//System.out.println("*****************************");

	}

}
class cake {
	Scanner sc=new Scanner(System.in);
	ArrayList<cashier> al=new ArrayList<cashier>();
	ArrayList<Stock> sl=new ArrayList<Stock>();
	ArrayList<bill> bl=new ArrayList<bill>();
	int cid=101,sid=501,x=0,k=0;
	boolean m=false;




	void owner()throws Exception
	{

		System.out.println("\t***********Welcome*************\n");
		System.out.println();
		while(true)
		{
			System.out.println("\t1.Add chashier\n\t2.view cashier\n\t3.remove cashier\n\t4.exit");
			System.out.print("Enter your choice: ");
			int ch=sc.nextInt();
			if(ch==1)
			{
				System.out.println("enter cashier name & password: ");
				String cname=sc.next(),cpass=sc.next();
				al.add(new cashier(cname,cpass,cid));
				System.out.println("your cashier id : "+cid);
				cid++;
				System.out.println("Cashier added successfully.\n");

			}
			else if(ch==2)
			{
				System.out.println("\t********Cashier Details********");
				System.out.println();
				System.out.println("\t*****************************");
				System.out.println("\tCashier name\tCashierId");
				//  File fl=new File("cash.txt");
				//  fl.createNewFile();
				//  FileWriter fw=new FileWriter(fl);
				// fw.write("\tCashier name\tCashierId\n");
				// fw.write("\t*****************************\n");
				for(cashier g:al)
				{
					g.viewCaheir();

					//  fw.write("\t"+g.cashiername+"\t"+g.cid+"\n");
					System.out.println();
				}
				//  fw.write("\t*****************************\n");

				System.out.println("\t*****************************");

				//  fw.close();

			}
			else if(ch==3)
			{
				boolean h=false;
				int j=0;
				System.out.print("Enter cashier name: ");
				String m=sc.next();
				for(int i=0; i<al.size(); i++) {

					if((al.get(i).cashiername).equalsIgnoreCase(m)) {
						h=true;
						j=i;

					}
				}
				if(h) {
					al.remove(j);
					System.out.println("\tRemoving successfully\n");
				}
				else {
					System.out.println("Cashier not found.");
				}
			}
			//  System.out.println("Cashier removed successfully..");




			else if(ch==4) break;
			else
			{
				System.out.println("Enter a correct choice\n");
			}
		}
	}

	void cashier()throws Exception {


		boolean l=false;
		System.out.println("Enter cashier id & password: ");
		int cid=sc.nextInt();
		String cpass=sc.next();
		for(int i=0; i<al.size(); i++) {
			if((al.get(i).cid==cid)&&((al.get(i).pass).equalsIgnoreCase(cpass))) {
				l=true;
				break;
			}
		}
		if(l) {
			System.out.println("\t*******Welcome cashier!*******");

			while(true) {
				System.out.println("\t1.Stock\n\t2.View stock\n\t3.update stock\n\t4.Remove stock\n\t5.Bill\n\t6.View Bill\n\t7.exit");
				System.out.println("Enter your choice: ");
				int ch2=sc.nextInt();

				if(ch2==1) {
					System.out.println("Enter Stock name: ");
					String sname=sc.next();
					//  System.out.println("Enter Stock id: ");
					//  int sid=sc.nextInt();
					System.out.println("Enter quantity: ");
					int qty=sc.nextInt();
					System.out.println("price: ");
					int pp=sc.nextInt();
					System.out.println("Enter tax: ");
					int tax=sc.nextInt();

					sl.add(new Stock(sname,sid,qty,pp,tax));
					System.out.println("product Id: "+sid);
					sid++;
					System.out.println("Stock Added successfuly..\n");

				}
				else if(ch2==2) {

					System.out.println("\tStockNamed\tStockid\tStockqty\tStockprice\tTax");
					System.out.println("------------------------------------------------------------------------");
					System.out.println();
					//   File f2=new File("stock.txt");
					//   f2.createNewFile();
					//   FileWriter fc=new FileWriter(f2,true);
					//FileWriter fw=new FileWriter(fl);

					//   fc.write("\tStockNamed\tStockid\tStockqty\tStockprice\tTax\n");
					//   fc.write("------------------------------------------------------------------------\n");
					for(Stock k:sl)
					{
						//  fc.write("\t\t"+k.stname+"\t\t"+k.sid+"\t\t"+k.sqty+"\t\t"+k.spr+"\t\t"+k.stax+"\n");
						k.viewStock();
						System.out.println();
					}
					//  fc.write("------------------------------------------------------------------------\n");
					//  fc.close();

					System.out.println("------------------------------------------------------------------------");
					System.out.println();
				}
				else if(ch2==3) {
					System.out.println("update stock");
					System.out.print("Enter Stock name: ");
					String dname=sc.next();
					boolean g=false;
					for(int i=0; i<sl.size(); i++) {
						if((sl.get(i).stname).equalsIgnoreCase(dname)) {
							x=i;
							g=true;
						}
					}
					if(g) {

						System.out.println("How much of quantity you want to add: ");
						int nqty=sc.nextInt();
						System.out.println("Enter new price: ");
						int npr=sc.nextInt();
						System.out.println("Enter new tax: ");
						int ntax=sc.nextInt();

						sl.get(x).sqty+=nqty;
						sl.get(x).spr=npr;
						sl.get(x).stax=ntax;
						// File f5=new File("stock.txt");
						//       f5.createNewFile();
						//       FileWriter fx=new FileWriter(f5,true);
						//FileWriter fw=new FileWriter(fl);

						//   fx.write("\tStockNamed\tStockid\tStockqty\tStockprice\tTax\n");
						//   fx.write("------------------------------------------------------------------------\n");
						for(Stock d:sl)
						{
							//  fx.write("\t\t"+d.stname+"\t\t"+d.sid+"\t\t"+d.sqty+"\t\t"+d.spr+"\t\t"+d.stax+"\n");
							d.viewStock();
							System.out.println();
						}
						//  fx.write("------------------------------------------------------------------------\n");
						//  fx.close();
						System.out.println("Stock updated \n");
						System.out.println("Updated stock Details: \n");
						System.out.println("\tStockName\tStockid\tStockqty\tStockprice\tTax");
						System.out.println("------------------------------------------------------------------------");
						System.out.println();
						for(Stock m:sl)
						{
							m.viewStock();
							System.out.println();
						}
						System.out.println("------------------------------------------------------------------------");
						System.out.println();

					}

				}
				else if(ch2==4) {
					System.out.println("remove stock");
					System.out.print("Enter stock name: ");
					String ns=sc.next();
					for(int j=0; j<sl.size(); j++) {

						if((sl.get(j).stname).equalsIgnoreCase(ns)) {
							sl.remove(j);
							System.out.println("\tstock Removing successfully\n");

						}
					}


				}
				else if(ch2==5) {
					System.out.println("Billing Section: ");
					System.out.print("Enter Stock name: ");
					String bname=sc.next();

					System.out.print("Enter buying quantity: ");
					m=false;
					int bqty=sc.nextInt();
					if(bqty<=sl.get(k).sqty) {


						for(int i=0; i<sl.size(); i++) {
							if((sl.get(i).stname).equalsIgnoreCase(bname)) {


								k=i;
								m=true;
							}

						}

						if(m) {
							System.out.println("\t\t*****Total Available product:*****\n");
							System.out.println("------------------------------------------------------------------------");
							System.out.println();
							System.out.println("\tproduct name: "+sl.get(k).stname+"\tproduct id: "+sl.get(k).sid+"\t      quantity: "+sl.get(k).sqty+"\tprice: "+sl.get(k).spr+"\ttax: "+sl.get(k).stax+"\n");
							System.out.println("------------------------------------------------------------------------");
							System.out.println();

							double price=bqty*sl.get(k).spr;
							double tax=price*sl.get(k).stax/100;
							System.out.println(tax);
							double fprice=price+tax;
							//System.out.println("tot:"+fprice+"tax: "+tax);
							bl.add(new bill(bname,bqty,fprice,tax));
							System.out.println("Bill was added.\n");
							int lqty=sl.get(k).sqty-bqty;
							sl.get(k).sqty=lqty;


						}
						else {
							System.out.println("Product not available.Can't bill");

						}
					}
					else {
						System.out.println("Sorry, product quantity not available");
					}



				}
				else if(ch2==6) {
					System.out.println("\t***Bill Details***\n");
					System.out.println("ProdName\tBillQty\tBillPrice\tTax");
					System.out.println("------------------------------------------------------------------------");
					//  File f3=new File("bill.txt");
					//  f3.createNewFile();
					//  FileWriter fb=new FileWriter(f3);

					//   fb.write("\tProdName\tBillQty\tBillPrice\tax\n");
					//   fb.write("------------------------------------------------------------------------\n");
					for(bill d:bl)
					{
						//  fb.write("\t\t"+d.bname+"\t\t"+d.bqty+"\t\t"+d.bpr+"\t\t"+d.bt+"\n");
						d.viewbill();
						System.out.println();
					}
					//  fb.write("------------------------------------------------------------------------\n");
					//  fb.close();
					System.out.println("------------------------------------------------------------------------");
					System.out.println();

				}
				else if(ch2==7) break;


				else System.out.println("\nplease enter correct option\n");

			}

		}
		else {
			System.out.println("Wrong Cashier name or password..");
			System.out.println();
		}


	}
}

public class Main
{
	public static void main(String[] args)throws Exception {
		Scanner sc=new Scanner(System.in);
		cake o=new cake();
		System.out.println();
		System.out.println("\t**************The Cake shop****************");
		System.out.println();
		while(true)
		{
			System.out.println("\t1.owner\n\t2.chashier\n\t3.exit");
			System.out.println("\t*******************************************");
			System.out.print("Enter your option: ");
			int ch=sc.nextInt();
			boolean c=false;
			if(ch==1)
			{
				System.out.println("Enter username & password: ");
				String oname=sc.next(),opass=sc.next();
				if(oname.equalsIgnoreCase("navi")&&opass.equalsIgnoreCase("1234"))
				{
					c=true;

				}

				if(c) {
					o.owner();
					System.out.println();
				}
				else {
					System.out.println("Invalid username or password.");

				}
			}
			else if(ch==2)
			{
				o.cashier();
				System.out.println();

			}

			else if(ch==3)
			{
				System.out.println();
				break;
			}
			else
			{
				System.out.println("Enter a correct choice");
				System.out.println();
			}

		}

	}
}
