class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        if (node1 == node2)
            return node1;
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(node1);
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(node2);
        while ((edges[node1] != -1 && !set1.contains(edges[node1])) || (edges[node2] != -1 && !set2.contains(edges[node2]))) {
            if (edges[node1] != -1 && !set1.contains(edges[node1])) {
                node1 = edges[node1];
                set1.add(node1);
            }
            if (edges[node2] != -1 && !set2.contains(edges[node2])) {
                node2 = edges[node2];
                set2.add(node2);
            }
            if (set1.contains(node2) && set2.contains(node1))
                return Math.min(node1, node2);
            if (set1.contains(node2))
                return node2;
            if (set2.contains(node1))
                return node1;
        }
        return -1;
    }
}
