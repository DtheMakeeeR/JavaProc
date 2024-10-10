package org.example.Iterators;

import org.example.Processors.IProcessor;
import org.example.Task;

public class MyExecuter {

    IProcessor p;
    public MyExecuter(IProcessor _p){
        p = _p;
    }
    public void Run(MyProgram pr) throws Exception{
        for(Task t: pr){
            p.Run(t);
        }
    }
}
