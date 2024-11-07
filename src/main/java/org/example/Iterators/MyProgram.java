package org.example.Iterators;

import org.example.Instructions;
import org.example.Task;

import java.util.*;
import java.util.stream.Collectors;

public class MyProgram implements Iterable<Task>{
    ArrayList<Task> prog = new ArrayList<Task>();
    @Override
    public Iterator<Task> iterator() {
        return prog.iterator();
    }
    private Set<Instructions> GetUniqueInstructions(){
//        Set<Instructions> set = new HashSet<>();
//        for(Task t: prog){
//            set.add(t.getIns());
//        }
//        return set;
//        return prog.stream().collect(HashSet::new, (v1, v2)->{
//            v1.add(v2.getIns());}, AbstractCollection::addAll);
          return prog.stream().map(Task::getIns).collect(Collectors.toSet());
    }
    public ArrayList<Instructions> SortedIns(){
        HashMap<Instructions, Integer> InsCount = new HashMap<>();
        Set<Instructions> set = GetUniqueInstructions();
        for (Instructions i: set){
            InsCount.put(i, 0);
        }
        for (Task t: prog){
            InsCount.replace(t.getIns(), InsCount.get(t.getIns())+1);
        }
        ArrayList<Instructions> ins = new ArrayList<>(InsCount.keySet());

//        Comparator<Instructions> comparator = new Comparator<Instructions>() {
//            @Override
//            public int compare(Instructions o1, Instructions o2) {
//                return InsCount.get(o2).compareTo(InsCount.get(o1));
//            }
//        };
//        ins.sort(comparator);
        ins.sort((o1, o2)->InsCount.get(o2).compareTo(InsCount.get(o1)));
        return ins;
    }
    public Instructions MostCommon(){
        ArrayList<Instructions> ins = SortedIns();
        return ins.getFirst();
    }
    public void MemoryRange(){
        int min = 1025, max = -1;
        for(Task t: prog){
            if (t.getIns() == Instructions.load){
                if (t.getAddress1()>max) max = t.getAddress1();
                if (t.getAddress1()<min) min = t.getAddress1();
            }
            if (t.getIns() == Instructions.saveTo){
                if (t.getAddress2()>max) max = t.getAddress2();
                if (t.getAddress2()<min) min = t.getAddress2();
            }
            if (t.getIns() == Instructions.init){
                if (t.getAddress1()>max) max = t.getAddress1();
                if (t.getAddress1()<min) min = t.getAddress1();
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
