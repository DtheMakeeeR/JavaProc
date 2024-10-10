package org.example.Iterators;

import org.example.Task;

import java.util.ArrayList;
import java.util.Iterator;

public class MyProgram implements Iterable<Task>{
    ArrayList<Task> prog = new ArrayList<Task>();
    @Override
    public Iterator<Task> iterator() {
        return prog.iterator();
    }
    public void Add(Task t){
        prog.add(t);
    }
}
