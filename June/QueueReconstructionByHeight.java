class Solution {
    public int[][] reconstructQueue(int[][] people) {
        if(people.length == 0 || people.length == 1) return people;
        
        Arrays.sort(people, (p1, p2) -> p1[0] == p2[0] ? p1[1] - p2[1]: p2[0] - p1[0]);
        List<int[]> res = new ArrayList<>();
        
        for(int i = 0; i < people.length; i++) {
            res.add(people[i][1], new int[]{people[i][0], people[i][1]});
        }
        
        return res.toArray(new int[people.length][2]);
    }
}
