package io.turntabl.main;

import java.util.LinkedList;
import java.util.List;

public class Bag<E> {
    private List<E> collections = new LinkedList<>();

    public void add (E item){
        this.collections.add(item);
    }

    public void remove(E item){
        this.collections.remove(item);
    }

    public void clear(){
        this.collections.clear();
    }

}
