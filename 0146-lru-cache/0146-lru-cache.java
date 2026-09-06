class LRUCache {
    HashMap<Integer,Integer> map = new HashMap<>();
    LinkedList<Integer> list = new LinkedList<>();
    int cap;

    public LRUCache(int capacity) {
       cap = capacity; 
    }
    
    public int get(int key) {
        if (!map.containsKey(key))
            return -1;

        list.remove ((Integer) key);
        list.addFirst(key);

        return map.get(key);        
    }    
    public void put(int key, int value) {
        if(map.containsKey(key))
        list.remove((Integer)key);

        else if (map.size() == cap){
            int lru = list.removeLast();
            map.remove(lru);
        }
        map.put(key,value);
        list.addFirst(key);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */