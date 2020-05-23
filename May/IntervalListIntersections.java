class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        List<int[]> ans = new ArrayList();
        int i = 0, j = 0;

        while (i < A.length && j < B.length) {

            int lo = Math.max(A[i][0], B[j][0]);
            int hi = Math.min(A[i][1], B[j][1]);
            if (lo <= hi)
                ans.add(new int[]{lo, hi});

            if (A[i][1] < B[j][1]) i++;
            else j++;
        }

        return ans.toArray(new int[ans.size()][]);
    }
}

/*
        bi
[0,2][5,10][13,23][24,25]
[1,5][8,12][15,24][25,26]
  sj


compare i[0] j[0]
add bigger to list, inc smaller waala (i || j)
s[1] >= b[0]
true; cur[1] = s[1]
false; remove cur

[1,2] [5,5] [8,10] [15,23] [24,24] [25,25]
                                   cur
*/
