package org.example.Processors;

import org.example.Task;

public class PBuilder implements IProcessor{
    @Override
    public void Run(Task t) throws Exception {
    }
    public IProcessor Build(){
        return new MyProcessor();
    }
}
