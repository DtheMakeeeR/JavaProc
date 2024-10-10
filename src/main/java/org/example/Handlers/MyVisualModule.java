package org.example.Handlers;

import org.example.Instructions;
import org.example.Processors.MyProcessor;
import org.example.Task;

public class MyVisualModule extends MyModule{
    public void Calculate(Task t, MyProcessor p) throws Exception{
        if (t.instruction == Instructions.show){
            for (int i = 0; i < 4; i++){
                System.out.println(p.GetRegister(i));
            }
        }
        else{
            super.Calculate(t, p);
        }
    }
}
