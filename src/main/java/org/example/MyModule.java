package org.example;

public class MyModule {
    MyModule next;
    MyModule Add(MyModule _next){
        next = _next;
        return _next;
    }
    void Calculate(Task t, MyProcessor p) throws Exception{
        if (next != null){
            next.Calculate(t, p);
        }
        else{
            throw new Exception("Can't process");
        }
    }
}
