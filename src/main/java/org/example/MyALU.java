package org.example;

public class MyALU extends MyModule{
    public void Calculate(Task t, MyProcessor p) throws Exception{
        if (t.instruction == Instructions.tripleAdd){
            p.SetRegister(p.GetRegister(0) + p.GetRegister(1),2);
        }
        else if (t.instruction == Instructions.add){
            p.SetRegister(p.GetRegister(t.arg1) + p.GetRegister(t.arg2), t.arg3);
        }
        else if (t.instruction == Instructions.sub){
            p.SetRegister(p.GetRegister(t.arg1) - p.GetRegister(t.arg2), t.arg3);
        }
        else if (t.instruction == Instructions.mult){
            p.SetRegister(p.GetRegister(t.arg1) * p.GetRegister(t.arg2), t.arg3);
        }
        else{
            super.Calculate(t, p);
        }
    }
}
