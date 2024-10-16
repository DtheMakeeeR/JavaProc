package org.example.Iterators;

import org.example.Instructions;
import org.example.Task;

import javax.swing.*;
import java.util.*;

public class MyProgram implements Iterable<Task>{
    ArrayList<Task> prog = new ArrayList<Task>();
    @Override
    public Iterator<Task> iterator() {
        return prog.iterator();
    }
    private Set<Instructions> GetUniqueInstructions(){
        Set<Instructions> set = new HashSet<>();
        for(Task t: prog){
            set.add(t.getIns());
        }
        return set;
    }
    private ArrayList<Instructions> Count(){
        HashMap<Instructions, Integer> InsCount = new HashMap<>();
        Set<Instructions> set = GetUniqueInstructions();
        for (Instructions i: set){
            InsCount.put(i, 0);
        }
        for (Task t: prog){
            //InsCount.put(t.getInstruction(), InsCount.get(t.getInstruction())+1);
            InsCount.replace(t.getIns(), InsCount.get(t.getIns())+1);
        }
        ArrayList<Instructions> ins = new ArrayList<>(InsCount.keySet());

        Comparator<Instructions> comparator = new Comparator<Instructions>() {
            @Override
            public int compare(Instructions o1, Instructions o2) {
                return InsCount.get(o2).compareTo(InsCount.get(o1));
            }
        };
        ins.sort(comparator);
        return ins;
    }
    public void TypeSorted(){
        //Instructions[] ins = new Instructions[InsCount.size()];
        ArrayList<Instructions> ins = Count();
        for (Instructions i: ins){
            System.out.println(i);
        }
    }
    public void MostCommon(){
        ArrayList<Instructions> ins = Count();
        System.out.println(ins.getFirst());
    }
    public void MemoryRange(){
        int min = 1025, max = -1;
        for(Task t: prog){
            if (t.getIns() == Instructions.load){
                if (t.getArg1()>max) max = t.getArg1();
                if (t.getArg1()<min) min = t.getArg1();
            }
            if (t.getIns() == Instructions.saveTo){
                if (t.getArg2()>max) max = t.getArg2();
                if (t.getArg2()<min) min = t.getArg2();
            }
        }
        System.out.println("MemoryRange:"+"("+min+","+max+")");
    }
    public void Add(Task t){
        prog.add(t);
    }
    public void Print(){
        for(Task t: prog){
            System.out.println(t);
        }
    }
}
