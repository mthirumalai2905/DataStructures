package Arrays;

public class ImplementingHashSetUsingArrays {
    class MyHashSet {
        private boolean[] set;
    
        public MyHashSet() {
            set  = new boolean[1000001];
        }
        
        public void add(int key) {
            set[key] = true;
        }
        
        public void remove(int key) {
            set[key] = false;
        }
        
        public boolean contains(int key) {
            return set[key];
        }
    }
}
