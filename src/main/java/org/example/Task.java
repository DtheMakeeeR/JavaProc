package org.example;

public class Task {
    public Instructions instruction;
    public int arg1 = -1;
    public int arg2 = -1;
    public int arg3 = -1;
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

    public Instructions getIns() {
        return instruction;
    }

    public int getArg1() {
        return arg1;
    }

    public int getArg2() {
        return arg2;
    }

    public int getArg3() {
        return arg3;
    }
    @Override
    public String toString() {
        return  instruction +
                " " + (arg1>=0?arg1:" ") +
                " " + (arg2>=0?arg2:" ") +
                " " + (arg3>=0?arg3:" ") ;
    }
}
