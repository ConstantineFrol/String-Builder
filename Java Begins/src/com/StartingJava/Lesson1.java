package com.StartingJava;

public class Lesson1 {

	/**
	 * DATA TYPES
	 */
	public static void main(String[] args) {

		int a;
		int b = 4;
		a = 3;
		a = 3+5*b;//a=23
		int res = a+b;
		System.out.println(res);//a+b=27
		
		/**
		 * IF & ELSE
		 */
		
		int k = 2;
		if (k > 5){ // is it true or false
			System.out.println("Yes");  // true
		}else{
			System.out.println("No");   // false
		}
		
		/**
		 *SWITCH & CASE 
		 */
		
		int x = 3, y = 4;
		double result = 0; 
		char c = '*';
		
		switch(c){
			case '+' : result = x + y; break; //c = +? false
			case '-' : result = x - y; break; //c = -? false
			case '*' : result = x * y; break; //c = *? true
			case '/' : result = (double)x / y; break; //c = /? false
			default: System.out.println("The Operator Not Found !");
			//brake -> if result is true exit from switch continue nex line of code
			// to get correct answear from 3/4 transform int in to double,result = 0.75
		}
		System.out.println("Result: " + result); //result: 3 * 4 = 12
	

		/**
		 * for, while, do ... while
		 */
	// для выполнения одного и тогоже условия несколько раз
		
		for(int i = 0; i < 10; i++){
			System.out.println(i);
		}
		int n = 10;
		while(n > 0){
			int r = n*n;
			n--;
			System.out.println("r = " + r);
			
		
		}
			int p = 1;
		do{
			if((p%2) == 0) System.out.println(p + " - Yes");
			else System.out.println(p + " - No");
			p++;
		}while (p < 10);
		
		/**
		 * break, continue, return
		 */
	
//break
		for(int i = 0; i < 10; i++){
			System.out.println(i);
			if(i>=5)break;  //012345 and stop,go to next line of code
		}
		System.out.println("The End.");
//continue
		for(int i = 1; i < 10; i++){
			if((i%2 == 0))continue;
			double r = i * i;
			System.out.println("r = " + r);
		}
	
		/**
		 *   Одномерные Массибы Данных
		 */
	
		int []mas = new int[3]; 
			
			mas[0] = 9;       		
			mas[1] = - 30;			
			mas[2] = 5;				
			
			int q = mas[2];
			System.out.println(q+mas[0]);//q=5) + (mas[0] = 9) = 14
			//случай когда дано большое кол-во индэкса,вданном случае [100]
			int h = 10;							
				int [] massiveName = new int[h];		
				for(int i = 0; i < h; i++){				
					massiveName[i] = i*i;             
					System.out.println(massiveName[i]);
	
	}
	
}
}
	
	

	

