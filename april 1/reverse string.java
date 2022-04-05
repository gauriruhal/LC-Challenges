class Solution {
  public void reverseString(char[] s) {
      helper(0, s);
  }

  private void helper(int index, char[] s) {
    if(index == s.length)
      return;

    char c = s[index];
    helper(index+1, s);
    s[s.length-1-index] = c;
  }
}
