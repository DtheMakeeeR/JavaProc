package org.example.Processors;

import org.example.Task;

public class PBuilder {
    public IProcessor Build(){
        return new MyProcessor();
    }
}
