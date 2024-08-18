import java.util.PriorityQueue;

public class KthSmallest {
    int KthSmallestNum(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a); //MaxHeap
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
        KthSmallest kthSmallest = new KthSmallest();
        int Kth = kthSmallest.KthSmallestNum(new int[]{34, 435, 76, 32, 98, -21}, 2);
        System.out.println(Kth);

    }
}
