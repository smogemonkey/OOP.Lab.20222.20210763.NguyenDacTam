import javax.swing.JOptionPane;

public class Ex6_1 {
	public static void main(String[] args) {
		int option = JOptionPane.showConfirmDialog(null,
				"Do you want to change to the first class ticket?");
		
		JOptionPane.showMessageDialog(null, "You've chosen: " 
				+ (option==JOptionPane.YES_OPTION?"Yes":"No"));
		System.exit(0);
	}
}

/* 
 * Question 1: What happens if users choose “Cancel”? 
 * Answer : Since the code is only checking for JOptionPane.YES_OPTION  
 * and assuming that any other value means "No", the message displayed in the dialog 
 * created by JOptionPane.showMessageDialog() will be "You've chosen: No".
 *
 * Hence, if the user chooses "Cancel", the message displayed will be "You've chosen: No".
 
 
 * Question 2: How to customize the options to users,
 *  e.g. only two options: “Yes” and “No”, OR “I do” and “I don’t”
 * 
 * Code is in file "Ex6_1_Optimized.java"
*/


