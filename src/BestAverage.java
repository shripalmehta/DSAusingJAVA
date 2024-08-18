import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BestAverage {
    int getBestAvg(String[][] marks) {
        Map<String, List<Integer>> map = new HashMap<>();
        int maxAvg = 0, avg = 0;

        for (String[] mark : marks) {
            if (!map.containsKey(mark[0])) {
                map.put(mark[0], new ArrayList<>());
                map.get(mark[0]).add(0);
                map.get(mark[0]).add(0);
            }
            map.get(mark[0]).set(0, map.get(mark[0]).get(0) + Integer.parseInt(mark[1]));
            map.get(mark[0]).set(1, map.get(mark[0]).get(1) + 1);

            avg = map.get(mark[0]).get(0) / map.get(mark[0]).get(1);
            if (avg > maxAvg) {
                maxAvg = avg;
            }
        }

        return maxAvg;
    }


    public static void main(String[] args) {
        String[][] studentMarks = new String[][] {
                {"Bob", "87"},
                {"Mike", "35"},
                {"Bob", "252"},
                {"Jason", "35"},
                {"Mike", "55"},
                {"Jessica", "99"}
        };

        BestAverage bestAverage = new BestAverage();
        int best = bestAverage.getBestAvg(studentMarks);
        System.out.println(best);
    }
}
