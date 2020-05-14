class Trie {
    TrieNode root;
    
    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode cur = root;
        
        for(int i = 0; i < word.length(); i++) {
            char x = word.charAt(i);
            if(cur.children.get(x) == null) {
                cur.children.put(x, new TrieNode());   
            }
            cur = cur.children.get(x);
        }
        cur.isEnd = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode cur = root;
        for(int i = 0; i < word.length(); i++) {
            char x = word.charAt(i);
            cur = cur.children.get(x);
            if(cur == null) return false;
        }
        
        return cur.isEnd == true;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode cur = root;
        for(int i = 0; i < prefix.length(); i++) {
            char x = prefix.charAt(i);
            cur = cur.children.get(x);
            if(cur == null) return false;
        }
        
        return true;
    }
    
    class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
        boolean isEnd;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */