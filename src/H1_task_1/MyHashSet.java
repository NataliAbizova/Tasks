
package H1_task_1;

import java.util.HashMap;

public class MyHashSet<E> {

    private transient HashMap<E, Object> map;
    private static final Object PRESENT = new Object();

    public MyHashSet() {
        map = new HashMap<>();
    }

    public boolean add(E element) {
        return map.put(element, PRESENT) == null;
    }
    public int size(){
        return map.size();
    }

    public boolean remove(Object object) {
        return map.remove(object) == PRESENT;
    }
}

