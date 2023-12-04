class Solution {
  public int minTimeToVisitAllPoints(int[][] points) {
    var time = 0;

    for (var i=1; i < points.length; i++) {
      time +=
        Math.max(
          Math.abs(points[i][0] - points[i-1][0]),
          Math.abs(points[i][1] - points[i-1][1]));
    }
    return time;
  }

