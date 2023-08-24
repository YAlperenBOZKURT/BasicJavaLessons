package Generic;

public class GenericInterfaceService<K,V> implements GenericInterface<K,V>{


    private K key;

    private V value;

    public GenericInterfaceService(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}
