/*
 * This class prints the given message on console.
 */
public class MessageUtil {

   	private String message;
 
    // Constructor
    public MessageUtil(String message){
		this.message = message;
    }
 
    // Prints the message
    public String printMessage(){
      	System.out.println(message);
      	return message;
    }   
}
