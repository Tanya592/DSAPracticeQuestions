import java.util.*;
public class insertioninstack {
    
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(34);
        st.push(89);
        st.push(64);
        st.push(23);
        System.out.println(st);
        int idx=2;
        int x=7;
        Stack<Integer> temp=new Stack<>();
        while(st.size()>idx){
            temp.push(st.pop());
        }
st.push(x);
        while(temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println(st);
    }
}

    

