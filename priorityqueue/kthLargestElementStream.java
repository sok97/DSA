package priorityqueue;
import java.util.*;

public class kthLargestElementStream {
    static ArrayList<Integer> kthLargest(int[] arr, int k) {
            // code here
            ArrayList<Integer> res = new ArrayList<>();
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for(int x :arr){
                pq.add(x);
                if(pq.size()>k) pq.poll();
                res.add(pq.peek());
            }


            return res;
        }
    
    public static void main(String[] args) {
   int[] arr = {4, 5, 8, 2, 3, 9, 1};
int k = 3;
System.out.println(kthLargest(arr, k));

    }
}
