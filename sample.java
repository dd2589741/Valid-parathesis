import java.util.Stack;
public class sample {   
	static boolean valid(String s) {
		
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{') {
				stack.push(s.charAt(i));
			}else if(s.charAt(i)==')'||s.charAt(i)==']'||s.charAt(i)=='}') {
				if(stack.isEmpty()) {
					return false;
				}
				if(	s.charAt(i)==')'&&stack.peek()!='('||s.charAt(i)==']'&&stack.peek()!='[' ||s.charAt(i)=='}'&&stack.peek()!='{') {
					return false;
				}else {
					stack.pop();
				}
				
			}
			
		}
		if(stack.isEmpty()) {
			return true;
		}else {
			return false;
		}
				
	}
    public static void main(String []args) {
    	String s="([])";
    	System.out.println(valid(s));
    }
}