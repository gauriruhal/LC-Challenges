class Solution {
    ArrayList<Integer>list=new ArrayList<>();
    public Solution(ListNode head) {
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
    }
    
    public int getRandom() {
        double random=Math.random()*list.size();
        return list.get((int)random);
    }
}
