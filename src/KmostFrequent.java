import java.util.*;

class KmostFrequent {
    public int[] getKfreq(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer>[] freqList = new List[nums.length + 1];

        for (int num: nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int key : countMap.keySet()) {
            int freq = countMap.get(key);
            if (freqList[freq] == null) {
                freqList[freq] = new ArrayList<>();
            }
            freqList[freq].add(key);
        }

        int[] res = new int[k];
        int pos = 0;
        for (int i = freqList.length-1; i >= 0; i--) {
            if (freqList[i] != null) {
                for (int j = 0; j < freqList[i].size() && pos < k; j++) {
                    res[pos] = freqList[i].get(j);
                    pos++;
                }
            }
        }

    return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,1,1,2,2,3,100};
        int k = 2;

        KmostFrequent kmostFrequent = new KmostFrequent();
        int[] kmf = kmostFrequent.getKfreq(arr, k);
        for (int i: kmf) {
            System.out.println(i);
        }
    }
}