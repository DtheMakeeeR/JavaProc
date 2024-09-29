package org.example;

public class MyProcessor implements IProcessor{
    int[] memory = new int[1024];
    int[] registers = new int[4];
    MyModule modules;
    public MyProcessor(){
        modules = new MyALU();
        modules.Add(new MyTracker()).Add(new MyVisualModule());
        for (int i = 0; i < 1024; i++){
            memory[i] = i;
        }
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
