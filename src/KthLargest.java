import java.util.PriorityQueue;

public class KthLargest {
    int KthLargestNum(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); //MinHeap
        for (int num : nums) {
            pq.add(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        if (!pq.isEmpty()) {
            return pq.peek();
        }
        return -1;
    }

    public static void main(String[] args) {
        KthLargest kthLargest = new KthLargest();
        int Kth = kthLargest.KthLargestNum(new int[]{34, 435, 76, 32, 98, -21}, 2);
        System.out.println(Kth);
    }
}
