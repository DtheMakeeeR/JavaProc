package org.example;

public class Task {
    Instructions instruction;
    int[] args;
    public Task(Instructions ins, int... args_){
        args = args_.clone();
        instruction = ins;
    }
}
