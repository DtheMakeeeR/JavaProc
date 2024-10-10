package org.example.Handlers;

import org.example.Processors.MyProcessor;
import org.example.Task;

public class MyModule {
    MyModule next;
    public MyModule Add(MyModule _next){
        next = _next;
        return _next;
    }
    public void Calculate(Task t, MyProcessor p) throws Exception{
        if (next != null){
            next.Calculate(t, p);
        }
        else{
            throw new Exception("Can't process");
        }
    }
}
