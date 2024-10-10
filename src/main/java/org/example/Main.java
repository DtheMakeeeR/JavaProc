package org.example;

import org.example.Iterators.MyExecuter;
import org.example.Iterators.MyProgram;
import org.example.Processors.IProcessor;
import org.example.Processors.PBuilder;

public class Main {
    public static void main(String[] args) {
        IProcessor p = new PBuilder().Build();
        /*try{
        p.Run(new Task(Instructions.load, 9, 0 ));
        p.Run(new Task(Instructions.load, 10, 1 ));
        p.Run(new Task(Instructions.tripleAdd));
        p.Run(new Task(Instructions.saveTo, 2, 6 ));
        p.Run(new Task(Instructions.load, 6, 3 ));
        p.Run(new Task(Instructions.show, 21, 421));
        }
        catch (Exception e1){
            System.out.println(e1.getMessage());
        }*/
        MyProgram pr = new MyProgram();
        pr.Add(new Task(Instructions.init, 10, 0));
        pr.Add(new Task(Instructions.init, 5, 1));
        pr.Add(new Task(Instructions.load, 0, 0));
        pr.Add(new Task(Instructions.load, 1, 1));
        pr.Add(new Task(Instructions.add, 0, 1, 2));
        pr.Add(new Task(Instructions.show));
        //pr.Print();
        pr.TypeSorted();
        pr.MostCommon();
        MyExecuter exe = new MyExecuter(p);
        try {
            exe.Run(pr);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}