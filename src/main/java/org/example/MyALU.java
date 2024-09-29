package org.example;

public class MyALU extends MyModule{
    public void Calculate(Task t, MyProcessor p) throws Exception{
        if (t.instruction == Instructions.tripleAdd){
            p.SetRegister(p.GetRegister(0) + p.GetRegister(1),2);
        }
        else{
            super.Calculate(t, p);
        }
    }
}
