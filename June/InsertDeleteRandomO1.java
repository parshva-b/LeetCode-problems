class RandomizedSet {
    List<Integer> list;
    Map<Integer, Integer> mapIndex;
    
    /** Initialize your data structure here. */
    public RandomizedSet() {
        list = new ArrayList<>();
        mapIndex = new HashMap<>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(mapIndex.containsKey(val)) return false;
        list.add(val);
        mapIndex.put(val, list.size() - 1);
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        int index = mapIndex.getOrDefault(val, -1);
        if(index == -1) return false;
        Collections.swap(list,index,list.size()-1);
        int swappedWith = list.get(index);
        mapIndex.put(swappedWith,index);
        list.remove(list.size()-1);
        mapIndex.remove(val);
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        int max = list.size();
        int min = 0;
        int ind = (int)(Math.random() * (max - min) + min);
        return list.get(ind);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
