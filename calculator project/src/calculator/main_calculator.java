package calculator;

import java.util.Scanner;
interface inter{
	void interm();
}

class cthread extends Thread{
	cthread(){
		start();
	}
	public void run() {
		try
		{
			throw new Exception("custom exception");
		}
		catch(Exception e) {
			System.out.println("custom exception"+e);
		}
	}
}
class dthread extends Thread{
	dthread(){
		start();
	}
	public synchronized void run() {
		try 
		{
			for(int i = 5; i > 0; i--) 
			{
				System.out.println("thread1 Number: " + i); 
				Thread.sleep(400);
			}
		} 
		catch (InterruptedException e) 
		{
			System.out.println("random interrupted");
		}

		System.out.println("Exiting dthread.");
	}
}
class ethread extends Thread{
	ethread(){
		super("My thread");
		start();
	}
	public synchronized void run() {
		try 
		{
			for(int i = 5; i > 0; i--) 
			{
				System.out.println("thread2 Number: " + i); 
				Thread.sleep(400);
				student st = new student();
				Scanner sc = new Scanner(System.in);
				
				
			    String name=sc.nextLine();
			    String branch=sc.next();
			    int age=sc.nextInt();
			    new student(name,branch,age);
				
				st.interm();
			}
		} 
		catch (InterruptedException e) 
		{
			System.out.println("random interrupted");
		}

		System.out.println("Exiting ethread.");
	}
}
			
class student implements inter{
	student(String name,String branch,int age){
		System.out.println("name :"+name+"age :"+age+"branch: "+branch);
	}
	public void interm() {
		System.out.println("interface method runs");
	}
	public student()
	{
		
	}
}


public class main_calculator {

	public static void main(String[] args) {
        calculator cals=new calculator();
        cthread ob=new cthread();
        dthread ob2=new dthread();
        ethread ob3=new ethread();
      /*  Scanner sc=new Scanner(System.in);
       
        int age;
        String name=sc.nextLine();
        String branch=sc.next();
        age=sc.nextInt();
        student s1=new student(name,branch,age);
        s1.interm();*/
	}

}
