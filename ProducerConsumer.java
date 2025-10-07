package noticeboardsystem; 
 
public class ProducerConsumer { 
		public static void main(String[] args) throws InterruptedException { 
				MessageBoard board = new MessageBoard(); 
				Producer p=new Producer(board); 
				Consumer c=new Consumer(board); 
				p.start(); 
				c.start(); 
				p.join(); 
				c.join(); 
				
		} 
 
}