package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        IProcessor p = new MyProcessor();
        try{
        p.Run(new Task(Instructions.load, 9, 0 ));
        p.Run(new Task(Instructions.load, 10, 1 ));
        p.Run(new Task(Instructions.tripleAdd));
        p.Run(new Task(Instructions.saveTo, 2, 6 ));
        p.Run(new Task(Instructions.load, 6, 3 ));
        p.Run(new Task(Instructions.show, 21, 421));
        }
        catch (Exception e1){
            System.out.println(e1.getMessage());
        }
    }
}