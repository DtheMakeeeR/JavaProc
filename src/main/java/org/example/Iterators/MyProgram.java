package org.example.Iterators;

import org.example.Instructions;
import org.example.Task;

import java.util.*;

public class MyProgram implements Iterable<Task>{
    ArrayList<Task> prog = new ArrayList<Task>();
    @Override
    public Iterator<Task> iterator() {
        return prog.iterator();
    }
    Set<Instructions> GetUniqueInstructions(){
        Set<Instructions> set = new HashSet<>();
        for(Task t: prog){
            set.add(t.getIns());
        }
        return set;
    }
    ArrayList<Instructions> Count(){
        HashMap<Instructions, Integer> InsCount = new HashMap<>();
        Set<Instructions> set = GetUniqueInstructions();
        for (Instructions i: set){
            InsCount.put(i, 0);
        }
        for (Task t: prog){
            //InsCount.put(t.getInstruction(), InsCount.get(t.getInstruction())+1);
            InsCount.replace(t.getIns(), InsCount.get(t.getIns())+1);
        }
        ArrayList<Instructions> inss = new ArrayList<>();
        for (Instructions i:InsCount.keySet()){
            inss.add(i);
        }
        Comparator<Instructions> comparator = new Comparator<Instructions>() {
            @Override
            public int compare(Instructions o1, Instructions o2) {
                return InsCount.get(o2).compareTo(InsCount.get(o1));
            }
        };
        Collections.sort(inss, comparator);
        return inss;
    }
    public void TypeSorted(){
        //Instructions[] inss = new Instructions[InsCount.size()];
        ArrayList<Instructions> inss = Count();
        for (Instructions i: inss){
            System.out.println(i);
        }
    }
    public void MostCommon(){
        ArrayList<Instructions> inss = Count();
        System.out.println(inss.getFirst());
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
