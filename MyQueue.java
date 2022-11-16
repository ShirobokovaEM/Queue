
package javaappqueue;


public class MyQueue {
    
    private QueueData first;
    private QueueData last;
    
    public boolean isEmpty(){
        return first == null;
    }
    
    public void push(int data){
        QueueData p = new QueueData(data);
        if(first == null){
            first = p;
            last = p;
        }
        else {
            last.next = p;
            last = p;
        }
    }
    
    public int pop(){
        int tmp = first.data;
        first = first.next;
        return tmp;
    }

   
}
