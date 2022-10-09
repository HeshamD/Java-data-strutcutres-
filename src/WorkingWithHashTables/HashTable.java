package WorkingWithHashTables;

import java.util.LinkedList;
import java.util.List;

public class HashTable {
    //create hashTable
    //put(k,v)
    //get(k) return v
    //remove(k) -> removes it's value
    // k: int
    // values: string
    // Collisions: Chaining strategy

    private class Entry{
        private int k;
        private String v;

        public Entry(int k, String v) {
            this.k = k;
            this.v = v;
        }
    }

    private LinkedList<Entry>[] entries = new LinkedList[5];

    public void put(int key,String value){
        var index = hash(key);
        if(entries[index] == null){
            entries[index] = new LinkedList<>();
        }
        var bucket = entries[index];

        for(var entry:bucket){
            if(entry.k == key){
                entry.v = value;
                return;
            }
        }
        var entry = new Entry(key,value);
        entries[index].addLast(entry);
    }

    private int hash(int key){
        return key%entries.length;
    }


}
