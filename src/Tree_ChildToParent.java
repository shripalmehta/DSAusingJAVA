import java.util.*;

public class Tree_ChildToParent {

    /*
     ** Get the size of the tree with root index rootIndex
     */
    public static Integer getTreeSize(Map<Integer, List<Integer>> parentToChild, Integer rootIndex) {
        Integer result = 0;
        Stack<Integer> nodes = new Stack<>();
        nodes.push(rootIndex);
        while (!nodes.empty()) {
            Integer index = nodes.pop();
            for (Integer childIndex : parentToChild.getOrDefault(index, new ArrayList<>())) {
                nodes.push(childIndex);
                result++;
            }
        }
        System.out.println("Tree Size: " + result);
        return result;
    }

    /*
     ** Find the largest tree.
     */
    public static Integer largestTree(Map<Integer, Integer> immediateParent) {
        Integer maxTreeSize = 0;
        Integer minRootId = 0;
        Map<Integer, List<Integer>> parentToChild = new HashMap<>();
        List<Integer> rootIndexes = new ArrayList<>();
        for (Map.Entry<Integer, Integer> childToParent : immediateParent.entrySet()) {
            Integer childIndex = childToParent.getKey();
            Integer parentIndex = childToParent.getValue();

            System.out.println("Child Index: " + childIndex + ", parent Index: " + parentIndex);

            parentToChild.putIfAbsent(parentIndex, new ArrayList<>());
            parentToChild.get(parentIndex).add(childIndex);
            for (Map.Entry<Integer, List<Integer>> ptC : parentToChild.entrySet()) {
                System.out.print("key: " + ptC.getKey() + " ---> " + ptC.getValue().toString());
            }
            System.out.println("");
            if (!immediateParent.containsKey(parentIndex)) {
                rootIndexes.add(parentIndex);
                System.out.println("parent Index added in root indexes: " + parentIndex);
            }
            System.out.println("--------------------------------------------------------");
        }
        for (Integer rootIndex : rootIndexes) {
            Integer treeSize = getTreeSize(parentToChild, rootIndex);
            System.out.println("Root Indexes : " + rootIndex + " and size of tree : " + treeSize);
            if (treeSize > maxTreeSize) {
                maxTreeSize = treeSize;
                minRootId = rootIndex;
            } else if (treeSize == maxTreeSize) {
                minRootId = Math.min(minRootId, rootIndex);
            }
        }
        return minRootId;
    }

    public static void main(String[] args) {
        Map<Integer, Integer> c2p = new HashMap<>();
        c2p.put(101, 102);
        c2p.put(103, 104);
        largestTree(c2p);
    }
}


