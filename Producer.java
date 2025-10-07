package noticeboardsystem; 
 
public class Producer extends Thread{ 
		private MessageBoard board; 
  
		public Producer(MessageBoard b) { 
				this.board=b; 
   
		} 
		
		@Override 
		public void run () { 
			String msgs[]= { 
					"EXAMS ON MONDAY", 
					"HOLIDAY ON TUESDAY", 
					"WORKSHOP ON WEDNESDAY" 
			}; 
   
			for(String msg:msgs) { 
					board.put(msg); 
						try { 
							Thread.sleep(1000); 
						} 
						catch(InterruptedException e) { 
							Thread.currentThread().interrupt(); 
						} 
      } 
  
			board.put("DONE"); 
			}
		}
