
package javaappqueue;


public class JavaAppQueue {

    
    public static void main(String[] args) {  
        
        MyQueue queue = new MyQueue();
        queue.push(10);
        queue.push(20);
        queue.push(30);
        System.out.println(queue.pop());
        queue.push(40);
        for (int i = 0; i < 3; i++) {
            System.out.println(queue.pop());
        }
        
    }
}
