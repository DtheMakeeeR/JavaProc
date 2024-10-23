package org.example.Handlers;

import org.example.Instructions;
import org.example.Processors.MyProcessor;
import org.example.Task;

public class MyTracker extends MyModule{
    public void Calculate(Task t, MyProcessor p) throws Exception{
        if (t.instruction == Instructions.saveTo) {
            p.SetMemory(p.GetRegister(t.address1), t.address2);
        }
        else if (t.instruction == Instructions.load) {
            p.SetRegister(p.GetMemory(t.address1), t.address2);
        }
        else if (t.instruction == Instructions.move){
            p.SetRegister(p.GetRegister(t.address1), t.address2);
        }
        else if (t.instruction == Instructions.init){
            p.SetMemory(t.address2, t.address1);
        }
        else{
            super.Calculate(t, p);
        }
    }
}
