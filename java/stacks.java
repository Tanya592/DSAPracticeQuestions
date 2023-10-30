import java.util.*;
public class stacks {

    public static void main(String[] args) {
    Stack<Integer> st=new Stack<>();
    st.push(1);
    st.push(34);
    st.push(89);
    st.push(64);
    st.push(23);
//    st.pop();//here we dont write pop(89); but we write only pop as it removes only the topmost element of the stack
//        System.out.println(st.peek());
//        System.out.println(st);
        System.out.println(st.isEmpty());
        //returns boolean value if stack is empty it prints true else false
//        System.out.println(st.size());//to find the size of the stack
        while(st.size()>1){
            st.pop();
        }
        System.out.println(st.peek());

    }
}

    
