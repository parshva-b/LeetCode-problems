class LRUCache {
    final Node head = new Node();
    final Node tail = new Node();
    int max;
    Map<Integer, Node> cache = new HashMap<>();
    
    public LRUCache(int capacity) {
        max = capacity;
        head.next = tail;
        tail.prev= head;
    }
    
    public int get(int key) {
        int result = -1;
        Node node = cache.get(key);
        if(node != null) {
            remove(node);
            result = node.val;
            add(node);
        }
        return result;
    }
    
    public void put(int key, int value) {
        Node node = cache.get(key);
        if(node != null) {
            remove(node);
            node.val = value;
            add(node);
        }
        else {
            if(cache.size() == max) {
                cache.remove(tail.prev.key);
                remove(tail.prev);
            }
            
            Node new_node = new Node();
            new_node.key = key;
            new_node.val = value;
            
            add(new_node);
            cache.put(key, new_node);
        }
    }
    
    private void add(Node node) {
        Node headNext = head.next;
        node.next = headNext;
        head.next = node;
        node.prev = head;
        headNext.prev = node;
    }
    
    private void remove(Node node) {
        Node nodePrev = node.prev;
        Node nodeNext = node.next;
        
        nodePrev.next = nodeNext;
        nodeNext.prev = nodePrev;
    }
    
    class Node {
        Node prev;
        int key, val;
        Node next;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */