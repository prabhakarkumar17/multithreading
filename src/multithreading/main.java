package multithreading;
/* BY EXTENDING THREAD CLASS */

class hi extends Thread	//it will extends the thread class
{
	public void run()	//as Thread is having run method which is executed by start()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("hi");
			try{Thread.sleep(500);} catch(Exception e) {} //to handle exception try catch is used && by using sleep method we can hold upto sevral millisceonds
		}
	}
}

class hello extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("hello");
			try{Thread.sleep(499);} catch(Exception e) {}
		}
	}
}

class main
{
	public static void main(String[] args)
	{
		hi t1=new hi();			//creating object of first thread
		hello t2=new hello();   //creating object of second thread
		
		t1.start();	 			//here start() will call first(hi) thread class run()
		try {Thread.sleep(10);}catch(Exception e) {}
		t2.start();				//here start() will call second(hello) thread class run()
	}
}