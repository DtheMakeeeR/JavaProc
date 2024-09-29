package org.example;

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
