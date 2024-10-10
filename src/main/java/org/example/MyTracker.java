package org.example;

public class MyTracker extends MyModule{
    public void Calculate(Task t, MyProcessor p) throws Exception{
        if (t.instruction == Instructions.saveTo) {
            p.SetMemory(p.GetRegister(t.arg1), t.arg2);
        }
        else if (t.instruction == Instructions.load) {
            p.SetRegister(p.GetMemory(t.arg1), t.arg2);
        }
        else if (t.instruction == Instructions.move){
            p.SetRegister(p.GetRegister(t.arg1), t.arg2);
        }
        else if (t.instruction == Instructions.init){
            for (int i = 0; i < 1024; i++){
                p.SetMemory(i, i);
            }
        }
        else{
            super.Calculate(t, p);
        }
    }
}
