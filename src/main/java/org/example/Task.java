package org.example;

public class Task {
    Instructions instruction;
    int arg1 = -1;
    int arg2 = -1;
    int arg3 = -1;
    public Task(Instructions ins){
        instruction = ins;
    }
    public Task(Instructions ins, int _arg1, int _arg2){
        arg1 = _arg1;
        arg2 = _arg2;
        instruction = ins;
    }
    public Task(Instructions ins, int _arg1, int _arg2, int _arg3){
        arg1 = _arg1;
        arg2 = _arg2;
        arg3 = _arg3;
        instruction = ins;
    }
}
