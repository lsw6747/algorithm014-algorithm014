class LRUCache {
    class Node {
        int val;
        int key;
        Node next;
        Node prev;
        public Node(){}
        public Node(int key, int val){
            this.key = key;
            this.val = val;
        }
    }
    private int size;
    private int capacity;
    private Map<Integer, Node> cache = new HashMap<>();
    private Node head,tail;
    public LRUCache(int capacity) {
        size = 0;
        this.capacity = capacity;
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        Node node = cache.get(key);
        if (node == null) {
            return -1;
        }
        moveToHead(node);
        return node.val;
    }

    private void moveToHead(Node node) {
        removeNode(node);
        addToHead(node);
    }

    private void addToHead(Node node) {
        head.next.prev = node;
        node.next = head.next;
        head.next = node;
        node.prev = head;
    }

    private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void put(int key, int value) {
        Node node = cache.get(key);
        if (node == null) {
            Node newNode = new Node(key, value);
            cache.put(key, newNode);
            addToHead(newNode);
            size++;
            if (size > capacity) {
                Node tail = removeTail();
                cache.remove(tail.key);
                size--;
            }
        } else {
            node.val = value;
            moveToHead(node);
        }
    }

    private Node removeTail() {
        Node tail = this.tail.prev;
        removeNode(tail);
        return tail;
    }
}