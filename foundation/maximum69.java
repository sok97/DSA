package foundation;

public class maximum69 {
    public static int maximum69Number(int n){
        String st = String.valueOf(n);
        st = st.replaceFirst("6", "9");
        return Integer.parseInt(st);
    }
public static void main(String[] args) {
    int n = 9666;
    int ans = maximum69Number(n);
    System.out.println(ans);
    System.out.println(maximum69Number(n));
}    
}
