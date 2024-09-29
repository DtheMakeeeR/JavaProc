package org.example;

public class MyTracker extends MyModule{
    public void Calculate(Task t, MyProcessor p) throws Exception{
        if (t.instruction == Instructions.saveTo) {
            p.SetMemory(p.GetRegister(t.args[0]), t.args[1]);
        }
        else if (t.instruction == Instructions.load) {
            p.SetRegister(p.GetMemory(t.args[0]), t.args[1]);
        }
        else{
            super.Calculate(t, p);
        }
    }
}
