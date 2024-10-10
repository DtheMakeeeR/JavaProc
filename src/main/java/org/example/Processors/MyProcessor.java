package org.example.Processors;

import org.example.Handlers.MyALU;
import org.example.Handlers.MyModule;
import org.example.Handlers.MyTracker;
import org.example.Handlers.MyVisualModule;
import org.example.Task;

public class MyProcessor implements IProcessor{
    int[] memory = new int[1024];
    int[] registers = new int[4];
    MyModule modules;
    public MyProcessor(){
        modules = new MyALU();
        modules.Add(new MyTracker()).Add(new MyVisualModule());
    }
    @Override
    public void Run(Task t) throws Exception{
        modules.Calculate(t, this);
    }
    void SetRegister(int value, int number) throws Exception{
        if ((number < 0) || (number > 3)) throw new Exception("Index error");
        registers[number] = value;
    }
    int GetRegister(int number) throws Exception{
        if ((number < 0) || (number > 3)) throw new Exception("Index error");
        return registers[number];
    }
    void SetMemory(int value, int number) throws Exception{
        if ((number < 0) || (number > 1023)) throw new Exception("Index error");
        memory[number] = value;
    }
    int GetMemory(int number) throws Exception{
        if ((number < 0) || (number > 1023)) throw new Exception("Index error");
        return memory[number];
    }
}
