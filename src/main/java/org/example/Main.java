package org.example;

import org.example.Iterators.MyExecuter;
import org.example.Iterators.MyProgram;
import org.example.Processors.IProcessor;
import org.example.Processors.PBuilder;

public class Main {
    public static void main(String[] args) {
        IProcessor p = new PBuilder().Build();

        MyProgram pr = new MyProgram();

        pr.Add(new Task(Instructions.init, 0, 10));
        pr.Add(new Task(Instructions.init, 10, 5));
        pr.Add(new Task(Instructions.init, 50, 5));
        pr.Add(new Task(Instructions.load, 0, 0));
        pr.Add(new Task(Instructions.load, 10, 1));
        pr.Add(new Task(Instructions.add, 0, 1, 2));
        pr.Add(new Task(Instructions.show));

        //pr.Print();
        for (Task t: pr) System.out.println(t);
        System.out.println(pr.SortedIns());
        System.out.println(pr.MostCommon());
        pr.MemoryRange();

        MyExecuter exe = new MyExecuter(p);
        try {
            exe.Run(pr);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}