package wiley.demo.hello;
import java.util.*;
public class July12th implements Runnable{

	Scanner sc = new Scanner(System.in);
	List<Integer> fib_no = new ArrayList<Integer>(); 
	public void run(){  
		System.out.println("Enter nth element");
		int n = sc.nextInt();
		if (n <= 0) {
			System.out.println("Sum of fibonacci serise: " + n);
		}
	      
		System.out.print("Sum of Fibonacci serise: ");
	       int fibo[]=new int[n+1];
	        fibo[0] = 0; fibo[1] = 1;
	        fib_no.add(fibo[0]);
	        fib_no.add(fibo[1]);
	      System.out.print(fibo[0]+" + "+fibo[1]);
	        // Initialize result
	        int sum = fibo[0] + fibo[1];
	      
	        // Add remaining terms
	        for (int i=2; i<=n; i++)
	        {
	            fibo[i] = fibo[i-1]+fibo[i-2];
	            fib_no.add(fibo[i]);
	            System.out.print(" + "+fibo[i]);
	            sum += fibo[i];
	            
	        }
	        
	      System.out.print(" = "+sum+"\n");
	      listPrint();
		}  
	void listPrint() {
		for(int i = 0;i<fib_no.size()+1;i++) {
			int sum = fib_no.get(i)+fib_no.get(i+1); 
			System.out.println(fib_no.get(i)+" + "+sum+ " = "+(sum+fib_no.get(i)));
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci obj = new Fibonacci();
	    Thread thread = new Thread(obj);
	    thread.start();
	}

}
