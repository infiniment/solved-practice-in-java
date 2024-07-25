package Algorythm;

import java.util.Scanner;

public class P10828 {
    public static int[] stack;
	public static int top = -1;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        
        stack = new int[testCase];
        String str = null;
        int num;
        
        while(testCase-- > 0) {
        	str = sc.nextLine();
        	String[] parts = str.split(" ");
        	
        	String command = parts[0];
        	switch(command) {
        	case "push":
        		num = Integer.parseInt(parts[1]);
        		push(num);
        		break;
        	case "pop":
        		System.out.println(pop());
        		break;
        	case "size":
        		System.out.println(size());
        		break;
        	case "empty":
        		System.out.println(empty());
        		break;
        	case "top":
        		System.out.println(top());
        		break;
        	}
        }

        sc.close();


    }
    public static void push(int item) {
    	stack[++top] = item;
    }
    
    public static int pop() {
    	if(top == -1) {
    		return -1;
    	}else {    		
    		return stack[top--];
    	}
    }
    
    public static int size() {
    	return top + 1;
    }
    
    public static int empty() {
    	if(top == -1) {
    		return 1;
    	}else {
    		return 0;
    	}
    }
    
    public static int top() {
    	if(top == -1) {
    		return -1;
    	}else {
    		return stack[top];
    	}
    }
}
